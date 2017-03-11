/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Cobertura;
import DAO.DaoCobertura;
import DAO.DaoSerCob;
import DAO.DaoServicio;
import Modelo.SerCob;
import Modelo.Validaciones;
import Vista.GestionCobertura;
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
/**
 *
 * @author jesus
 */
public class ControladorCobertura implements ActionListener,KeyListener{
    private DefaultTableModel modelo;
    private Boolean Existe=false;
    private GestionCobertura cobertura;
    double sumatoria;
    public ControladorCobertura() throws SQLException{
        
        cobertura = new GestionCobertura();
        cobertura.setVisible(true);
        cobertura.agregarListener(this);
        modelo = new  DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Servicio");
        modelo.addColumn("Costo");
        cobertura.getjTableServicios().setModel(modelo);
        llenarcombo();
        TraerCodigoCobertura();
        cobertura.getButguardarcober().setEnabled(false);
        cobertura.getBtnModificar().setEnabled(false);
        cobertura.getButeliminarcober().setEnabled(false);
        cobertura.getButguardarcober().setEnabled(true);
        cobertura.getJbtnagregar().setEnabled(false);
        cobertura.getjBtnRemover().setEnabled(false);
        cobertura.getJtxttotal().setEditable(false);
        cobertura.getjCmbServ().setEnabled(false);
        cobertura.getButguardarcober().setEnabled(false);
        cobertura.getjTableServicios().setEnabled(false);
        cobertura.getJtexcodcob().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCodigo(e);   
              }    
       }
    );
    }
    private void ValidaCodigo(KeyEvent e)
{
    String Cadena;
    
    Cadena=cobertura.getJtexcodcob().getText();
    if (Cadena.length()==8)
      {   
        e.consume();  
        return;
      }    
}
    private void TraerCodigoCobertura() throws SQLException
{
  DaoCobertura daoCobertura=new DaoCobertura();  
  cobertura.getJtexcodcob().setText(daoCobertura.CoberturaSiguiente());
} 
  private void llenarcombo() throws SQLException{
      ResultSet rs;
      String InfoBD;
      DaoServicio daoServ = new DaoServicio();
      cobertura.getjCmbServ().removeAllItems();
      cobertura.getjCmbServ().addItem("SELECCIONE");
      rs = daoServ.ConsultarServicio();
      while(rs.next()){
          InfoBD=rs.getString("codser").trim()+",";
          InfoBD=InfoBD+rs.getString("nombser").trim()+",";
          InfoBD=InfoBD+rs.getString("costser").trim();
          cobertura.getjCmbServ().addItem(InfoBD);
      }
  }
  
  private void BuscarReparacion() throws SQLException
{
    String Cadena;
    Cadena= cobertura.getJtexcodcob().getText();
    
    if(Cadena.length()>0)
    {   
        cobertura.getJtxttotal().setText("");
        ResultSet regis;
        DaoCobertura daoCober=new DaoCobertura();
        
        regis=daoCober.BuscarCobertura(Cadena);
        
        if(regis.next())
        {
            Existe= true;
        
        if(regis.getString("status").trim().equals("activo"))
         {
           
           cobertura.getJtxttotal().setText(regis.getString("costo").trim());
           Integer Fila =0;
           DaoSerCob daosercob = new DaoSerCob();
           ResultSet regist;
           String cadena = cobertura.getJtexcodcob().getText().trim(); //repara.getCodigo();// extrae el codigo de la reparación
           regist=daosercob.ConsultarSerCob(cadena);
           
           cobertura.getBtnModificar().setEnabled(true);
          if (regist.next()) 
            {   
                
                do       
                { 
               
                 String []Datos = new String[3];
   
                Datos[0]=regist.getString("codser");
                Datos[1]=regist.getString("nombre");
                Datos[2]=regist.getString("precio");           
                modelo.addRow(Datos);
                 Fila++;
                 
               }while (regist.next());
            }
          } 
        else{
           Existe=true;
           Validaciones.Aviso("La reparación está eliminada", "ATENCIÓN");
             
         } 
        }else{ 
           Existe=false;
           int resp=Validaciones.DialogConfirm("La reparación no existe, ¿Desea registrarla?", "ATENCIÓN");
           switch (resp)
            {
         case 0: cobertura.getJtexcodcob().requestFocusInWindow(); 
                 cobertura.getButguardarcober().setEnabled(true);
                 cobertura.getJbtnagregar().setEnabled(true);
                 cobertura.getjBtnRemover().setEnabled(true);
                 cobertura.getjCmbServ().setEnabled(true);
                 cobertura.getjTableServicios().setEnabled(true);
                 
                 break;
         
         case 1: break;
            }
     cobertura.getJtexcodcob().requestFocusInWindow();
     }
  }
}
private void AgregarDetallesTabla()
{  
   String []Datos = new String[3];
   String contenidoCombo; 
   String [] arrContenidoCombo; 
   
   contenidoCombo=(String)cobertura.getjCmbServ().getSelectedItem();
   
   arrContenidoCombo=contenidoCombo.split(", ");
   
   Datos[0]=arrContenidoCombo[0];
   Datos[1]=arrContenidoCombo[1];
   Datos[2]=arrContenidoCombo[2];       
   modelo.addRow(Datos);
   cobertura.getjCmbServ().removeItem(contenidoCombo);
   CacularTotal();

} 
private void EliminarDetallesTabla()
{  
    int filaselecionada = cobertura.getjTableServicios().getSelectedRow();
    if(filaselecionada>=0)
        modelo.removeRow(filaselecionada);
    else
        Validaciones.Aviso("La tabla está vacía o no selecciono una fila", "SISTEMA");
} 
public void CacularTotal(){
    double sumatoria1=0;
   int totalRow= cobertura.getjTableServicios().getRowCount();
        totalRow-=1; 
        for(int i=0;i<=(totalRow);i++)
        {
        sumatoria1 = Double.parseDouble(String.valueOf(cobertura.getjTableServicios().getValueAt(i,2)));

           }
        sumatoria += sumatoria1;
             
             cobertura.getJtxttotal().setText(String.valueOf(sumatoria));
}

