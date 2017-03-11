package Controlador;

import DAO.DaoCliente;
import Modelo.Cliente;
import Modelo.Validaciones;
import Vista.GestionCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorCliente implements ActionListener,KeyListener
{
    private GestionCliente clientes;
    private Boolean Existe=false;
    public ControladorCliente() 
    {
      clientes=new GestionCliente();
      clientes.agregarListener(this);
      clientes.setVisible(true);      
      clientes.getTxtCedula().requestFocusInWindow();
      clientes.getBtnEliminar().setEnabled(false);
      clientes.getBtnGuardar().setEnabled(false);
      clientes.getBtnModificar().setEnabled(false);
      
      Enabled(false);
      //**** KeyListener*****************
    clientes.getTxtCedula().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCedula(e);   
              }           
       }
    );               
    //***************
    clientes.getTxtNombre().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaNombre(e);   
              }    
            
           
       }
    );               
    //***************
     clientes.getTxtApellido().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaApellido(e);   
              }    
       }
    );               
    //***************
     clientes.getTxtTlf().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaTlf(e);   
              }    
       
       }
    );
     
    clientes.getjTxtaDireccion().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidarDirec(e);   
              }    
       
       }
    );
    
    clientes.getTxtEmail().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaNombre(e);   
              }    
       
       }
    );
    
      //*****Fin de los KeyListener
    }
//-----------------------------------------------------
private void ValidaCedula(KeyEvent e)
{
    String Cadena;
    
    Cadena=clientes.getTxtCedula().getText();
    if (Cadena.length()==9)
      {   
        e.consume();  
        return;
      }
}        
//-------------------------------------------------------

private void ValidaNombre(KeyEvent e)
{
    String Cadena;
    
    Cadena=clientes.getTxtNombre().getText();
    if (Cadena.length()==30)
      {   
        e.consume();  
        return;
      }    
} 
//------------------    
private void ValidaApellido(KeyEvent e)
{
    String Cadena;
    
    Cadena=clientes.getTxtNombre().getText();
    if (Cadena.length()==30)
      {   
        e.consume();  
        return;
      }    
} 
//------------------
private void ValidaTlf(KeyEvent e)
{
    String Cadena;
    char Caracter;
    Cadena=clientes.getTxtTlf().getText();
    if (Cadena.length()==11)
      {   
        e.consume();  
        return;
      }  
   Caracter=e.getKeyChar();
    if (Caracter<'0'|| Caracter>'9')
      e.consume();
    
}
private void ValidarDirec(KeyEvent e){
    String Cadena;
    Cadena=clientes.getjTxtaDireccion().getText();
    if (Cadena.length()==160)
      {   
        e.consume();  
        return;
      } 
}
//------------------   

private void Enabled(boolean status)
{
  clientes.getTxtCedula().setEditable(!status);
  clientes.getTxtNombre().setEditable(status);
  clientes.getTxtApellido().setEditable(status);
  clientes.getTxtTlf().setEditable(status);
  clientes.getjTxtaDireccion().setEditable(status);
  clientes.getTxtEmail().setEditable(status);
}        
//------------------

private void Cancelar()
{
  Existe=false;  
  clientes.getTxtCedula().setText("");
  clientes.getTxtNombre().setText("");
  clientes.getTxtApellido().setText("");
  clientes.getTxtTlf().setText("");
  clientes.getjTxtaDireccion().setText("");
  clientes.getTxtEmail().setText("");
  clientes.getTxtCedula().requestFocusInWindow();
  Enabled(false);
}        
private void Buscar() throws SQLException
{
  String Cadena= clientes.getTxtCedula().getText();
  if (Cadena.length() > 0) 
  { clientes.getTxtNombre().setText("");
    clientes.getTxtApellido().setText("");
    clientes.getTxtTlf().setText("");
    clientes.getjTxtaDireccion().setText("");
    clientes.getTxtEmail().setText("");
    
    ResultSet regis;
    DaoCliente daoCli=new DaoCliente();
    regis=daoCli.BuscarCliente(Cadena);
    
    if (regis.next())
     {   Existe=true; 
         if(regis.getString("status").trim().equals("activo"))
         {
           
           clientes.getTxtNombre().setText(regis.getString("nombre").trim());
           clientes.getTxtApellido().setText(regis.getString("apellido").trim());           
           clientes.getTxtTlf().setText(regis.getString("telefono").trim());
           clientes.getjTxtaDireccion().setText(regis.getString("direccion").trim());
           clientes.getTxtEmail().setText(regis.getString("email").trim()); 
           clientes.getBtnEliminar().setEnabled(true);
           clientes.getBtnGuardar().setEnabled(true);
           clientes.getBtnModificar().setEnabled(true);
        }           
         else{
           Existe=true;
           Validaciones.Aviso("El cliente está eliminado", "SISTEMA");
           clientes.getBtnEliminar().setEnabled(false);
           clientes.getBtnGuardar().setEnabled(false);
           clientes.getBtnModificar().setEnabled(false);
           clientes.getTxtCedula().setText("");
           Cancelar();
         }
     }
         
     else
     { 
           Existe=false;
           int resp=Validaciones.DialogConfirm("El cliente no existe, ¿Desea registrarlo?", "Atención");
           switch (resp)
            {
         case 0: clientes.getTxtNombre().requestFocusInWindow(); 
                 Enabled(true);
                 clientes.getBtnModificar().setEnabled(false);
                 clientes.getBtnGuardar().setEnabled(true);
                 clientes.getBtnEliminar().setEnabled(false);
                 break;
         
         case 1: Cancelar();
                 break;
     }
     clientes.getTxtCedula().requestFocusInWindow();
     }
   }
}
//-----------------------
private void Grabar() throws SQLException
{
  String Cadena;
  Cliente cli;
  
  Cadena=clientes.getTxtCedula().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Cedula Vacia", "SISTEMA");   
     clientes.getTxtCedula().requestFocusInWindow();
     return;
   }   
  
  Cadena=clientes.getTxtNombre().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Nombre Vacio", "SISTEMA"); 
     clientes.getTxtNombre().requestFocusInWindow();
     return;
   }       

