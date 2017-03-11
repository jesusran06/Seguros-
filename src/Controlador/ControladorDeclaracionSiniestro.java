
package Controlador;

import DAO.DaoCliente;
import DAO.DaoMarca;
import DAO.DaoModelo;
import DAO.DaoReparacion;
import DAO.DaoRepuesto;
import DAO.DaoVehiculo;
import DAO.DaoAnalista;
import Dao.DaoDeclaracionSiniestro;
import Modelo.DeclaracionSiniestro;
import Modelo.Validaciones;
import Vista.GestionDeclaracion;
import Vista.GestionDeclaracionSiniestro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorDeclaracionSiniestro implements ActionListener,KeyListener 
{ 
     private GestionDeclaracionSiniestro siniestro;    

    public ControladorDeclaracionSiniestro() throws SQLException 
    {
      siniestro =new GestionDeclaracionSiniestro();
      siniestro.agregarListener(this);
      siniestro.setVisible(true);
      siniestro.setSize(1030,710);
      llenarComboMarcaCli();
      llenarComboMarcaContra();
      llenarComboModeloCli();
      siniestro.getTxtCodSiniestro().requestFocusInWindow();
      TraerUltimoDS(); 
      llenarComboAnalista();//llena el combo de los analista de la BD
      
      siniestro.getCmbMarcaCli().setEnabled(false);
      siniestro.getCmbModeloCli().setEnabled(false);
      siniestro.getCmbAnoCli().setEnabled(false);
      
      
      //**** KeyListener*****************
    siniestro.getTxtAutoridad().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaAutoridad(e);   
              }      
       }
    );    
     
    siniestro.getTxtOcurrencia().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaOcurrencia(e);   
              }   
       }
    );
    
    
    siniestro.getTxtDescripcion().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaDescripcion(e);   
              } 
      }
    );
    
    siniestro.getTxtCiudad().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCiudad(e);   
              }    
       }
    );
    
    
    siniestro.getTxtEstado().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaEstado(e);   
              }    
       }
    );
    
    siniestro.getTxtCedDecla().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCedDecla(e);   
              }    
       }
    );
    
    siniestro.getTxtNombreDecla().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaNombreDecla(e);   
              }   
       }
    );
    
     siniestro.getTxtApellidoDecla().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaApellidoDecla(e);   
              }  
       }
    );
     
     siniestro.getTxtTlfDecla().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaTlfDecla(e);   
              } 
       }
    );
     
     siniestro.getTxtRelacionDecla().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaRelacion(e);   
              } 
       }
    );
     
     siniestro.getTxtCedCli().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCedulaCli(e);   
              }  
       }
    );
     
     siniestro.getTxtPlacaCli().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaPlacaCli(e);   
              } 
       }
    );
     
     siniestro.getTxtDanosCli().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaDanosCli(e);   
              } 
       }
    );
     
     siniestro.getTxtPlacaContra().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaPlacaContra(e);   
              }  
       }
    );
     
     siniestro.getTxtDanosContra().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaDanosContra(e);   
              }   
       }
    );
     
     siniestro.getTxtCarrContra().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaSerialContra(e);   
              }  
       }
    );
     
      //*****Fin de los KeyListener
    }
//-----------------------------------------------------
    
private void TraerUltimoDS() throws SQLException
{ DaoDeclaracionSiniestro daoDS =  new DaoDeclaracionSiniestro();
  siniestro.getTxtCodSiniestro().setText(daoDS.dsiniestroSiguiente());
}  

//---------------------------------------------
private void ValidaCedulaCli(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtCedCli().getText();
    if (Cadena.length()==9)
      {   
        e.consume();  
        return;
      }
         
}        
//-------------------------------------------------------
private void ValidaAutoridad(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtAutoridad().getText();
    if (Cadena.length()==15)
      {   
        e.consume();  
        return;
      }   
}
//------------------
private void ValidaOcurrencia(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtOcurrencia().getText();
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
    
    Cadena=siniestro.getTxtDescripcion().getText();
    if (Cadena.length()==100)
      {   
        e.consume();  
        return;
      }
}
//------------------
private void ValidaCiudad(KeyEvent e)
{
    String Cadena;
   
    
    Cadena=siniestro.getTxtCiudad().getText();
    if (Cadena.length()==15)
      {   
        e.consume();  
        return;
      }  
 }

