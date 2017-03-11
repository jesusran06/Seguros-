/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author jesus
 */
import Modelo.Servicio;
import Vista.GestionServicio;
import DAO.DaoServicio;
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


public class ControladorServicio implements ActionListener,KeyListener{
    private GestionServicio servicios;
    private Boolean Existe = false;
    public ControladorServicio(){
      servicios =new GestionServicio();
      servicios.agregarListener(this);
      servicios.setVisible(true);     
      servicios.getJtexcodser().requestFocusInWindow();
      servicios.getButeliminarser().setEnabled(false);
      servicios.getButmodificarser().setEnabled(false);
      Enabled(false);  
    
      servicios.getJtexcodser().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCodigo(e);   
              }           
       }
    );               
    //***************
    servicios.getJtexnomser().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaNombre(e);   
              }    
            
           
       }
    );

    servicios.getTexadesc().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaDescripcion(e);   
              }           
       }
    );               
    
    servicios.getJtexcostser().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCosto(e);   
              }           
       }
    );
    }
       
   private void ValidaCodigo(KeyEvent e)
{
    String Cadena;
    
    Cadena=servicios.getJtexcodser().getText();
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
    
    Cadena=servicios.getJtexnomser().getText();
    if (Cadena.length()==30)
      {   
        e.consume();  
        return;
      }    
} 
//------------------    
private void ValidaDescripcion(KeyEvent e)
{
    String Cadena;
    
    Cadena=servicios.getTexadesc().getText();
    if (Cadena.length()==160)
      {   
        e.consume();  
        return;
      }
}    
    private void ValidaCosto(KeyEvent e)
{
    String Cadena;
    char Caracter;
    Cadena=servicios.getJtexcostser().getText();
    if (Cadena.length()==12)
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
  servicios.getJtexcodser().setEditable(!status);
  servicios.getJtexcostser().setEditable(status);
  servicios.getTexadesc().setEditable(status);
  servicios.getJtexnomser().setEditable(status);
    }        
//------------------

    private void Limpiar()
    {
        Existe=false;
  servicios.getJtexcodser().requestFocusInWindow();
  servicios.getJtexcodser().setText("SER-");
  servicios.getJtexcostser().setText("");
  servicios.getJtexnomser().setText("");
  servicios.getTexadesc().setText("");
  servicios.getButmodificarser().setEnabled(false);
  servicios.getButeliminarser().setEnabled(false);
  servicios.getButguardarser().setEnabled(false);
    }
    private void Buscar() throws SQLException
{
String Cadena= servicios.getJtexcodser().getText();
  
  if (Cadena.length() > 0) 
  { servicios.getJtexcostser().setText("");
    servicios.getJtexnomser().setText("");
    servicios.getTexadesc().setText("");
    ResultSet regis;
    DaoServicio DaoSer = new DaoServicio();
    regis = DaoSer.BuscarServicio(Cadena);
    
    if (regis.next())
     {  Existe=true; 
     if(regis.getString("status").trim().equals("activo")){
           servicios.getJtexnomser().setText(regis.getString("nombser").trim());
           servicios.getTexadesc().setText(regis.getString("descser").trim()); 
           servicios.getJtexcostser().setText(regis.getString("costser").trim());
           servicios.getButeliminarser().setEnabled(true);
           servicios.getButguardarser().setEnabled(true);
           servicios.getButmodificarser().setEnabled(true);
     }    
     else{
         Existe=true;
         Validaciones.Aviso("El servicio está eliminado", "SISTEMA");
           servicios.getButeliminarser().setEnabled(false);
           servicios.getButguardarser().setEnabled(false);
           servicios.getButmodificarser().setEnabled(false);
           Limpiar();
           Enabled(false);
     
     }
     } 
    else{Existe=false;
           int resp=Validaciones.DialogConfirm("El servicio no existe, ¿Desea registrarlo?", "Atención");
           switch (resp)
            {
         case 0: servicios.getJtexnomser().requestFocusInWindow(); 
                 Enabled(true);
                 servicios.getButmodificarser().setEnabled(false);
                 servicios.getButguardarser().setEnabled(true);
                 servicios.getButeliminarser().setEnabled(false);
                 break;
         
         case 1: Limpiar();
                 break;
     }
    }
    }

    }
    private void Grabar() throws SQLException{
  String Cadena;
  Servicio ser;
  
  Cadena=servicios.getJtexcodser().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Código vacío", "SISTEMA");   
     servicios.getJtexcodser().requestFocusInWindow();
     return;
   }   
  
  Cadena=servicios.getJtexnomser().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Nombre Vacío", "SISTEMA"); 
     servicios.getJtexnomser().requestFocusInWindow();
     return;
   } 
 Cadena=servicios.getTexadesc().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Descripción vacía", "SISTEMA"); 
     servicios.getTexadesc().requestFocusInWindow();
     return;
   }       
  
  Cadena=servicios.getJtexcostser().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Costo vacío", "SISTEMA"); 
     servicios.getJtexcostser().requestFocusInWindow();
     return;
   }
  ser = new Servicio(servicios.getJtexcodser().getText().trim(), 
                  servicios.getJtexnomser().getText().trim(),
                  servicios.getTexadesc().getText().trim(),
                  servicios.getJtexcostser().getText().trim(), 
                  "activo");


  DaoServicio daoser=new DaoServicio();
   
    
  if (Existe){
      daoser.ModificarServicio(ser);
      Validaciones.Aviso("El servicio ha sido modificado", "SISTEMA"); 
  }
     
  else{
     daoser.InsertServicio(ser);
     Validaciones.Aviso("El servicio ha sido guardado", "SISTEMA");
  }
  
  Limpiar();
  Enabled(false);
  servicios.getJtexcodser().requestFocusInWindow();  

} 
    private void Eliminar() throws SQLException
{
    String Cadena= servicios.getJtexcodser().getText();
    ResultSet regisSer;
    DaoServicio daoSer=new DaoServicio();
    regisSer=daoSer.BuscarServicio(Cadena);
    if (Cadena.length() > 0)  
    {
      if (regisSer.next())
       {
         daoSer.EliminarServicio(Cadena);
         Validaciones.Aviso("El servicio ha sido eliminado", "SISTEMA");
         Limpiar();
         Enabled(false);
         servicios.getButeliminarser().setEnabled(false);
         servicios.getButguardarser().setEnabled(false);
         servicios.getButmodificarser().setEnabled(false);
        }   
    }
}
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
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(servicios.getButguardarser()))  
       {
           try {  
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorServicio.class.getName()).log(Level.SEVERE, null, ex);
           }
       }  
       if (e.getSource().equals(servicios.getButmodificarser()))
       {
           Enabled (true);
       }
       //------------------------------------------------------------------
       if (e.getSource().equals(servicios.getButconsultarser()))  
       {
          try { 
               new ControladorConsultarServicio();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorServicio.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
       
       //-------------------------------------------------------------------
       if (e.getSource().equals(servicios.getButsalirser()))  
       {
         servicios.dispose();  
       }  
       //--------------------------------------------------------------------
       if (e.getSource().equals(servicios.getButeliminarser())){
            try { 
               Eliminar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorServicio.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       if (e.getSource().equals(servicios.getButbuscarser1()))  
       {
           try {  
               Buscar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorServicio.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
    }
}
