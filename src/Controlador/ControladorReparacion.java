package Controlador;

import DAO.DaoRepaRepu;
import DAO.DaoReparacion;
import DAO.DaoRepuesto;
import Modelo.RepaRepu;
import Modelo.Reparacion;
import Modelo.Validaciones;
import Vista.GestionReparaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ControladorReparacion implements ActionListener,KeyListener
{
    private GestionReparaciones repa;
    private DefaultTableModel modelo;
    private Boolean Existe=false;
    public ControladorReparacion() throws SQLException 
    {
      repa=new GestionReparaciones();
      repa.agregarListener(this);
      repa.setVisible(true);
      repa.setSize(786, 700);
      modelo = new  DefaultTableModel();
      modelo.addColumn("Código");
      modelo.addColumn("Nombre");
      modelo.addColumn("Precio");
      repa.getjTableProductos().setModel(modelo);
      llenarComboRepuesto();
      repa.getTxtCodigo().requestFocusInWindow();
      repa.getBtnEliminar().setEnabled(false);
      repa.getBtnGuardar().setEnabled(false);
      repa.getBtnModificar().setEnabled(false);
      TraerCodigoReparacion();
      
      
      
      Enabled(false);
      //**** KeyListener*****************
      
      repa.getTxtCodigo().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCodigo(e);   
              }    
       }
    );
                  
    repa.getTxtNombre().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaNombre(e);   
              }    
       }
    );               
    //***************
     repa.getTxtDescripcion().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaDescripcion(e);   
              }    
       }
    );               
    //***************
     repa.getTxtCosto().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCosto(e);   
              }    
       }
    );
    
      //*****Fin de los KeyListener
    }      
//-------------------------------------------------------

private void TraerCodigoReparacion() throws SQLException
{
  DaoReparacion daoReparacion=new DaoReparacion();  
  repa.getTxtCodigo().setText(daoReparacion.reparacionSiguiente());
}  

private void ValidaCodigo(KeyEvent e)
{
    String Cadena;
    
    Cadena=repa.getTxtCodigo().getText();
    if (Cadena.length()==8)
      {   
        e.consume();  
        return;
      }    
} 
private void ValidaNombre(KeyEvent e)
{
    String Cadena;
    
    Cadena=repa.getTxtNombre().getText();
    if (Cadena.length()==20)
      {   
        e.consume();  
        return;
      }    
} 
//------------------    
private void ValidaDescripcion(KeyEvent e)
{
    String Cadena;
    
    Cadena=repa.getTxtNombre().getText();
    if (Cadena.length()==50)
      {   
        e.consume();  
        return;
      }    
} 
//------------------
private void ValidaCosto(KeyEvent e)
{
    String Cadena;
    char Caracter;
    Cadena=repa.getTxtCosto().getText();
    if (Cadena.length()==11)
      {   
        e.consume();  
        return;
      }  
    
    Caracter=e.getKeyChar();
    
    if (Caracter =='.')
      return;  
        
   Caracter=e.getKeyChar();
    if (Caracter<'0'|| Caracter>'9')
      e.consume();
    
}        
//------------------   

private void llenarComboRepuesto() throws SQLException //llena el combo
{                                                      //con las descripcion de
                                                       // los repuestos

  ResultSet regisRepuesto;
  String infoBD;
  DaoRepuesto dAORepuesto=new DaoRepuesto();
             repa.getCmbRepa().removeAllItems();
             repa.getCmbRepa().addItem("Seleccione");
             regisRepuesto=dAORepuesto.ConsultarRepuesto();
             while (regisRepuesto.next())
              {
                infoBD=regisRepuesto.getString("codigorepu").trim()+"-";
                infoBD=infoBD+regisRepuesto.getString("nombrerepu").trim()+"-";
                infoBD=infoBD+regisRepuesto.getString("precio").trim();
                repa.getCmbRepa().addItem(infoBD); 
              }  
          
  }

private void Enabled(boolean status)
{ 
  repa.getTxtCodigo().setEditable(!status);
  repa.getTxtDescripcion().setEditable(status);
  repa.getTxtCosto().setEditable(status);
  repa.getTxtNombre().setEditable(status);
  repa.getCmbRepa().setEnabled(true);
  repa.getBtnAdd().setEnabled(true);
  repa.getBtnDe().setEnabled(true);
}        
//------------------

