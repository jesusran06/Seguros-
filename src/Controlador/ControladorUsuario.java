/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Validaciones;
import Modelo.Login;
import Vista.GestionUsuario;
import DAO.DaoLogin;
/**
 *
 * @author jesus
 */
public class ControladorUsuario implements ActionListener,KeyListener
{
    
    private GestionUsuario usuario; 
    private Boolean Existe=false;
    ControladorUsuario()
    {
        usuario=new GestionUsuario();
        usuario.agregarListener(this);
        usuario.setVisible(true);  
        usuario.getTxtCedula().requestFocusInWindow();
        usuario.getBtnBuscar().setEnabled(true);
        usuario.getBtnCancelar().setEnabled(false);
        usuario.getBtnConsultar().setEnabled(true);
        usuario.getBtnGuardar().setEnabled(false);
        usuario.getBtnSalir().setEnabled(true);
        usuario.getButmodificar().setEnabled(false);
        
        
        Enabled(false);
        
        usuario.getTxtCedula().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCedula(e);   
              }           
       }
    );               
    //***************
    
          
      //*****Fin de los KeyListener
    }
    
private void ValidaCedula(KeyEvent e)
{
    String Cadena;
    char Caracter;
    Cadena=usuario.getTxtCedula().getText();
    if (Cadena.length()==9)
      {   
        e.consume();  
        return;
      }
     Caracter=e.getKeyChar();
    if (Caracter<'0'|| Caracter>'9')
      e.consume();
}   

    private void Enabled(boolean status)
{
  
  usuario.getTxtCedula().setEditable(!status);
  usuario.getTxtContra().setEditable(status);
}
    
    private void Limpiar()
{
  Existe=false;  
  usuario.getTxtCedula().setText("");
  usuario.getTxtCedula().requestFocusInWindow();
  usuario.getTxtContra().setText("");
  Enabled(false);
} 
    private void Buscar() throws SQLException
{
  String Cadena= usuario.getTxtCedula().getText().trim();
  
  if (Cadena.length() > 0) 
  { 
    
    usuario.getTxtContra().setText("");
    usuario.getjComboRoll().setSelectedItem("");
    
    ResultSet regis;
    DaoLogin daoUsu=new DaoLogin();
    regis=daoUsu.VerificarUsuario(Cadena);
    
    if (regis.next())
     {  Existe=true; 
     
     if(regis.getString("status").trim().equals("activo")){
           usuario.getTxtCedula().setText(regis.getString("usuario").trim());
           usuario.getTxtContra().setText(regis.getString("contraseña").trim());
           if(regis.getString("roll").trim().equals("Administrador")){
              usuario.getjComboRoll().setSelectedItem("Administrador"); 
           }else{
               usuario.getjComboRoll().setSelectedItem("Analista");}
           usuario.getBtnCancelar().setEnabled(true);
           usuario.getBtnGuardar().setEnabled(true);
           usuario.getButmodificar().setEnabled(true);
     }    
     else{
         Existe=true;
         Validaciones.Aviso("El usuario está eliminado", "SISTEMA");
           usuario.getBtnCancelar().setEnabled(false);
           usuario.getBtnGuardar().setEnabled(false);
           usuario.getButmodificar().setEnabled(false);
           
           Enabled(false);
     }
     } 
    else{Existe=false;
           int resp=Validaciones.DialogConfirm("El usuario no existe, ¿Desea registrarlo?", "Atención");
           switch (resp)
            {
         case 0: usuario.getTxtCedula().requestFocusInWindow(); 
                 Enabled(true);
                 usuario.getButmodificar().setEnabled(false);
                 usuario.getBtnGuardar().setEnabled(true);
                 usuario.getBtnCancelar().setEnabled(false);
                 break;
         
         case 1: Limpiar();
                 break;
     }
    }
    }
}
    private void Grabar() throws SQLException
{
  String Cadena;
  Login usu;
  
  Cadena=usuario.getTxtCedula().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Cedula Vacía", "SISTEMA");   
     usuario.getTxtCedula().requestFocusInWindow();
     return;
   }   
  
  Cadena=usuario.getTxtContra().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Contraseña Vacía", "SISTEMA"); 
     usuario.getTxtContra().requestFocusInWindow();
     return;
   }       


   
  
  usu = new Login(usuario.getTxtCedula().getText().trim(),
                  usuario.getTxtContra().getText().trim(),
                  usuario.getjComboRoll().getSelectedItem().toString().trim(),
                  "activo");

 
  DaoLogin daoUsu=new DaoLogin();
   
  
  if (Existe)  
  {
  daoUsu.ModificarLogin(usu);
  Validaciones.Aviso("El Usuario ha sido modificado", "SISTEMA"); 
  }
  else{    
  daoUsu.InsertarLogin(usu);
  Validaciones.Aviso("El Usuario ha sido registrado", "SISTEMA");
  } 
  Limpiar();
  Enabled(false);
  usuario.getTxtCedula().requestFocusInWindow();
}
    private void Eliminar() throws SQLException
{
    String Cadena= usuario.getTxtCedula().getText();
    ResultSet regisUsu;
    DaoLogin daoUsu=new DaoLogin();
    regisUsu=daoUsu.VerificarUsuario(Cadena);
    if (Cadena.length() > 0)  
    {
      if (regisUsu.next())
       {
         daoUsu.EliminarLogin(Cadena);
         Validaciones.Aviso("El usuario ha sido eliminado", "SISTEMA");
         Limpiar();
         Enabled(false);
         usuario.getBtnCancelar().setEnabled(false);
         usuario.getBtnGuardar().setEnabled(false);
         usuario.getButmodificar().setEnabled(false);
        }   
    }
}
    @Override
   public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource().equals(usuario.getBtnGuardar()))  
       {
           try {  
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
           }
       }  
       //------------------------------------------------------------------
       if (e.getSource().equals(usuario.getBtnCancelar()))  
       {
           try { 
               Eliminar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       //------------------------------------------------------------------
       if (e.getSource().equals(usuario.getBtnConsultar()))  
       {
           try { 
               new ControladorConsultarUsuario();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       //-------------------------------------------------------------------
       if (e.getSource().equals(usuario.getBtnSalir()))  
       {
         usuario.dispose();  
       }  
       //--------------------------------------------------------------------
       
       if (e.getSource().equals(usuario.getBtnBuscar()))  
       {
           try {  
               Buscar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       if (e.getSource().equals(usuario.getButmodificar()))  
       {
         Enabled(true);
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
