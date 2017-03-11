/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import DAO.DaoLogin;
import Vista.GestionLogin;
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

/**
 *
 * @author jesus
 */
public class ControladorLogin implements ActionListener,KeyListener {
    private GestionLogin log;
    public ControladorLogin(){
        log = new GestionLogin();
        log.setVisible(true);
        log.getjTxtUsuario().requestFocusInWindow();
        log.agregarListener(this);
        log.setLocationRelativeTo(null);
        
     log.getjTxtUsuario().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCedula(e);   
              }           
       }
    );
    }
     private void ValidaCedula(KeyEvent e)
{
    String Cadena;
    char Caracter;
    Cadena=log.getjTxtUsuario().getText();
    if (Cadena.length()==9)
      {   
        e.consume();  
        return;
      }
    Caracter=e.getKeyChar();
    if (Caracter<'0'|| Caracter>'9')
      e.consume();
}  
    private void Ingresar() throws SQLException{
    String Usuario = log.getjTxtUsuario().getText().trim();
    String Contraseña = String.valueOf(log.getjTxtContraseña().getPassword()).trim();
    String Roll = log.getjComboRoll().getSelectedItem().toString().trim();
    if(Usuario.length() > 0 && Contraseña.length() > 0){
        log.getjTxtUsuario().setText("");
        log.getjTxtContraseña().setText("");
        log.getjBtnIngresar().setEnabled(true);
        ResultSet rs;
        DaoLogin daoLog = new DaoLogin();
        rs = daoLog.VerificarUsuario(Usuario);
        if(rs.next()){
            if(rs.getString("usuario").trim().equals(Usuario) && rs.getString("contraseña").trim().equals(Contraseña) && rs.getString("roll").trim().equals(Roll)){
                Validaciones.Aviso("Bienvenido al sistema", "Sistema");
                log.dispose();
                 new ControladorPrincipal();
                }else{
                Validaciones.Aviso("Datos Incorrectos", "Sistema");
            }            
        }else{
            Validaciones.Aviso("Este usuario no existe", "Sistema");
        }
    }else{
        if((Usuario.length()>0 && Contraseña.length()==0)){
            Validaciones.Aviso("Contraseña vacía, por favor complete el campo", "Sistema");
            log.getjTxtContraseña().requestFocusInWindow();
        }else
        if(Usuario.length()==0 && Contraseña.length()>0){
                Validaciones.Aviso("Usuario vacío, por favor complete el campo", "Sistema");
                log.getjTxtUsuario().requestFocusInWindow();
    }else{
                Validaciones.Aviso("Los campos estan vacíos, por favor completarlos", "Sistema");
        }
    }
}        

public void actionPerformed(ActionEvent e){
    {
      if (e.getSource().equals(log.getjBtnIngresar()))  
       {
           try {  
               Ingresar();
              } catch (SQLException ex) {
               Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
           }
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