private void Cancelar()
{
  Existe=false;
  repa.getTxtNombre().setText("");
  repa.getTxtDescripcion().setText("");
  repa.getTxtCosto().setText("");
  repa.getTxtDescripcion().requestFocusInWindow();
  Enabled(true);
}   
//-----------------------
private void BuscarReparacion() throws SQLException
{
    String Cadena;
    Cadena= repa.getTxtCodigo().getText();
    
    if(Cadena.length()>0)
    {   repa.getTxtNombre().setText("");
        repa.getTxtDescripcion().setText("");
        repa.getTxtCosto().setText("");
        repa.getCmbRepa().setSelectedIndex(0);
        
        ResultSet regis;
        DaoReparacion daoRepa=new DaoReparacion();
        
        regis=daoRepa.BuscarReparacion(Cadena);
        
        if(regis.next())
        {
            Existe= true;
        
        if(regis.getString("status").trim().equals("activo"))
         {
           
           repa.getTxtNombre().setText(regis.getString("nombrerepa").trim());
           repa.getTxtDescripcion().setText(regis.getString("descripcionrepa").trim());           
           repa.getTxtCosto().setText(regis.getString("costorepa").trim());
           repa.getBtnEliminar().setEnabled(true);
           repa.getBtnGuardar().setEnabled(true);
           repa.getBtnModificar().setEnabled(true);
           repa.getCmbRepa().setEnabled(false);
           repa.getBtnAdd().setEnabled(false);
           repa.getBtnDe().setEnabled(false);
           
           
           Integer Fila =0;
           DaoRepaRepu daoR = new DaoRepaRepu();
           ResultSet regist;
           String cadena = repa.getTxtCodigo().getText().trim(); //repara.getCodigo();// extrae el codigo de la reparación
           regist=daoR.ConsultarRepaRepu(cadena);
            
           
          if (regist.next()) 
            {   
                do       
                { 
               
                 String []Datos = new String[3];
   
                Datos[0]=regist.getString("codigo_repu");
                Datos[1]=regist.getString("nombrerepu");
                Datos[2]=regist.getString("precio");
           
                modelo.addRow(Datos);
                 Fila++;
               }while (regist.next());
            }
          } 
        else{
           Existe=true;
           Validaciones.Aviso("La reparación está eliminada", "ATENCIÓN");
           repa.getBtnEliminar().setEnabled(false);
           repa.getBtnGuardar().setEnabled(false);
           repa.getBtnModificar().setEnabled(false);
           repa.getBtnAdd().setEnabled(false);
           repa.getBtnDe().setEnabled(false);
           repa.getCmbRepa().setEnabled(false);
           repa.getTxtCodigo().setText("");
           Cancelar();
         } 
        }else{ 
           Existe=false;
           int resp=Validaciones.DialogConfirm("La reparación no existe, ¿Desea registrarla?", "ATENCIÓN");
           switch (resp)
            {
         case 0: repa.getTxtNombre().requestFocusInWindow(); 
                 Enabled(true);
                 repa.getBtnGuardar().setEnabled(true);
                 repa.getBtnModificar().setEnabled(false);
                 repa.getBtnAdd().setEnabled(true);
                 repa.getBtnDe().setEnabled(true);
                 repa.getCmbRepa().setEnabled(true);
                 break;
         
         case 1: Cancelar();
                 break;
            }
     repa.getTxtCodigo().requestFocusInWindow();
     }
  }
}    

//----------------------------------------------------------------------

private void AgregarDetallesTabla()
{  
   String []Datos = new String[3];
   String contenidoCombo; 
   String [] arrContenidoCombo; 
   
   contenidoCombo=(String)repa.getCmbRepa().getSelectedItem();
   
   arrContenidoCombo=contenidoCombo.split("-");
   
   Datos[0]=arrContenidoCombo[0];
   Datos[1]=arrContenidoCombo[1];
   Datos[2]=arrContenidoCombo[2];       
   modelo.addRow(Datos);
 
   repa.getCmbRepa().removeItem(contenidoCombo);
   
}
//--------------------------------------------------------------------------
private void EliminarDetallesTabla() throws SQLException
{  
    String info;
    String [] arrContenidoFila;
    int filaselecionada = repa.getjTableProductos().getSelectedRow();
     
    if(filaselecionada>=0)
    {  
        info=(String)modelo.getValueAt(filaselecionada,0)+"-";
        info=info+(String)modelo.getValueAt(filaselecionada,1)+"-";
        info=info+(String)modelo.getValueAt(filaselecionada,2);
        arrContenidoFila=info.split("-");
      
             boolean exists = false;
             
             for(int index = 0; index<repa.getCmbRepa().getItemCount() && !exists; index++) 
             {
                String codigo = (String)repa.getCmbRepa().getItemAt(index);
                String cod= codigo.substring(0,6);
                  cod=cod.trim();
                  if (arrContenidoFila[0].trim().equals(cod)) 
                 {
                    modelo.removeRow(filaselecionada);
                    exists = true; 
                }
             }
              if (!exists) 
              {
                  repa.getCmbRepa().addItem(info);
                  modelo.removeRow(filaselecionada);
              }  
    }else
    {
        Validaciones.Aviso("La tabla está vacía o no selecciono una fila", "SISTEMA");
    }

}
//--------------------------------------------------------------
private void Grabar() throws SQLException
{
  String Cadena;
  Reparacion repara;
 
  Cadena=repa.getTxtNombre().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Nombre Vacio", "SISTEMA"); 
     repa.getTxtNombre().requestFocusInWindow();
     return;
   }       

