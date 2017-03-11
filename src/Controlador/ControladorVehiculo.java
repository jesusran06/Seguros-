package Controlador;


import DAO.DaoMarca;
import DAO.DaoModelo;
import DAO.DaoVehiculo;
import Modelo.Validaciones;
import Modelo.Vehiculo;
import Vista.GestionVehiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorVehiculo implements ActionListener,KeyListener
{
    private GestionVehiculo vehiculo;
    private Boolean Existe =false;
    
    public ControladorVehiculo() throws SQLException 
    {
    
      vehiculo=new GestionVehiculo();
      vehiculo.agregarListener(this);
      vehiculo.setVisible(true);
      llenarComboMarca();      
      vehiculo.getTxtPlaca().requestFocusInWindow();
      vehiculo.setSize(560, 590);
      
      EnabledVe(false);
      //**** KeyListener*****************
    vehiculo.getTxtPlaca().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaPlaca(e);   
              }           
       }
    );               
    //***************
    vehiculo.getTxtSerialCarr().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCarroceria(e);   
              }    
            
           
       }
    );    
     
    vehiculo.getTxtColor().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaColor(e);   
              }    
       
       }
    );  
    
    vehiculo.getTxtPrecioVe().addKeyListener(new KeyAdapter()
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


private void ValidaCarroceria(KeyEvent e)
{
    String Cadena;
    
    Cadena=vehiculo.getTxtSerialCarr().getText();
    if (Cadena.length()==17)
      {   
        e.consume();  
        return;
      }    
}
//------------------
private void ValidaPlaca(KeyEvent e)
{
    String Cadena;
    
    Cadena=vehiculo.getTxtPlaca().getText();
    if (Cadena.length()==7)
      {   
        e.consume();  
        return;
      }    
} 
//------------------
private void ValidaColor(KeyEvent e)
{
    String Cadena;
    
    Cadena=vehiculo.getTxtColor().getText();
    if (Cadena.length()==20)
      {   
        e.consume();  
        return;
      }    
} 
//------------------
private void ValidaPrecio(KeyEvent e)
{
    String Cadena;
    char Caracter;
    
    Cadena=vehiculo.getTxtPrecioVe().getText();
    if (Cadena.length()==11)
      {   
        e.consume();  
        return;
      }
    
  
    Caracter=e.getKeyChar();
    
    if (Caracter =='.')
      return;  
        
    
    if (Caracter <'0' || Caracter > '9')
      e.consume();
    
}        
//------------------  
private void EnabledVe(boolean status)
{ vehiculo.getTxtPlaca().setEditable(!status);
  vehiculo.getCmbVehiculo().setEnabled(status);
  vehiculo.getTxtColor().setEditable(status);
  vehiculo.getCmbMarca().setEnabled(status);
  vehiculo.getCmbModelo().setEnabled(status);
  vehiculo.getCmbAno().setEnabled(status);
  vehiculo.getTxtSerialCarr().setEditable(status);
  vehiculo.getTxtPrecioVe().setEditable(status);
  vehiculo.getTxtDescrip().setEditable(status);
}
//------------------

private void CancelarVe()
{  Existe=false;
  vehiculo.getTxtPlaca().setText("");
  vehiculo.getCmbVehiculo().setSelectedIndex(0);
  vehiculo.getTxtColor().setText("");
  vehiculo.getCmbMarca().setSelectedIndex(0);
  vehiculo.getCmbModelo().setSelectedIndex(0); 
  vehiculo.getCmbAno().setSelectedIndex(0);
  vehiculo.getTxtSerialCarr().setText("");
  vehiculo.getTxtPrecioVe().setText("");
  vehiculo.getTxtDescrip().setText("");
  
  vehiculo.getTxtPlaca().requestFocusInWindow(); 
  EnabledVe(false);
}     

private void llenarComboMarca() throws SQLException //llena los combos
{                                                      //con las descripciones
                                                       // de las marcas
  ResultSet regisMarca;
  DaoMarca daoMarca =  new DaoMarca();
  String infoBD;
  
             regisMarca=daoMarca.ConsultarMarca();
             while (regisMarca.next())
              {
                infoBD=regisMarca.getString("nombre").trim();
                vehiculo.getCmbMarca().addItem(infoBD); 
              }  
             
}

private void llenarComboModelo() throws SQLException //llena los combos
{                                                      //con las descripciones
                                                       // de los modelos
  ResultSet regisModelo;
  DaoModelo daoModelo =  new DaoModelo();
  String infoBD = null;
  String cadena, marca;
  
            vehiculo.getCmbModelo().removeAllItems();
            vehiculo.getCmbModelo().addItem("Seleccione");
             regisModelo=daoModelo.ConsultarModelo();
             cadena = (String)vehiculo.getCmbMarca().getSelectedItem();
             cadena=cadena.trim();
             
             while (regisModelo.next())
              { marca =regisModelo.getString("nombremarca").trim();
                if(cadena.equals(marca))
                {
                infoBD=regisModelo.getString("nombremodelo").trim();
                 vehiculo.getCmbModelo().addItem(infoBD);
                }
              }  
}

private void BuscarVehiculo() throws SQLException
{

  String Cadena= vehiculo.getTxtPlaca().getText();
  
  if (Cadena.length() > 0)  
  {
    
    vehiculo.getCmbVehiculo().setSelectedIndex(0);
    vehiculo.getTxtColor().setText("");
    vehiculo.getCmbAno().setSelectedIndex(0);
    vehiculo.getTxtSerialCarr().setText("");
    vehiculo.getTxtPrecioVe().setText("");
    vehiculo.getTxtDescrip().setText("");
    
    ResultSet regis;
    DaoVehiculo daoVe=new DaoVehiculo();
    
    regis=daoVe.BuscarVehiculo(Cadena);
    
    if (regis.next())
     { Existe= true;
       if(regis.getString("status").trim().equals("activo"))
       {
       vehiculo.getTxtPlaca().setText(regis.getString("placa").trim());
       vehiculo.getCmbMarca().setSelectedItem(regis.getString("marca").trim());
       vehiculo.getCmbModelo().setSelectedItem(regis.getString("modelo").trim());
       vehiculo.getTxtSerialCarr().setText(regis.getString("serialcarroceria").trim());
       vehiculo.getCmbAno().setSelectedItem(regis.getString("ano").trim());
       vehiculo.getTxtColor().setText(regis.getString("color").trim());
       vehiculo.getTxtDescrip().setText(regis.getString("descripcion").trim());
       vehiculo.getCmbVehiculo().setSelectedItem(regis.getString("tipoveh").trim());
       vehiculo.getTxtPrecioVe().setText(regis.getString("precioveh").trim());
       vehiculo.getTxtPlaca().setEditable(false);
       
       }           
         else{
           Existe=true;
           Validaciones.Aviso("El vehículo está eliminado", "SISTEMA");
           vehiculo.getBtnEliminar().setEnabled(false);
           vehiculo.getBtnGuardar().setEnabled(false);
           vehiculo.getBtnModificar().setEnabled(false);
           CancelarVe();
           
            }
        }
         
     else
     {
         Existe=false;
           int resp=Validaciones.DialogConfirm("El vehículo no existe, ¿Desea registrarlo?", "Atención");
           switch (resp)
            {
                 
         case 0: vehiculo.getTxtSerialCarr().requestFocusInWindow();
                  EnabledVe(true);
                 vehiculo.getBtnModificar().setEnabled(false);
                 vehiculo.getBtnGuardar().setEnabled(true);
                 vehiculo.getBtnEliminar().setEnabled(false);
                 break;
         
         case 1: CancelarVe();
                 break;
     }
     vehiculo.getTxtPlaca().requestFocusInWindow();
     }               
  }

}
//-------------------------------------------------------------------
private void Eliminar() throws SQLException
{
    String Cadena= vehiculo.getTxtPlaca().getText();
    ResultSet regis;
    DaoVehiculo daoV=new DaoVehiculo();
    regis=daoV.BuscarVehiculo(Cadena);
    if (Cadena.length() > 0)  
    {
      if (regis.next())
       {
         daoV.EliminarVehiculo(Cadena);
         Validaciones.Aviso("El vehiculo ha sido eliminado", "SISTEMA");
         CancelarVe();
         EnabledVe(false);
         vehiculo.getBtnEliminar().setEnabled(false);
         vehiculo.getBtnGuardar().setEnabled(false);
         vehiculo.getBtnModificar().setEnabled(false);
        }   
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


private void Grabar() throws SQLException
{
  String Cadena;
  Vehiculo ve; 
  Float  precio=0.0f;
  Cadena=vehiculo.getTxtPlaca().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Placa Vacia", "SISTEMA");   
     vehiculo.getTxtPlaca().requestFocusInWindow();
     return;
   }   
  
  String marca=(String)vehiculo.getCmbMarca().getSelectedItem();
     marca=marca.trim();
   if (vehiculo.getCmbMarca().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione modelo", "SISTEMA"); 
     vehiculo.getCmbMarca().requestFocusInWindow();
     return;
   }       

String modelo=(String)vehiculo.getCmbModelo().getSelectedItem();
     modelo=modelo.trim();
   if (vehiculo.getCmbModelo().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione modelo", "SISTEMA"); 
     vehiculo.getCmbModelo().requestFocusInWindow();
     return;
   }     
  
  Cadena=vehiculo.getTxtSerialCarr().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Teléfono vacio", "SISTEMA"); 
     vehiculo.getTxtSerialCarr().requestFocusInWindow();
     return;
   }
  
     String ano=(String)vehiculo.getCmbAno().getSelectedItem();
     ano=ano.trim();
   if (vehiculo.getCmbAno().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione año", "SISTEMA"); 
     vehiculo.getCmbAno().requestFocusInWindow();
     return;
   }
  
   Cadena=vehiculo.getTxtColor().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Color vacio", "SISTEMA"); 
     vehiculo.getTxtColor().requestFocusInWindow();
     return;
   }
  
  
   Cadena=vehiculo.getTxtDescrip().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Descripcion vacia", "SISTEMA"); 
     vehiculo.getTxtDescrip().requestFocusInWindow();
     return;
   }
  
  String tipov=(String)vehiculo.getCmbVehiculo().getSelectedItem();
     tipov=tipov.trim();
   if (vehiculo.getCmbVehiculo().getSelectedIndex()==0)
    {
     Validaciones.Aviso("Seleccione el tipo de vehiculo", "SISTEMA"); 
     vehiculo.getCmbVehiculo().requestFocusInWindow();
     return;
   }
   Cadena=vehiculo.getTxtPrecioVe().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Precio de vehiculo vacio", "SISTEMA"); 
     vehiculo.getTxtPrecioVe().requestFocusInWindow();
     return;
   }
   
  Cadena=vehiculo.getTxtPrecioVe().getText();
