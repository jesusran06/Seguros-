
package Controlador;

import DAO.DaoCorredor;
import Modelo.Corredor;
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
import Vista.GestionCorredor;

public class ControladorCorredor implements ActionListener,KeyListener
{
    
    private GestionCorredor corredor; 
    private Boolean Existe=false;
    ControladorCorredor()
    {
        corredor=new GestionCorredor();
        corredor.agregarListener(this);
        corredor.setVisible(true);  
        corredor.getTxtCodigo().requestFocusInWindow();
        corredor.getBtnBuscar().setEnabled(true);
        corredor.getBtnCancelar().setEnabled(false);
        corredor.getBtnConsultar().setEnabled(true);
        corredor.getBtnGuardar().setEnabled(false);
        corredor.getBtnSalir().setEnabled(true);
        corredor.getButmodificarcorr().setEnabled(false);
        corredor.getTxtCodigo().setText("COR-");
        
        Enabled(false);
        
        corredor.getTxtCedula().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCedula(e);   
              }           
       }
    );               
    //***************
    corredor.getTxtNombre().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaNombre(e);   
              }    
            
           
       }
    );   
    corredor.getTxtEmail().addKeyListener(new KeyAdapter()
    {
        
        @Override
            public void keyTyped (KeyEvent e)
              {     
                  ValidaEmail(e);   
              }    
    }
    );
    //***************
     corredor.getTxtApellido().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaApellido(e);   
              }    
       }
    );  
     corredor.getJtxtadirecc().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaDireccion(e);   
              }    
       }
    ); 
    //***************
     corredor.getTxtTlf().addKeyListener(new KeyAdapter()
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
    
    Cadena=corredor.getTxtNombre().getText();
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
    
    Cadena=corredor.getTxtNombre().getText();
    if (Cadena.length()==30)
      {   
        e.consume();  
        return;
      }    
}
private void ValidarCódigo(KeyEvent e){
    String Cadena;
    
    Cadena=corredor.getTxtCodigo().getText();
    
    if (Cadena.length()==8){
        e.consume();
        return;
    }
}
private void ValidaCedula(KeyEvent e)
{
    String Cadena;
    
    Cadena=corredor.getTxtCedula().getText();
    if (Cadena.length()==9)
      {   
        e.consume();  
        return;
      }
}   
private void ValidaEmail(KeyEvent e)
{
    String cadena;
    cadena=corredor.getTxtEmail().getText();
    if (cadena.length()==30)
        e.consume();
    return;
}
private void ValidaDireccion(KeyEvent e)
{
    String cadena;
    cadena=corredor.getJtxtadirecc().getText();
    if (cadena.length()==160)
        e.consume();
    return;
}
//------------------
private void ValidaTlf(KeyEvent e)
{
    String Cadena;
    char Caracter;
    Cadena=corredor.getTxtTlf().getText();
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
  corredor.getTxtCodigo().setEditable(!status);
  corredor.getTxtCedula().setEditable(status);
  corredor.getTxtNombre().setEditable(status);
  corredor.getTxtApellido().setEditable(status);
  corredor.getTxtTlf().setEditable(status);
  corredor.getJtxtadirecc().setEditable(status);
  corredor.getTxtEmail().setEditable(status);
}
    
    private void Limpiar()
{
  Existe=false;  
  corredor.getTxtCedula().setText("");
  corredor.getTxtNombre().setText("");
  corredor.getTxtApellido().setText("");
  corredor.getTxtTlf().setText("");
  corredor.getJtxtadirecc().setText("");
  corredor.getTxtEmail().setText("");
  corredor.getTxtCodigo().setText("COR-");
  corredor.getTxtCodigo().requestFocusInWindow();
  Enabled(false);
} 
    private void Buscar() throws SQLException
{
  String Cadena= corredor.getTxtCodigo().getText();
  
  if (Cadena.length() > 0) 
  { corredor.getTxtNombre().setText("");
    corredor.getTxtCedula().setText("");
    corredor.getTxtApellido().setText("");
    corredor.getTxtTlf().setText("");
    corredor.getJtxtadirecc().setText("");
    corredor.getTxtEmail().setText("");
    
    ResultSet regis;
    DaoCorredor daoCor=new DaoCorredor();
    regis=daoCor.BuscarCorredor(Cadena);
    
    if (regis.next())
     {  Existe=true; 
     if(regis.getString("status").trim().equals("activo")){
         corredor.getTxtNombre().setText(regis.getString("nomcorr").trim());
           corredor.getTxtTlf().setText(regis.getString("telecorr").trim());
           corredor.getTxtApellido().setText(regis.getString("apellcorr").trim()); 
           corredor.getTxtCedula().setText(regis.getString("cedcorr").trim());
           corredor.getTxtEmail().setText(regis.getString("correocorr").trim());
           corredor.getJtxtadirecc().setText(regis.getString("direcorr").trim());
           corredor.getBtnCancelar().setEnabled(true);
           corredor.getBtnGuardar().setEnabled(true);
           corredor.getButmodificarcorr().setEnabled(true);
     }    
     else{
         Existe=true;
         Validaciones.Aviso("El corredor está eliminado", "SISTEMA");
           corredor.getBtnCancelar().setEnabled(false);
           corredor.getBtnGuardar().setEnabled(false);
           corredor.getButmodificarcorr().setEnabled(false);
           Limpiar();
           Enabled(false);
     }
     } 
    else{Existe=false;
           int resp=Validaciones.DialogConfirm("El corredor no existe, ¿Desea registrarlo?", "Atención");
           switch (resp)
            {
         case 0: corredor.getTxtNombre().requestFocusInWindow(); 
                 Enabled(true);
                 corredor.getButmodificarcorr().setEnabled(false);
                 corredor.getBtnGuardar().setEnabled(true);
                 corredor.getBtnCancelar().setEnabled(false);
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
  Corredor cor;
  
  Cadena=corredor.getTxtCedula().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Cedula Vacia", "SISTEMA");   
     corredor.getTxtCedula().requestFocusInWindow();
     return;
   }   
  
  Cadena=corredor.getTxtNombre().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Nombre Vacio", "SISTEMA"); 
     corredor.getTxtNombre().requestFocusInWindow();
     return;
   }       

Cadena=corredor.getTxtApellido().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Direccion Vacio", "SISTEMA"); 
     corredor.getTxtApellido().requestFocusInWindow();
     return;
   }       
  
  Cadena=corredor.getTxtTlf().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Teléfono vacio", "SISTEMA"); 
     corredor.getTxtTlf().requestFocusInWindow();
     return;
   }
  
   Cadena=corredor.getJtxtadirecc().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Direccion vacia", "SISTEMA"); 
     corredor.getJtxtadirecc().requestFocusInWindow();
     return;
   }
  
   Cadena=corredor.getTxtEmail().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("E-mail vacio", "SISTEMA"); 
     corredor.getTxtEmail().requestFocusInWindow();
     return;
   }
   
  
  cor = new Corredor(corredor.getTxtCodigo().getText().trim(),
                  corredor.getTxtNombre().getText().trim(),
                  corredor.getTxtTlf().getText().trim(),
                  corredor.getTxtApellido().getText().trim(),
                  corredor.getTxtCedula().getText().trim(), 
                  corredor.getTxtEmail().getText().trim(),
                  corredor.getJtxtadirecc().getText().trim(),
                  "activo");

 
  DaoCorredor daoCor=new DaoCorredor();
   
  
  if (Existe)  
  {
  daoCor.ModificarCorredor(cor);
  Validaciones.Aviso("El Corredor ha sido modificado", "SISTEMA"); 
  }
  else{    
  daoCor.InsertarCorredor(cor);
  Validaciones.Aviso("El Corredor ha sido registrado", "SISTEMA");
  } 
  Limpiar();
  Enabled(false);
  corredor.getTxtCedula().requestFocusInWindow();
}
    private void Eliminar() throws SQLException
{
    String Cadena= corredor.getTxtCodigo().getText();
    ResultSet regisCor;
    DaoCorredor daoCor=new DaoCorredor();
    regisCor=daoCor.BuscarCorredor(Cadena);
    if (Cadena.length() > 0)  
    {
      if (regisCor.next())
       {
         daoCor.EliminarCorredor(Cadena);
         Validaciones.Aviso("El corredor ha sido eliminado", "SISTEMA");
         Limpiar();
         Enabled(false);
         corredor.getBtnCancelar().setEnabled(false);
         corredor.getBtnGuardar().setEnabled(false);
         corredor.getButmodificarcorr().setEnabled(false);
        }   
    }
}
    @Override
   public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource().equals(corredor.getBtnGuardar()))  
       {
           try {  
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorCorredor.class.getName()).log(Level.SEVERE, null, ex);
           }
       }  
       //------------------------------------------------------------------
       if (e.getSource().equals(corredor.getBtnCancelar()))  
       {
           try { 
               Eliminar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorCorredor.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       //------------------------------------------------------------------
       if (e.getSource().equals(corredor.getBtnConsultar()))  
       {
           try { 
               new ControladorConsultarCorredor();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorCorredor.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       //-------------------------------------------------------------------
       if (e.getSource().equals(corredor.getBtnSalir()))  
       {
         corredor.dispose();  
       }  
       //--------------------------------------------------------------------
       
       if (e.getSource().equals(corredor.getBtnBuscar()))  
       {
           try {  
               Buscar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorCorredor.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       if (e.getSource().equals(corredor.getButmodificarcorr()))  
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
    