private void Grabar() throws SQLException
{
  String Cadena;
  Cobertura cober;
  
 
  Cadena=cobertura.getJtexcodcob().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Código vacía, por favor complete el campo", "SISTEMA"); 
     cobertura.getJtexcodcob().requestFocusInWindow();
     return;
   }       
Cadena = String.valueOf(cobertura.getjTableServicios().getComponent(0));
  if (Cadena.length()==0){
      Validaciones.Aviso("Tabla vacía, por favor agregue un servicio", "SISTEMA");
  }
  
   
    
  cober=new Cobertura(cobertura.getJtexcodcob().getText().trim(), 
                  cobertura.getJtxttotal().getText().trim(),
                  "activo");
  
   DaoCobertura daoCob=new DaoCobertura();
      if(Existe)
      {
       daoCob.ModificarCobertura(cober);
       String codigoser;
       SerCob sc = null;
       DaoSerCob daoSercob= new DaoSerCob();
       ResultSet regis;
       String cadena = cobertura.getJtexcodcob().getText().trim(); //repara.getCodigo();// extrae el codigo de la reparación
       regis = daoSercob.ConsultarSerCob(cadena);
        if (regis.next()) 
        {
            do       
            {
                daoSercob.EliminarSercob(cadena);
            }while (regis.next());
        }
        
        for (int i=0;i<cobertura.getjTableServicios().getRowCount();i++) 
        {   
       codigoser=(String)cobertura.getjTableServicios().getValueAt(i, 0);
       codigoser=codigoser.trim();
       
       String nombreser=(String)cobertura.getjTableServicios().getValueAt(i, 1);
       nombreser=nombreser.trim();
       
       String precioser=(String)cobertura.getjTableServicios().getValueAt(i, 2);
       precioser=precioser.trim();
            
       String codsercob=daoSercob.SerCobSiguiente();
       codsercob=codsercob.trim();
       
       sc = new SerCob(codsercob, 
                      codigoser,
                      cobertura.getJtexcodcob().getText().trim(), //codigo del repuesto
                      nombreser,
                      precioser); 

          daoSercob.InsertarSerCob(sc);
        }
       Validaciones.Aviso("La cobertura ha sido modificada", "ATENCIÓN");
       cobertura.getBtnModificar().setEnabled(false);
        cobertura.getButeliminarcober().setEnabled(false);
        cobertura.getButguardarcober().setEnabled(false);
        TraerCodigoCobertura();
        cobertura.getJbtnagregar().setEnabled(false);
        cobertura.getjBtnRemover().setEnabled(false);
        cobertura.getjCmbServ().setEnabled(false);
        cobertura.getJtexcodcob().setEditable(true);
        cobertura.getJtexcodcob().requestFocusInWindow();
        llenarcombo();
        
      }else{
       daoCob.InsertarCobertura(cober);
     Validaciones.Aviso("La cobertura ha sido registrada", "ATENCIÓN");
     cobertura.getBtnModificar().setEnabled(false);
        cobertura.getButeliminarcober().setEnabled(false);
        cobertura.getButguardarcober().setEnabled(false);
        TraerCodigoCobertura();
        cobertura.getJbtnagregar().setEnabled(false);
        cobertura.getjBtnRemover().setEnabled(false);
        cobertura.getjCmbServ().setEnabled(false);
        cobertura.getJtexcodcob().setEditable(true);
        cobertura.getJtexcodcob().requestFocusInWindow();
        llenarcombo();
      }
}
//--------------------------------------------------------