//------------------
private void ValidaEstado(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtEstado().getText();
    if (Cadena.length()==15)
      {   
        e.consume();  
        return;
      }  
 }
//-----------------------------------------------------
private void ValidaCedDecla(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtCedDecla().getText();
    if (Cadena.length()==9)
      {   
        e.consume();  
        return;
      }       
}  
//-----------------------------------------------------
private void ValidaNombreDecla(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtNombreDecla().getText();
    if (Cadena.length()==20)
      {   
        e.consume();  
        return;
      }
         
} 
//-----------------------------------------
private void ValidaApellidoDecla(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtApellidoDecla().getText();
    if (Cadena.length()==20)
      {   
        e.consume();  
        return;
      }
         
} 
//--------------------------------------
private void ValidaTlfDecla(KeyEvent e)
{
    String Cadena;
    char Caracter;
    Cadena=siniestro.getTxtTlfDecla().getText();
    if (Cadena.length()==11)
      {   
        e.consume();  
        return;
      }  
   Caracter=e.getKeyChar();
    if (Caracter<'0'|| Caracter>'9')
      e.consume();
    
} 
//-------------------------------------------------
private void ValidaRelacion(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtRelacionDecla().getText();
    if (Cadena.length()==15)
      {   
        e.consume();  
        return;
      }        
} 
//------------------
private void ValidaPlacaCli(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtPlacaCli().getText();
    if (Cadena.length()==7)
      {   
        e.consume();  
        return;
      }    
} 
//--------------------------
private void ValidaDanosCli(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtDanosCli().getText();
    if (Cadena.length()==100)
      {   
        e.consume();  
        return;
      }    
} 
//------------------
private void ValidaPlacaContra(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtPlacaContra().getText();
    if (Cadena.length()==7)
      {   
        e.consume();  
        return;
      }    
} 
//-----------------------------------
private void ValidaDanosContra(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtDanosContra().getText();
    if (Cadena.length()==100)
      {   
        e.consume();  
        return;
      }    
} 
//--------------------------------------
private void ValidaSerialContra(KeyEvent e)
{
    String Cadena;
    
    Cadena=siniestro.getTxtCarrContra().getText();
    if (Cadena.length()==17)
      {   
        e.consume();  
        return;
      }    
}   

private void Cancelar()
{
siniestro.getTxtCedCli().setText("");
siniestro.getTxtNombreCli().setText("");
siniestro.getTxtApellidoCli().setText("");
siniestro.getTxtPlacaCli().setText("");
siniestro.getTxtColorCli().setText("");
siniestro.getCmbMarcaCli().setSelectedIndex(0);
siniestro.getCmbModeloCli().setSelectedIndex(0);
siniestro.getCmbAnoCli().setSelectedIndex(0);
siniestro.getTxtCarrCli().setText("");
siniestro.getTxtDanosCli().setText("");
siniestro.getTxtPlacaContra().setText("");
siniestro.getTxtColorContra().setText("");
siniestro.getCmbMarcaContra().setSelectedIndex(0);
siniestro.getCmbModeloContra().setSelectedIndex(0);
siniestro.getCmbAnoContra().setSelectedIndex(0);
siniestro.getTxtCarrContra().setText("");
siniestro.getTxtDanosContra().setText("");
siniestro.getTxtCedDecla().setText("");
siniestro.getTxtNombreDecla().setText("");
siniestro.getTxtApellidoDecla().setText("");
siniestro.getTxtRelacionDecla().setText("");
siniestro.getTxtTlfDecla().setText("");
siniestro.getCmbAnalista().setSelectedIndex(0);
siniestro.getFtxtFechaOcurr().setText("");
siniestro.getFtxtFechaRegis().setText("");
siniestro.getTxtAutoridad().setText("");
siniestro.getTxtOcurrencia().setText("");
siniestro.getTxtCiudad().setText("");
siniestro.getTxtEstado().setText("");
siniestro.getTxtDescripcion().setText("");
siniestro.getCmbOp().setSelectedIndex(0);


}
//---------------------------------------- 
 private void CancelarCliente()
{
  siniestro.getTxtCedCli().setText("");
  siniestro.getTxtNombreCli().setText("");
  siniestro.getTxtCedCli().requestFocusInWindow(); 
  siniestro.getTxtCedCli().setEditable(true);
}
//---------------------------------------- 
 
 private void llenarComboMarcaContra() throws SQLException //llena los combos
{                                                      //con las descripciones
                                                       // de las marcas
  ResultSet regisMarca;
  DaoMarca daoMarca =  new DaoMarca();
  String infoBD;
             
             regisMarca=daoMarca.ConsultarMarca();
             while (regisMarca.next())
              {
                infoBD=regisMarca.getString("nombre").trim();
                siniestro.getCmbMarcaContra().addItem(infoBD); 
              }  
             
}
//-------------------------------------------------------------
private void llenarComboModeloContra() throws SQLException //llena los combos
{                                                      //con las descripciones
                                                       // de los modelos
  ResultSet regisModelo;
  DaoModelo daoModelo =  new DaoModelo();
  String infoBD = null;
  String cadena; 
  String marca;
  
            siniestro.getCmbModeloContra().removeAllItems();
            siniestro.getCmbModeloContra().addItem("Seleccione");
            regisModelo=daoModelo.ConsultarModelo();         
             cadena = (String)siniestro.getCmbMarcaContra().getSelectedItem();
             cadena=cadena.trim();
             
             while (regisModelo.next())
              { marca =regisModelo.getString("nombremarca").trim();
                if(cadena.equals(marca))
                {
                infoBD=regisModelo.getString("nombremodelo").trim();
                 siniestro.getCmbModeloContra().addItem(infoBD);
                }
              }  
}
//---------------------------------------------------------------------