Cadena=clientes.getTxtApellido().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Direccion Vacio", "SISTEMA"); 
     clientes.getTxtApellido().requestFocusInWindow();
     return;
   }       
  
  Cadena=clientes.getTxtTlf().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Teléfono vacio", "SISTEMA"); 
     clientes.getTxtTlf().requestFocusInWindow();
     return;
   }
  
   Cadena=clientes.getjTxtaDireccion().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Direccion vacia", "SISTEMA"); 
     clientes.getjTxtaDireccion().requestFocusInWindow();
     return;
   }
  
   Cadena=clientes.getTxtEmail().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("E-mail vacio", "SISTEMA"); 
     clientes.getTxtEmail().requestFocusInWindow();
     return;
   }
   
  
  cli=new Cliente(clientes.getTxtCedula().getText().trim(), 
                  clientes.getTxtNombre().getText().trim(),
                  clientes.getTxtApellido().getText().trim(),       
                  clientes.getTxtTlf().getText().trim(),
                  clientes.getjTxtaDireccion().getText().trim(),
                  clientes.getTxtEmail().getText().trim(),
                  "activo");

 
  DaoCliente daoCli=new DaoCliente();
   
  
  if (Existe)  
  {
  daoCli.ModificarCliente(cli);
  Validaciones.Aviso("El Cliente ha sido modificado", "SISTEMA"); 
  }
  else{    
  daoCli.InsertarCliente(cli);
  Validaciones.Aviso("El Cliente ha sido registrado", "SISTEMA");
  } 
  Cancelar();
  Enabled(false);
  clientes.getTxtCedula().requestFocusInWindow();
  
 

}  
//--------------------------------------------------------

private void Eliminar() throws SQLException
{
    String Cadena= clientes.getTxtCedula().getText();
    ResultSet regisCli;
    DaoCliente daoCli=new DaoCliente();
    regisCli=daoCli.BuscarCliente(Cadena);
    if (Cadena.length() > 0)  
    {
      if (regisCli.next())
       {
         daoCli.EliminarCliente(Cadena);
         Validaciones.Aviso("El cliente ha sido eliminado", "SISTEMA");
         Cancelar();
         Enabled(false);
         clientes.getBtnEliminar().setEnabled(false);
         clientes.getBtnGuardar().setEnabled(false);
         clientes.getBtnModificar().setEnabled(false);
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
       if (e.getSource().equals(clientes.getBtnGuardar()))  
       {
           try {  
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
           }
       }  
       //------------------------------------------------------------------
       if (e.getSource().equals(clientes.getBtnEliminar()))  
       {
           try { 
               Eliminar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       //------------------------------------------------------------------
       if (e.getSource().equals(clientes.getBtnConsultar()))  
       {
           try { 
               new ControladorConsultarCliente();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       //-------------------------------------------------------------------
       if (e.getSource().equals(clientes.getBtnSalir()))  
       {
         clientes.dispose();  
       }  
       //--------------------------------------------------------------------
       
       if (e.getSource().equals(clientes.getBtnBuscar()))  
       {
           try {  
               Buscar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       if (e.getSource().equals(clientes.getBtnModificar()))  
       {
         Enabled(true);
       } 
    }

} 