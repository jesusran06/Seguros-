package Controlador;

import DAO.DaoRepuesto;
import Modelo.Repuesto;
import Modelo.Validaciones;
import Vista.GestionRepuesto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Indrina Meza
 */

  
    public class ControladorRepuesto implements ActionListener,KeyListener
{
    private GestionRepuesto repa;
    private Boolean Existe=false;
    public ControladorRepuesto() throws SQLException 
    {
      repa=new GestionRepuesto();
      repa.agregarListener(this);
      repa.setVisible(true);      
      repa.getTxtCodigo().requestFocusInWindow();
      repa.getBtnEliminar().setEnabled(false);
      repa.getBtnGuardar().setEnabled(false);
      repa.getBtnModificar().setEnabled(false);
      TraerCodigoRepuesto();
      
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
                    
    //***************
     repa.getTxtPrecio().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaPrecio(e);   
              }    
       }
    );
    
      //*****Fin de los KeyListener
    }      
//-------------------------------------------------------

private void TraerCodigoRepuesto() throws SQLException
{
  DaoRepuesto daoRepuesto=new DaoRepuesto();  
  repa.getTxtCodigo().setText(daoRepuesto.repuestoSiguiente());
}  
//-------------------------------------------------------
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

//-------------------------------------------------------
private void ValidaNombre(KeyEvent e)
{
    String Cadena;
    
    Cadena=repa.getTxtNombre().getText();
    if (Cadena.length()==30)
      {   
        e.consume();  
        return;
      }    
} 
//--------------------------------------------------------    

//------------------
private void ValidaPrecio(KeyEvent e)
{
    String Cadena;
    char Caracter;
    Cadena=repa.getTxtPrecio().getText();
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

private void Enabled(boolean status)
{ 
  repa.getTxtCodigo().setEditable(!status);
  repa.getTxtNombre().setEditable(status);
  repa.getTxtPrecio().setEditable(status);
  repa.getTxtNombre().setEditable(status);
}        
//------------------

private void Cancelar()
{
  Existe=false;
  repa.getTxtCodigo().setText("");
  repa.getTxtNombre().setText("");
  repa.getTxtPrecio().setText("");
  repa.getTxtCodigo().requestFocusInWindow();
  Enabled(true);
}   
//-----------------------

private void BuscarRepuesto() throws SQLException
{
    String Cadena;
    Cadena= repa.getTxtCodigo().getText();
    
    
    
    if(Cadena.length()>0)
    {   
        repa.getTxtNombre().setText("");
        repa.getTxtPrecio().setText("");
        
        ResultSet regis;
        DaoRepuesto daoRepa=new DaoRepuesto();
        regis=daoRepa.BuscarRepuesto(Cadena);
        if(regis.next())
        {
            Existe= true;
            
        if(regis.getString("statusrepu").trim().equals("activo"))
         {
           
           repa.getTxtNombre().setText(regis.getString("nombrerepu"));
           repa.getTxtPrecio().setText(regis.getString("precio")); 
           repa.getBtnEliminar().setEnabled(true);
           repa.getBtnGuardar().setEnabled(true);
           repa.getBtnModificar().setEnabled(true);
        }           
         else{
           Existe=true;
           Validaciones.Aviso("El repuesto está eliminado", "ATENCIÓN");
           repa.getBtnEliminar().setEnabled(false);
           repa.getBtnGuardar().setEnabled(true);
           repa.getBtnModificar().setEnabled(false);
           repa.getTxtCodigo().setText("");
           Cancelar();
         }
     }
         
     else
     { 
           Existe=false;
           int resp=Validaciones.DialogConfirm("El repuesto no existe, ¿Desea registrarlo?", "ATENCIÓN");
           switch (resp)
            {
         case 0: repa.getTxtNombre().requestFocusInWindow(); 
                 Enabled(true);
                 repa.getBtnModificar().setEnabled(false);
                 repa.getBtnGuardar().setEnabled(true);
                repa.getBtnModificar().setEnabled(false);
                 break;
         
         case 1: Cancelar();
                 break;
     }
     repa.getTxtCodigo().requestFocusInWindow();
     }
   }
             
    
}
private void Grabar() throws SQLException
{
  String Cadena;
  Repuesto repu;
  Float Precio = 0.0f;
  
  Cadena=repa.getTxtCodigo().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Codigo Vacio", "SISTEMA"); 
     repa.getTxtCodigo().requestFocusInWindow();
     return;
   }       

Cadena=repa.getTxtNombre().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Nombre Vacio", "SISTEMA"); 
     repa.getTxtNombre().requestFocusInWindow();
     return;
   }       
  
  Cadena=repa.getTxtPrecio().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Precio vacio", "SISTEMA"); 
     repa.getTxtPrecio().requestFocusInWindow();
     return;
   }
  
  
  Precio = Validaciones.CStr_Float(repa.getTxtPrecio().getText().trim()); 
  
  repu=new Repuesto(repa.getTxtCodigo().getText().trim(), 
                  repa.getTxtNombre().getText().trim(),
                  Precio,
                  "activo");


  DaoRepuesto daoRep=new DaoRepuesto();
      if(Existe)
      {daoRep.ModificarRepuesto(repu);
       Validaciones.Aviso("El repuesto ha sido modificado", "ATENCIÓN");
      }else{
       daoRep.InsertarRepuesto(repu);
     Validaciones.Aviso("El repuesto ha sido registrado", "ATENCIÓN");
      }
  Cancelar();
  Enabled(false);
  repa.getTxtCodigo().requestFocusInWindow();
}

//--------------------------------------------------------

    

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
               Logger.getLogger(ControladorRepuesto.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       } 
       //------------------------------------------------------------------
       if (e.getSource().equals(repa.getBtnConsultar()))  
       {
          
           try {
               new ControladorConsultarRepuesto();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorRepuesto.class.getName()).log(Level.SEVERE, null, ex);
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
               BuscarRepuesto();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorRepuesto.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       if (e.getSource().equals(repa.getBtnModificar()))  
       { 
           Enabled(true);
       }

}

   

    
}