private void llenarComboMarcaCli() throws SQLException //llena los combos
{                                                      //con las descripciones
                                                       // de las marcas
  ResultSet regisMarca;
  DaoMarca daoMarca =  new DaoMarca();
  String infoBD;
             
             regisMarca=daoMarca.ConsultarMarca();
             while (regisMarca.next())
              {
                infoBD=regisMarca.getString("nombre").trim();
                siniestro.getCmbMarcaCli().addItem(infoBD); 
              }  
             
}
//-------------------------------------------------------------
private void llenarComboModeloCli() throws SQLException //llena los combos
{                                                      //con las descripciones
                                                       // de los modelos
  ResultSet regisModelo;
  DaoModelo daoModelo =  new DaoModelo();
  String infoBD = null;
            siniestro.getCmbModeloCli().removeAllItems();
            siniestro.getCmbModeloCli().addItem("Seleccione");
            regisModelo=daoModelo.ConsultarModelo();  
             
             while (regisModelo.next())
              { 
                 infoBD=regisModelo.getString("nombremodelo").trim();
                 siniestro.getCmbModeloCli().addItem(infoBD);
                }
}  


//-----------------------------------------------------------------
private void llenarComboAnalista() throws SQLException //llena el combo
{                                                      //con las descripciones
                                                       // de los analistas
  ResultSet regisAnalista;
  DaoAnalista daoAnalista =  new DaoAnalista();
  String infoBD = null;
  
            //siniestro.getCmbAnalista().addItem("Seleccione");
            regisAnalista=daoAnalista.ConsultarAnalista();  
             while (regisAnalista.next())
              { infoBD=regisAnalista.getString("codigoana").trim()+"-";
             infoBD=infoBD+regisAnalista.getString("nombre").trim()+"-";
             infoBD=infoBD+regisAnalista.getString("apellido").trim();
             siniestro.getCmbAnalista().addItem(infoBD); 
              }  
}
//------------------------------------------------------------------
 private void BuscarCliente() throws SQLException
{
  String Cadena= siniestro.getTxtCedCli().getText();
  
  if (Cadena.length() > 0) 
  { 
    siniestro.getTxtNombreCli().setText(""); 
    siniestro.getTxtApellidoCli().setText(""); 
    ResultSet regis;
    DaoCliente daoCli=new DaoCliente();
    regis=daoCli.BuscarCliente(Cadena);
  
    if (regis.next())
     {   
         if(regis.getString("status").trim().equals("activo"))
         {
           
           siniestro.getTxtNombreCli().setText(regis.getString("nombre").trim());
           siniestro.getTxtApellidoCli().setText(regis.getString("apellido").trim());
          
        }           
         else{
           Validaciones.Aviso("El cliente está eliminado", "ATENCIÓN");
          
           siniestro.getTxtCedCli().setEditable(true);
           CancelarCliente();
         }
     }
         
     else
     { 
         Validaciones.Aviso("El cliente no está registrado", "ATENCIÓN");
         siniestro.getTxtCedCli().setEditable(true);
         CancelarCliente();
           
     }
     siniestro.getTxtCedCli().requestFocusInWindow();
     }
}
 //----------------------------------
 private void BuscarVehiculoCli() throws SQLException
{

  String Cadena= siniestro.getTxtPlacaCli().getText();
  
  if (Cadena.length() > 0)  
  {
    siniestro.getTxtPlacaCli().setText("");
    siniestro.getTxtColorCli().setText("");
    siniestro.getCmbMarcaCli().setSelectedIndex(0);
    siniestro.getCmbModeloCli().setSelectedIndex(0);
    siniestro.getCmbAnoCli().setSelectedIndex(0);
    siniestro.getTxtCarrCli().setText("");
    
    
    ResultSet regis;
    DaoVehiculo daoVe=new DaoVehiculo();
    
  regis=daoVe.BuscarVehiculo(Cadena);
    
    if (regis.next())
     {
       if(regis.getString("status").trim().equals("activo"))
       {
       siniestro.getTxtPlacaCli().setText(regis.getString("placa").trim());
       siniestro.getCmbMarcaCli().setSelectedItem(regis.getString("marca").trim());
       siniestro.getCmbModeloCli().setSelectedItem(regis.getString("modelo").trim());
       siniestro.getTxtCarrCli().setText(regis.getString("serialcarroceria").trim());
       siniestro.getCmbAnoCli().setSelectedItem(regis.getString("ano").trim());
       siniestro.getTxtColorCli().setText(regis.getString("color").trim());
       siniestro.getTxtDanosCli().requestFocusInWindow();
       siniestro.getTxtDanosCli().setEditable(true);
       
  
       }           
         else{
           Validaciones.Aviso("El vehículo está eliminado", "SISTEMA");
           siniestro.getTxtDanosCli().setEditable(false);
           
           //CancelarVe();
            }
        }
         
     else
     {
           Validaciones.Aviso("El vehículo no existe!","ATENCIÓN"); 
           siniestro.getTxtDanosCli().setEditable(false);
        
           
     }
     siniestro.getTxtPlacaCli().requestFocusInWindow();
     }
} 
//------------------------------------------------- 
 
 private void EnabledVeContra(boolean status)//habilita-deshabilita los campos del
                                             //panel de vehiculo contrario
 {
   
    siniestro.getTxtColorContra().setEditable(status);
    siniestro.getCmbMarcaContra().setEnabled(status);
    siniestro.getCmbModeloContra().setEnabled(status);
    siniestro.getCmbAnoContra().setEnabled(status);
    siniestro.getTxtCarrContra().setEditable(status);
 
 }