Cadena=repa.getTxtDescripcion().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Descripcion Vacia", "SISTEMA"); 
     repa.getTxtDescripcion().requestFocusInWindow();
     return;
   }       
  
  Cadena=repa.getTxtCosto().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Costo vacio", "SISTEMA"); 
     repa.getTxtCosto().requestFocusInWindow();
     return;
   }
  
  
   
   float Costo = Validaciones.CStr_Float(repa.getTxtCosto().getText().trim()); 
  
  repara=new Reparacion(repa.getTxtCodigo().getText().trim(), 
                  repa.getTxtNombre().getText().trim(),
                  repa.getTxtDescripcion().getText().trim(),       
                  Costo,
                  "activo");
  
   DaoReparacion daoRep=new DaoReparacion();
      if(Existe)
      {
       daoRep.ModificarReparacion(repara);
       String codigorepu;
       Float precio = 0.0f;
       RepaRepu re = null;
       DaoRepaRepu daoR = new DaoRepaRepu();
       ResultSet regis;
       String cadena = repa.getTxtCodigo().getText().trim(); //repara.getCodigo();// extrae el codigo de la reparación
       regis=daoR.ConsultarRepaRepu(cadena);
       
        if (regis.next()) 
        {
            do       
            {
                daoR.EliminarRepaRepu(cadena);
            }while (regis.next());
        }
        
        for (int i=0;i<repa.getjTableProductos().getRowCount();i++) 
        {   
       codigorepu=(String)repa.getjTableProductos().getValueAt(i, 0);
       codigorepu=codigorepu.trim();
       
       String nombrerepu=(String)repa.getjTableProductos().getValueAt(i, 1);
       nombrerepu=nombrerepu.trim();
       
       String precior=(String)repa.getjTableProductos().getValueAt(i, 2);
       precior=precior.trim();
       
       precio =Validaciones.CStr_Float(precior);
       
       String codRepa=daoR.ReparepuSiguiente();
       codRepa=codRepa.trim();
       
       re=new RepaRepu(codRepa, //clave principal propio de la tabla repa_repu
                      repa.getTxtCodigo().getText().trim(),//codigo de la reparacion
                      codigorepu, //codigo del repuesto
                      nombrerepu,//nombre repuesto
                      precio); //preciorepuesto

          daoR.InsertarRepaRepu(re);
        }
       Validaciones.Aviso("La reparación ha sido modificada", "ATENCIÓN");
      }else{
       daoRep.InsertarReparacion(repara);
     Validaciones.Aviso("La reparacion ha sido registrada", "ATENCIÓN");
      }
  
  Cancelar();
  Enabled(false);
  repa.getTxtCodigo().requestFocusInWindow();
}
//--------------------------------------------------------

private void Eliminar() throws SQLException
{
    String Cadena= repa.getTxtCodigo().getText();
    ResultSet regis;
    DaoReparacion daoV=new DaoReparacion();
    regis=daoV.BuscarReparacion(Cadena);
    if (Cadena.length() > 0)  
    {
      if (regis.next())
       {
         daoV.EliminarReparacion(Cadena);
         Validaciones.Aviso("La reparación ha sido eliminado", "SISTEMA");
         Cancelar();
         Enabled(false);
         repa.getBtnEliminar().setEnabled(false);
         repa.getBtnGuardar().setEnabled(false);
         repa.getBtnModificar().setEnabled(false);
        }   
    }
}
    

//------------------------------------
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    //-----------------------------
    //  BOTONES
    //----------------------------
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(repa.getBtnGuardar()))  
       {
           try {  
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
           }
       }  
       //------------------------------------------------------------------
     
       //------------------------------------------------------------------
       if (e.getSource().equals(repa.getBtnConsultar()))  
       {
          
           try {
               new ControladorConsultarReparacion();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorReparacion.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       //-------------------------------------------------------------------
       if (e.getSource().equals(repa.getBtnSalir()))  
       {
         repa.dispose();  
       }  
       //--------------------------------------------------------------------
       
       if (e.getSource().equals(repa.getBtnBuscar()))  
       {
           
           try {
               BuscarReparacion();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorReparacion.class.getName()).log(Level.SEVERE, null, ex);
           }
        }

       if (e.getSource().equals(repa.getBtnModificar()))  
       { 
           Enabled(true);
       }
       
       if (e.getSource().equals(repa.getBtnEliminar()))  
       { 
           try {
               Eliminar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorReparacion.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       if (e.getSource().equals(repa.getBtnAdd()))  
       { 
           AgregarDetallesTabla();
       }
        
       if (e.getSource().equals(repa.getBtnDe()))  
       { 
           try {
               EliminarDetallesTabla();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorReparacion.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       
       
}

}
    