private void Eliminar() throws SQLException
{
    String Cadena= cobertura.getJtexcodcob().getText();
    ResultSet regis;
    DaoCobertura daoCober=new DaoCobertura();
    regis=daoCober.BuscarCobertura(Cadena);
    if (Cadena.length() > 0)  
    {
      if (regis.next())
       {
         daoCober.EliminarCobertura(Cadena);
         Validaciones.Aviso("La reparación ha sido eliminado", "SISTEMA");
        cobertura.getBtnModificar().setEnabled(false);
        cobertura.getButeliminarcober().setEnabled(false);
        cobertura.getButguardarcober().setEnabled(false);
        TraerCodigoCobertura();
        cobertura.getJbtnagregar().setEnabled(false);
        cobertura.getjBtnRemover().setEnabled(false);
        cobertura.getjCmbServ().setEnabled(false);
        cobertura.getJtexcodcob().setEditable(true);
        cobertura.getJtexcodcob().requestFocusInWindow();
        
        }   
    }
}
public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource().equals(cobertura.getButguardarcober()))  
       {
           try {  
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        if (e.getSource().equals(cobertura.getBtnModificar()))  
       {
           cobertura.getJtexcodcob().setEditable(false);
           cobertura.getjTableServicios().setEnabled(true);
           cobertura.getjCmbServ().setEnabled(true);
           cobertura.getJbtnagregar().setEnabled(true);
           cobertura.getjBtnRemover().setEnabled(true);
           cobertura.getButguardarcober().setEnabled(true);
           cobertura.getButeliminarcober().setEnabled(true);
       }
        if (e.getSource().equals(cobertura.getButsalircober()))  
       {
           cobertura.dispose();
       }
        if (e.getSource().equals(cobertura.getButeliminarcober()))  
       {
            try {
                Eliminar();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCobertura.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        if (e.getSource().equals(cobertura.getJbtnagregar()))  
       {
           AgregarDetallesTabla();
       }
        if (e.getSource().equals(cobertura.getjBtnRemover()))  
       {
           EliminarDetallesTabla();
       }
        if (e.getSource().equals(cobertura.getBtnbuscar())){
            try {
                BuscarReparacion();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCobertura.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