if (Cadena.length()==0)
   { 
     
     try
      {
        precio = Float.parseFloat(Cadena);

       } catch(NumberFormatException fe) 
           {
             Validaciones.Aviso("Error en Costo", "");
             return;
           } 
     
   } 
           
                   
  
  ve = new Vehiculo(vehiculo.getTxtPlaca().getText().trim(),
                    marca,
                    modelo,
                    vehiculo.getTxtSerialCarr().getText().trim(),       
                    ano,
                    vehiculo.getTxtColor().getText().trim(),
                    vehiculo.getTxtDescrip().getText().trim(),
                    tipov.trim(),
                    precio,
                    "activo");

  String CadenaVe=vehiculo.getTxtPlaca().getText().trim();

  
  ResultSet regisVe;
  DaoVehiculo daoVe=new DaoVehiculo();

  if (Existe)
  {   daoVe.ModificarVehiculo(ve); 
  Validaciones.Aviso("El Cliente ha sido modificado", "SISTEMA");
  } else{
       daoVe.InsertarVehiculo(ve);
  Validaciones.Aviso("El Cliente ha sido registrado", "SISTEMA");
  }
  CancelarVe();
  EnabledVe(false);
  vehiculo.getTxtPlaca().requestFocusInWindow();
  

}

@Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(vehiculo.getBtnGuardar()))  
       {
           
           try {
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorVehiculo.class.getName()).log(Level.SEVERE, null, ex);
           }
       }  
       //------------------------------------------------------------------
       if (e.getSource().equals(vehiculo.getBtnCancelar()))  
       {
          CancelarVe(); 
       } 
       //------------------------------------------------------------------
       if (e.getSource().equals(vehiculo.getBtnConsultar()))  
       {
       
           try {
               new ControladorConsultarVehiculo();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorVehiculo.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       //-------------------------------------------------------------------
       if (e.getSource().equals(vehiculo.getBtnSalirper()))  
       {
         vehiculo.dispose();  
       }  
       //--------------------------------------------------------------------
       
       if (e.getSource().equals(vehiculo.getBtnBuscarVe()))  
       {
           
           try {
               BuscarVehiculo();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorVehiculo.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }  
       
     
       
       if (e.getSource().equals(vehiculo.getBtnEliminar()))  
       {
           
           try {
               Eliminar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorVehiculo.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        } 
       
       if (e.getSource().equals(vehiculo.getBtnModificar()))  
       {
           
           EnabledVe(true);
           
        }
       
        if (e.getSource().equals(vehiculo.getCmbMarca()))
        {  try {
            llenarComboModelo();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorVehiculo.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        if(e.getSource().equals(vehiculo.getBtnSalirper())){
            vehiculo.dispose();
        }
    }


 
}


 




    


  
    
   