private void BuscarVehiculoContra() throws SQLException
{

  String Cadena= siniestro.getTxtPlacaContra().getText();
  
  if (Cadena.length() > 0)  
  {
  
    siniestro.getTxtColorContra().setText("");
    siniestro.getCmbMarcaContra().setSelectedIndex(0);
    siniestro.getCmbModeloContra().setSelectedIndex(0);
    siniestro.getCmbAnoContra().setSelectedIndex(0);
    siniestro.getTxtCarrContra().setText("");
    
    
    ResultSet regis;
    DaoVehiculo daoVe=new DaoVehiculo();
    
  regis=daoVe.BuscarVehiculo(Cadena);
    
    if (regis.next())
     {
       if(regis.getString("status").trim().equals("activo"))
       {
       siniestro.getTxtPlacaContra().setText(regis.getString("placa").trim());
       siniestro.getCmbMarcaContra().setSelectedItem(regis.getString("marca").trim());
       siniestro.getCmbModeloContra().setSelectedItem(regis.getString("modelo").trim());
       siniestro.getTxtCarrContra().setText(regis.getString("serialcarroceria").trim());
       siniestro.getCmbAnoContra().setSelectedItem(regis.getString("ano").trim());
       siniestro.getTxtColorContra().setText(regis.getString("color").trim());
       siniestro.getTxtDanosContra().requestFocusInWindow();
       siniestro.getTxtDanosContra().setEditable(true);
       EnabledVeContra(false);
       }           
         else{
           Validaciones.Aviso("El vehículo está eliminado", "ATENCIÓN");
            siniestro.getTxtPlacaContra().setEditable(true);
           EnabledVeContra(true);
            }
        } 
     else
     {
           Validaciones.Aviso("El vehículo no está registrado","ATENCIÓN");
           siniestro.getTxtPlacaContra().setEditable(true);
           EnabledVeContra(true);
     }
     siniestro.getTxtPlacaContra().requestFocusInWindow();
     }               
  }   

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(siniestro.getBtnGuardar()))  
       {
           try {
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorDeclaracionSiniestro.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       if (e.getSource().equals(siniestro.getCmbOp()))  
       {
           if(siniestro.getCmbOp().getSelectedIndex()==1)
           {
                   siniestro.getjPanelContra().setVisible(true);
           }else{
           siniestro.getjPanelContra().setVisible(false);
           }
           
       }
       if(e.getSource().equals(siniestro.getCmbMarcaContra()))
       {
           try {
               llenarComboModeloContra();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorDeclaracionSiniestro.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       if(e.getSource().equals(siniestro.getBtnBuscarCli()))
       {   try {
           BuscarCliente();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorDeclaracionSiniestro.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       if(e.getSource().equals(siniestro.getBtnBuscarVCli()))
       {
           try { 
               BuscarVehiculoCli();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorDeclaracionSiniestro.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       if(e.getSource().equals(siniestro.getBtnBuscarContra()))
       {
           try {
               BuscarVehiculoContra();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorDeclaracionSiniestro.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   } 
    
    private void Grabar() throws SQLException
{
  String Cadena;
  Float monto=0.0f;
  DeclaracionSiniestro info;
  
  Cadena=siniestro.getTxtCodSiniestro().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Codigo de Siniestro Vacio", "ATENCIÓN");   
     siniestro.getTxtCodSiniestro().requestFocusInWindow();
     return;
   }
Cadena=siniestro.getFtxtFechaOcurr().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Fecha de ocurrrencia Vacia", "ATENCIÓN");   
     siniestro.getFtxtFechaOcurr().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtAutoridad().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Autoridad Vacia", "ATENCIÓN");   
     siniestro.getTxtAutoridad().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtOcurrencia().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Lugar de ocurrencia Vacia", "ATENCIÓN");   
     siniestro.getTxtOcurrencia().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtOcurrencia().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Lugar de ocurrencia Vacia", "ATENCIÓN");   
     siniestro.getTxtOcurrencia().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtCiudad().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Ciudad Vacia", "ATENCIÓN");   
     siniestro.getTxtCiudad().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtEstado().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Estado Vacio", "ATENCIÓN");   
     siniestro.getTxtEstado().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtDescripcion().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Descripcion Vacio", "ATENCIÓN");   
     siniestro.getTxtDescripcion().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtCedDecla().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Cedula de declarante Vacio", "ATENCIÓN");   
     siniestro.getTxtCedDecla().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtNombreDecla().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Nombre de declarante Vacio", "ATENCIÓN");   
     siniestro.getTxtNombreDecla().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtApellidoDecla().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Nombre de declarante Vacio", "ATENCIÓN");   
     siniestro.getTxtApellidoDecla().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtTlfDecla().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Telefono de declarante Vacio", "ATENCIÓN");   
     siniestro.getTxtTlfDecla().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtRelacionDecla().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Relacion de declarante Vacio", "ATENCIÓN");   
     siniestro.getTxtRelacionDecla().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtCedCli().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Cedula de cliente Vacio", "ATENCIÓN");   
     siniestro.getTxtCedCli().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtNombreCli().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Nombre de cliente Vacio", "ATENCIÓN");   
     siniestro.getTxtNombreCli().requestFocusInWindow();
     return;
   }
  
 
   String marcacli=(String)siniestro.getCmbMarcaCli().getSelectedItem();
     marcacli=marcacli.trim();
   if (siniestro.getCmbMarcaCli().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione la marca de vehiculo del cliente", "SISTEMA"); 
     siniestro.getCmbMarcaCli().requestFocusInWindow();
     return;
   }

   
   String modelocli=(String)siniestro.getCmbModeloCli().getSelectedItem();
     modelocli=modelocli.trim();
   if (siniestro.getCmbModeloCli().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione el modelo de vehiculo del cliente", "SISTEMA"); 
     siniestro.getCmbModeloCli().requestFocusInWindow();
     return;
   }
   
  Cadena=siniestro.getTxtColorCli().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Color de vehiculo de cliente Vacio", "ATENCIÓN");   
     siniestro.getTxtColorCli().requestFocusInWindow();
     return;
   }


Cadena=siniestro.getTxtPlacaCli().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Placa de vehiculo de cliente Vacio", "ATENCIÓN");   
     siniestro.getTxtPlacaCli().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtDanosCli().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Descripcion de daños del vehiculo de cliente Vacio", "ATENCIÓN");   
     siniestro.getTxtDanosCli().requestFocusInWindow();
     return;
   }
String anocli=(String)siniestro.getCmbAnoCli().getSelectedItem();
     anocli=anocli.trim();
   if (siniestro.getCmbAnoCli().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione el año de vehiculo del cliente", "SISTEMA"); 
     siniestro.getCmbAnoCli().requestFocusInWindow();
     return;
   }

if (!Validaciones.isDate(siniestro.getFtxtFechaOcurr().getText()))
    {
     Validaciones.Aviso("Error en la fecha de ocurrencia", "sistema"); 
     siniestro.getFtxtFechaOcurr().requestFocusInWindow();
     return;
   } 

if (siniestro.getCmbAnalista().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione el analista", "SISTEMA"); 
     siniestro.getCmbAnalista().requestFocusInWindow();
     return;
   }

if (siniestro.getCmbOp().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione la opcion de vehiculo contrario siniestrado", "SISTEMA"); 
     siniestro.getCmbOp().requestFocusInWindow();
     return;
   }
//Convirtiendo las fecha a dato tipo date
Date FechaO=null;
FechaO= Validaciones.CnvStringFecha(siniestro.getFtxtFechaOcurr().getText());

Date FechaR=null;
FechaR= Validaciones.CnvStringFecha(siniestro.getFtxtFechaRegis().getText());
  

   String contenidoCombo;
   String [] arrContenidoCombo;
   contenidoCombo=(String)siniestro.getCmbAnalista().getSelectedItem();
   arrContenidoCombo=contenidoCombo.split("-");

   String codana=arrContenidoCombo[0];
   codana =codana.trim();
   String nombreana=arrContenidoCombo[1];
   nombreana =nombreana.trim();
   
   if(siniestro.getCmbOp().getSelectedIndex()==1)
   {
       
     String anocontra=(String)siniestro.getCmbAnoContra().getSelectedItem();
     anocontra=anocontra.trim();
   if (siniestro.getCmbAnoContra().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione el año de vehiculo del contrario", "SISTEMA"); 
     siniestro.getCmbAnoContra().requestFocusInWindow();
     return;
   }
Cadena=siniestro.getTxtDanosContra().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Descripcion de daños del vehiculo contrario Vacio", "ATENCIÓN");   
     siniestro.getTxtDanosContra().requestFocusInWindow();
     return;
   }

String marcacontra=(String)siniestro.getCmbMarcaContra().getSelectedItem();
     marcacontra=marcacontra.trim();
   if (siniestro.getCmbMarcaContra().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione la marca de vehiculo del contrario", "SISTEMA"); 
     siniestro.getCmbMarcaContra().requestFocusInWindow();
     return;
   }

String modelocontra=(String)siniestro.getCmbModeloContra().getSelectedItem();
     modelocontra=modelocontra.trim();
   if (siniestro.getCmbModeloContra().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione el modelo de vehiculo del contrario", "SISTEMA"); 
     siniestro.getCmbModeloContra().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtColorContra().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Color de vehiculo del contrario Vacio", "ATENCIÓN");   
     siniestro.getTxtColorContra().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtColorContra().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Color de vehiculo contrario Vacio", "ATENCIÓN");   
     siniestro.getTxtColorContra().requestFocusInWindow();
     return;
   }


Cadena=siniestro.getTxtPlacaContra().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Placa de vehiculo contrario Vacio", "ATENCIÓN");   
     siniestro.getTxtPlacaContra().requestFocusInWindow();
     return;
   }

Cadena=siniestro.getTxtDanosContra().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Descripcion de daños del vehiculo contrario Vacio", "ATENCIÓN");   
     siniestro.getTxtDanosContra().requestFocusInWindow();
     return;
     }

Cadena=siniestro.getTxtCarrContra().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Serial de carrocería del vehiculo contrario Vacio", "ATENCIÓN");   
     siniestro.getTxtCarrContra().requestFocusInWindow();
     return;
     }
  info=new DeclaracionSiniestro(siniestro.getTxtCodSiniestro().getText().trim(), 
                                FechaO, 
                                FechaR,
                                siniestro.getTxtOcurrencia().getText().trim(),
                                siniestro.getTxtCiudad().getText().trim(),
                                siniestro.getTxtEstado().getText().trim(),
                                siniestro.getTxtAutoridad().getText().trim(),
                                siniestro.getTxtDescripcion().getText().trim(),
                                siniestro.getTxtCedDecla().getText().trim(),
                                siniestro.getTxtNombreDecla().getText().trim(),
                                siniestro.getTxtApellidoDecla().getText().trim(),
                                siniestro.getTxtTlfDecla().getText().trim(),
                                siniestro.getTxtRelacionDecla().getText().trim(),
                                siniestro.getTxtCedCli().getText().trim(),
                                siniestro.getTxtNombreCli().getText().trim(),
                                siniestro.getTxtPlacaCli().getText().trim(),
                                marcacli,
                                modelocli,
                                siniestro.getTxtCarrCli().getText().trim(),
                                anocli,
                                siniestro.getTxtColorCli().getText().trim(),
                                siniestro.getTxtDanosCli().getText().trim(),
                                siniestro.getTxtPlacaContra().getText().trim(),
                                marcacontra,
                                modelocontra,
                                siniestro.getTxtCarrContra().getText().trim(),
                                anocontra.trim(),
                                siniestro.getTxtColorContra().getText().trim(),
                                siniestro.getTxtDanosContra().getText().trim(),
                                codana,
                                nombreana,
                                siniestro.getTxtApellidoCli().getText().trim(),
                                "activo");
   }else{ //Graba en el caso de que no exista un vehículo contrario
       
       info=new DeclaracionSiniestro(siniestro.getTxtCodSiniestro().getText().trim(), 
                                FechaO, 
                                FechaR,
                                siniestro.getTxtOcurrencia().getText().trim(),
                                siniestro.getTxtCiudad().getText().trim(),
                                siniestro.getTxtEstado().getText().trim(),
                                siniestro.getTxtAutoridad().getText().trim(),
                                siniestro.getTxtDescripcion().getText().trim(),
                                siniestro.getTxtCedDecla().getText().trim(),
                                siniestro.getTxtNombreDecla().getText().trim(),
                                siniestro.getTxtApellidoDecla().getText().trim(),
                                siniestro.getTxtTlfDecla().getText().trim(),
                                siniestro.getTxtRelacionDecla().getText().trim(),
                                siniestro.getTxtCedCli().getText().trim(),
                                siniestro.getTxtNombreCli().getText().trim(),
                                siniestro.getTxtPlacaCli().getText().trim(),
                                marcacli,
                                modelocli,
                                siniestro.getTxtCarrCli().getText().trim(),
                                anocli,
                                siniestro.getTxtColorCli().getText().trim(),
                                siniestro.getTxtDanosCli().getText().trim(),
                                "nul",
                                "nul",
                                "nul",
                                "nul",
                                "nul",
                                "nul",
                                "nul",
                                codana,
                                nombreana,
                                siniestro.getTxtApellidoCli().getText().trim(),
                                "activo");
       
   }

  DaoDeclaracionSiniestro daoDS=new DaoDeclaracionSiniestro();
  daoDS.InsertarDeclaracionSiniestro(info);
  Validaciones.Aviso("La declaracion fue registada", "ATENCIÓN");
 Cancelar();
}

}
  
 
 
