
package Controlador;
import Modelo.Validaciones;
import Modelo.Perito;
import Vista.GestionPerito;
import DAO.DaoPerito;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPerito implements ActionListener,KeyListener{
    
    private GestionPerito perito; 
    private Boolean Existe = false;     
    ControladorPerito()
    {
        perito=new GestionPerito();
        perito.setVisible(true);  
        perito.agregarListener(this);
        perito.getBtnGuardar().setEnabled(false);
        perito.getBtnCancelar().setEnabled(false);
        perito.getBtnModificar().setEnabled(false);
        perito.getBtnBuscar().setEnabled(true);
        Enabled(false);
        
        perito.getTxtCedula().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCedula(e);   
              }           
       }
    );   
                       
    //***************
    perito.getTxtNombre().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaNombre(e);   
              }    
            
           
       }
    );   
    perito.getTxtEmail().addKeyListener(new KeyAdapter()
    {
        
        @Override
            public void keyTyped (KeyEvent e)
              {     
                  ValidaEmail(e);   
              }    
    }
    );
    //***************
     perito.getTxtApellido().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaApellido(e);   
              }    
       }
    );  
     perito.getJtxtadirec().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaDireccion(e);   
              }    
       }
    ); 
    //***************
     perito.getTxtTlf().addKeyListener(new KeyAdapter()
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
    
    Cadena=perito.getTxtNombre().getText();
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
    
    Cadena=perito.getTxtNombre().getText();
    if (Cadena.length()==30)
      {   
        e.consume();  
        return;
      }    
}

