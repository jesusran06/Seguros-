/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import DAO.DaoAnalista;
import Vista.GestionAnalista;
import Modelo.Analista;
import Modelo.Validaciones;
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
 * @author jesus
 */
public class ControladorAnalista implements ActionListener, KeyListener{
    private GestionAnalista analista;
    private Boolean Existe=false;
    ControladorAnalista()
    {
        analista=new GestionAnalista();
        analista.agregarListener(this);
        analista.setVisible(true);  
        analista.getTxtCod().requestFocusInWindow();
        analista.getBtnBuscar().setEnabled(true);
        analista.getBtnEliminar().setEnabled(false);
        analista.getBtnConsultar().setEnabled(true);
        analista.getBtnGuardar().setEnabled(false);
        analista.getBtnSalir().setEnabled(true);
        analista.getBtnModificar().setEnabled(false);
        analista.getTxtCod().setText("ANA-");
        
        Enabled(false);
        
        analista.getTxtCedula().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCedula(e);   
              }           
       }
    );               
    //***************
    analista.getTxtNombre().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaNombre(e);   
              }    
            
           
       }
    );   
    analista.getTxtEmail().addKeyListener(new KeyAdapter()
    {
        
        @Override
            public void keyTyped (KeyEvent e)
              {     
                  ValidaEmail(e);   
              }    
    }
    );
    //***************
     analista.getTxtApellido().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaApellido(e);   
              }    
       }
    );  
     analista.getjTxtDirec().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaDireccion(e);   
              }    
       }
    ); 
    //***************
     analista.getTxtTlf().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaTlf(e);   
              }    
       
       }
    );
          
      //*****Fin de los KeyListener
    }
    private void ValidaNombre(KeyEvent e)
{
    String Cadena;
    
    Cadena=analista.getTxtNombre().getText();
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
    
    Cadena=analista.getTxtNombre().getText();
    if (Cadena.length()==30)
      {   
        e.consume();  
        return;
      }    
}
private void ValidarCódigo(KeyEvent e){
    String Cadena;
    
    Cadena=analista.getTxtCod().getText();
    
    if (Cadena.length()==8){
        e.consume();
        return;
    }
}
private void ValidaCedula(KeyEvent e)
{
    String Cadena;
    
    Cadena=analista.getTxtCedula().getText();
    if (Cadena.length()==8)
      {   
        e.consume();  
        return;
      }
}   
private void ValidaEmail(KeyEvent e)
{
    String cadena;
    cadena=analista.getTxtEmail().getText();
    if (cadena.length()==30)
        e.consume();
    return;
}
private void ValidaDireccion(KeyEvent e)
{
    String cadena;
    cadena=analista.getjTxtDirec().getText();
    if (cadena.length()==160)
        e.consume();
    return;
}
//------------------
private void ValidaTlf(KeyEvent e)
{
    String Cadena;
    char Caracter;
    Cadena=analista.getTxtTlf().getText();
    if (Cadena.length()==11)
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
  analista.getTxtCod().setEditable(!status);
  analista.getTxtCedula().setEditable(status);
  analista.getTxtNombre().setEditable(status);
  analista.getTxtApellido().setEditable(status);
  analista.getTxtTlf().setEditable(status);
  analista.getjTxtDirec().setEditable(status);
  analista.getTxtEmail().setEditable(status);
}
    
    private void Limpiar()
{
  Existe=false;  
  analista.getTxtCedula().setText("");
  analista.getTxtNombre().setText("");
  analista.getTxtApellido().setText("");
  analista.getTxtTlf().setText("");
  analista.getjTxtDirec().setText("");
  analista.getTxtEmail().setText("");
  analista.getTxtCod().setText("ANA-");
  analista.getTxtCod().requestFocusInWindow();
  Enabled(false);
} 
    private void Buscar() throws SQLException
{
  String Cadena= analista.getTxtCod().getText();
  
  if (Cadena.length() > 0) 
  { analista.getTxtNombre().setText("");
    analista.getTxtCedula().setText("");
    analista.getTxtApellido().setText("");
    analista.getTxtTlf().setText("");
    analista.getjTxtDirec().setText("");
    analista.getTxtEmail().setText("");
    
    ResultSet regis;
    DaoAnalista daoAna=new DaoAnalista();
    regis=daoAna.BuscarAnalista(Cadena);
    
    if (regis.next())
     {  Existe=true; 
     if(regis.getString("status").trim().equals("activo")){
         analista.getTxtNombre().setText(regis.getString("nombre").trim());
           analista.getTxtTlf().setText(regis.getString("telefono").trim());
           analista.getTxtApellido().setText(regis.getString("apellido").trim()); 
           analista.getTxtCedula().setText(regis.getString("cedula").trim());
           analista.getjTxtDirec().setText(regis.getString("direccion").trim());
           analista.getTxtEmail().setText(regis.getString("correo").trim());
           analista.getBtnEliminar().setEnabled(true);
           analista.getBtnGuardar().setEnabled(true);
           analista.getBtnModificar().setEnabled(true);
     }    
     else{
         Existe=true;
         Validaciones.Aviso("El analista está eliminado", "SISTEMA");
           analista.getBtnEliminar().setEnabled(false);
           analista.getBtnGuardar().setEnabled(false);
           analista.getBtnModificar().setEnabled(false);
           Limpiar();
           Enabled(false);
     }
     } 
    else{Existe=false;
           int resp=Validaciones.DialogConfirm("El analista no existe, ¿Desea registrarlo?", "Atención");
           switch (resp)
            {
         case 0: analista.getTxtNombre().requestFocusInWindow(); 
                 Enabled(true);
                 analista.getBtnModificar().setEnabled(false);
                 analista.getBtnGuardar().setEnabled(true);
                 analista.getBtnEliminar().setEnabled(false);
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
   Analista ana;
  
  Cadena=analista.getTxtCedula().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Cedula Vacia", "SISTEMA");   
     analista.getTxtCedula().requestFocusInWindow();
     return;
   }   
  
  Cadena=analista.getTxtNombre().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Nombre Vacio", "SISTEMA"); 
     analista.getTxtNombre().requestFocusInWindow();
     return;
   }       

Cadena=analista.getTxtApellido().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Direccion Vacio", "SISTEMA"); 
     analista.getTxtApellido().requestFocusInWindow();
     return;
   }       
  
  Cadena=analista.getTxtTlf().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Teléfono vacio", "SISTEMA"); 
     analista.getTxtTlf().requestFocusInWindow();
     return;
   }
  
   Cadena=analista.getjTxtDirec().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Direccion vacia", "SISTEMA"); 
     analista.getjTxtDirec().requestFocusInWindow();
     return;
   }
  
   Cadena=analista.getTxtEmail().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("E-mail vacio", "SISTEMA"); 
     analista.getTxtEmail().requestFocusInWindow();
     return;
   }
   
  
  ana = new Analista(analista.getTxtCod().getText().trim(),
                  analista.getTxtCedula().getText().trim(),
                  analista.getTxtNombre().getText().trim(),
                  analista.getTxtApellido().getText().trim(),
                  analista.getTxtTlf().getText().trim(),
                  analista.getjTxtDirec().getText().trim(),
                  analista.getTxtEmail().getText().trim(),
                  "activo");

 
  DaoAnalista daoAna=new DaoAnalista();
   
  
  if (Existe)  
  {
  daoAna.ModificarAnalista(ana);
  Validaciones.Aviso("El Analista ha sido modificado", "SISTEMA"); 
  }
  else{    
  daoAna.InsertarAnalista(ana);
  Validaciones.Aviso("El Analista ha sido registrado", "SISTEMA");
  } 
  Limpiar();
  Enabled(false);
  analista.getTxtCedula().requestFocusInWindow();
}
    private void Eliminar() throws SQLException
{
    String Cadena= analista.getTxtCod().getText();
    ResultSet regisCor;
    DaoAnalista daoAna=new DaoAnalista();
    regisCor=daoAna.BuscarAnalista(Cadena);
    if (Cadena.length() > 0)  
    {
      if (regisCor.next())
       {
         daoAna.EliminarAnalista(Cadena);
         Validaciones.Aviso("El analista ha sido eliminado", "SISTEMA");
         Limpiar();
         Enabled(false);
         analista.getBtnEliminar().setEnabled(false);
         analista.getBtnGuardar().setEnabled(false);
         analista.getBtnModificar().setEnabled(false);
        }   
    }
}
    @Override
   public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource().equals(analista.getBtnGuardar()))  
       {
           try {  
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorAnalista.class.getName()).log(Level.SEVERE, null, ex);
           }
       }  
       //------------------------------------------------------------------
       if (e.getSource().equals(analista.getBtnEliminar()))  
       {
           try { 
               Eliminar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorAnalista.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       //------------------------------------------------------------------
       if (e.getSource().equals(analista.getBtnConsultar()))  
       {
           try { 
               new ControladorConsultarAnalista();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorAnalista.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       //-------------------------------------------------------------------
       if (e.getSource().equals(analista.getBtnSalir()))  
       {
         analista.dispose();  
       }  
       //--------------------------------------------------------------------
       
       if (e.getSource().equals(analista.getBtnBuscar()))  
       {
           try {  
               Buscar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorAnalista.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       if (e.getSource().equals(analista.getBtnModificar()))  
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