private void ValidaCedula(KeyEvent e)
{
    String Cadena;
    
    Cadena=perito.getTxtCedula().getText();
    if (Cadena.length()==9)
      {   
        e.consume();  
        return;
      }
}   
private void ValidaEmail(KeyEvent e)
{
    String cadena;
    cadena=perito.getTxtEmail().getText();
    if (cadena.length()==30)
        e.consume();
    return;
}
private void ValidaDireccion(KeyEvent e)
{
    String cadena;
    cadena=perito.getJtxtadirec().getText();
    if (cadena.length()==160)
        e.consume();
    return;
}
//------------------
private void ValidaTlf(KeyEvent e)
{
    String Cadena;
    char Caracter;
    Cadena=perito.getTxtTlf().getText();
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
  perito.getTxtCodigo().setEditable(!status);
  perito.getTxtCedula().setEditable(status);
  perito.getTxtNombre().setEditable(status);
  perito.getTxtApellido().setEditable(status);
  perito.getTxtTlf().setEditable(status);
  perito.getJtxtadirec().setEditable(status);
  perito.getTxtEmail().setEditable(status);
}
    private void Limpiar()
{
  Existe=false;  
  perito.getTxtCedula().setText("");
  perito.getTxtNombre().setText("");
  perito.getTxtApellido().setText("");
  perito.getTxtTlf().setText("");
  perito.getJtxtadirec().setText("");
  perito.getTxtEmail().setText("");
  perito.getTxtCodigo().setText("PER-");
  perito.getTxtCodigo().requestFocusInWindow();
  Enabled(false);
} 
        private void Buscar() throws SQLException
{
  String Cadena= perito.getTxtCodigo().getText();
  
  if (Cadena.length() > 0) 
  { perito.getTxtNombre().setText("");
    perito.getTxtCedula().setText("");
    perito.getTxtApellido().setText("");
    perito.getTxtTlf().setText("");
    perito.getJtxtadirec().setText("");
    perito.getTxtEmail().setText("");
    
    ResultSet regis;
    DaoPerito daoPer=new DaoPerito();
    regis=daoPer.BuscarPerito(Cadena);
    
    if (regis.next())
     {  Existe=true; 
     if(regis.getString("status").trim().equals("activo")){
           perito.getTxtCedula().setText(regis.getString("cedula").trim());
           perito.getTxtNombre().setText(regis.getString("nombre").trim());
           perito.getTxtApellido().setText(regis.getString("apellido").trim()); 
           perito.getTxtTlf().setText(regis.getString("telefono").trim());
           perito.getJtxtadirec().setText(regis.getString("direccion").trim());
           perito.getTxtEmail().setText(regis.getString("email").trim());
           perito.getBtnCancelar().setEnabled(true);
           perito.getBtnGuardar().setEnabled(true);
           perito.getBtnModificar().setEnabled(true);
     }    
     else{
         Existe=true;
         Validaciones.Aviso("El perito está eliminado", "SISTEMA");
           perito.getBtnCancelar().setEnabled(false);
           perito.getBtnGuardar().setEnabled(false);
           perito.getBtnModificar().setEnabled(false);
           Limpiar();
           Enabled(false);
     }
     } 
    else{Existe=false;
           int resp=Validaciones.DialogConfirm("El perito no existe, ¿Desea registrarlo?", "Atención");
           switch (resp)
            {
         case 0: perito.getTxtNombre().requestFocusInWindow(); 
                 Enabled(true);
                 perito.getBtnModificar().setEnabled(false);
                 perito.getBtnGuardar().setEnabled(true);
                 perito.getBtnCancelar().setEnabled(false);
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
  Perito per;
  
  Cadena=perito.getTxtCedula().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Cedula Vacia", "SISTEMA");   
     perito.getTxtCedula().requestFocusInWindow();
     return;
   }   
  
  Cadena=perito.getTxtNombre().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Nombre Vacio", "SISTEMA"); 
     perito.getTxtNombre().requestFocusInWindow();
     return;
   }       

Cadena=perito.getTxtApellido().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Direccion Vacio", "SISTEMA"); 
     perito.getTxtApellido().requestFocusInWindow();
     return;
   }       
  
  Cadena=perito.getTxtTlf().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Teléfono vacio", "SISTEMA"); 
     perito.getTxtTlf().requestFocusInWindow();
     return;
   }
  
   Cadena=perito.getJtxtadirec().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Direccion vacia", "SISTEMA"); 
     perito.getJtxtadirec().requestFocusInWindow();
     return;
   }
  
   Cadena=perito.getTxtEmail().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("E-mail vacio", "SISTEMA"); 
     perito.getTxtEmail().requestFocusInWindow();
     return;
   }
   
  
  per = new Perito(perito.getTxtCodigo().getText().trim(),
                  perito.getTxtCedula().getText().trim(),
                  perito.getTxtNombre().getText().trim(),
                  perito.getTxtApellido().getText().trim(),
                  perito.getTxtTlf().getText().trim(),
                  perito.getJtxtadirec().getText().trim(),
                  perito.getTxtEmail().getText().trim(),
                  "activo");

 
  DaoPerito daoPer=new DaoPerito();
   
  
  if (Existe)  
  {
  daoPer.ModificarPerito(per);
  Validaciones.Aviso("El Perito ha sido modificado", "SISTEMA"); 
  }
  else{    
  daoPer.InsertarPerito(per);
  Validaciones.Aviso("El Perito ha sido registrado", "SISTEMA");
  } 
  Limpiar();
  Enabled(false);
  perito.getTxtCedula().requestFocusInWindow();
}
    private void Eliminar() throws SQLException
{
    String Cadena= perito.getTxtCodigo().getText();
    ResultSet regisPer;
    DaoPerito daoPer=new DaoPerito();
    regisPer=daoPer.BuscarPerito(Cadena);
    if (Cadena.length() > 0)  
    {
      if (regisPer.next())
       {
         daoPer.EliminarPerito(Cadena);
         Validaciones.Aviso("El perito ha sido eliminado", "SISTEMA");
         Limpiar();
         Enabled(false);
         perito.getBtnCancelar().setEnabled(false);
         perito.getBtnGuardar().setEnabled(false);
         perito.getBtnModificar().setEnabled(false);
        }   
    }
}
    @Override 
    public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource().equals(perito.getBtnGuardar()))  
       {
           try {  
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorPerito.class.getName()).log(Level.SEVERE, null, ex);
           }
       }  
       //------------------------------------------------------------------
       if (e.getSource().equals(perito.getBtnCancelar()))  
       {
           try { 
               Eliminar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorPerito.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       //------------------------------------------------------------------
       if (e.getSource().equals(perito.getBtnConsultar()))  
       {
           try { 
               new ControladorConsultarPerito();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorPerito.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       //-------------------------------------------------------------------
       if (e.getSource().equals(perito.getBtnSalirper()))  
       {
         perito.dispose();  
       }  
       //--------------------------------------------------------------------
       
       if (e.getSource().equals(perito.getBtnBuscar()))  
       {
           try {  
               Buscar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorPerito.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       if (e.getSource().equals(perito.getBtnModificar()))  
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

