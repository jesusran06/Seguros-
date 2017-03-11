/**
 *
 * @author Indrina Meza
 */

package Controlador;
import DAO.DaoInformeSiniestro;
import DAO.DaoReparacion;
import DAO.DaoRepuesto;
import DAO.DaoPerito;
import DAO.DaoRepaRepu;
import Dao.DaoDeclaracionSiniestro;
import Modelo.InformeSiniestro;
import Modelo.Validaciones;
import Vista.GestionInformeSiniestros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorInformeSiniestro implements ActionListener
{
    
    private GestionInformeSiniestros sini; 
    
    ControladorInformeSiniestro() throws SQLException
    {
        sini=new GestionInformeSiniestros();
        sini.agregarListener(this); 
        sini.setVisible(true); 
        limpiarTabla();
        TraerCodigoSiniestro();
        sini.getTxtDetalles().setEditable(false);
        sini.getTxtCodPerito().requestFocusInWindow();
        llenarComboReparacion();
        
        
        
      sini.getTxtCodigoSi().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCodigoSi(e);   
              }           
       }
    );
       
        sini.getTxtCodPerito().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCodigoPe(e);   
              }           
       }
    );
        
         sini.getTxtDetalles().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaDetalles(e);   
              }           
       }
    );
       
    sini.getTxtCantidad().addKeyListener(new KeyAdapter()
      {        
            @Override
            public void keyTyped (KeyEvent e)
              {     
                ValidaCantidad(e);   
              }           
       }
    );
        
    }
//-----------------------------------
private Integer sigFilavacia() //Esto nos da la ultima fila vacía en la grid
{                              
   Integer F;
   
   for (F=0;F<100;F++) 
   {
     if ((String)sini.getjTableProductos().getValueAt(F, 0)=="")  
       return F;  
   } 
   
   return F;  
   
}        
//-----------------------------------    
private void limpiarTabla() //Limpia la grid
{
   Integer F,C;
   
   for (F=0;F<100;F++) {
        for (C=0;C<5;C++) {
           sini.getjTableProductos().setValueAt("", F, C);
       }
    }  
}        
//-----------------------------------------    
private void TraerCodigoSiniestro() throws SQLException //Trae de la BD el ultimo codigo de siniestro y le suma 1. 
{
  DaoInformeSiniestro dAOInformeSiniestro=new DaoInformeSiniestro();  
  sini.getTxtCodigo().setText(dAOInformeSiniestro.siniestroSiguiente());
}        
   //------------------------------------- 
    private void ValidaCodigoSi(KeyEvent e)
{
    String Cadena;
    
    Cadena=sini.getTxtCodigoSi().getText();
    if (Cadena.length()==5)
      {   
        e.consume();  
        return;
      }   
    
}
 //--------------------------------------   
 private void ValidaCodigoPe(KeyEvent e)
{
    String Cadena;
    
    Cadena=sini.getTxtCodPerito().getText();
    if (Cadena.length()==7)
      {   
        e.consume();  
        return;
      }   
    
}
 //--------------------------------------    
 private void ValidaDetalles(KeyEvent e)
{
    String Cadena;
    
    Cadena=sini.getTxtDetalles().getText();
    if (Cadena.length()==100)
      {   
        e.consume();  
        return;
      }   
    
}
 //--------------------------------------     
  private void ValidaCantidad(KeyEvent e)
{
    String Cadena;
    char Caracter;
    
    Cadena=sini.getTxtCantidad().getText();
    if (Cadena.length()==2)
      {   
        e.consume();  
        return;
      }
    
    //Averiguar Tecla
    //***************
    Caracter=e.getKeyChar();
    
    if (Caracter <'0' || Caracter > '9')
      e.consume();
}
 //--------------------------------------  
  
  private void Cancelar()
  {
  sini.getTxtCedula().setText("");
  sini.getTxtNombreCli().setText("");           
  sini.getTxtApellidoCli().setText("");
  sini.getTxtPlaca().setText("");
  sini.getTxtMarca().setText("");
  sini.getTxtModelo().setText("");
  sini.getTxtAno().setText("");
  sini.getTxtCarroceria().setText("");
  sini.getTxtCodigoSi().setText("");
  sini.getTxtCodPerito().setText("");
  sini.getTxtNombrePe().setText("");           
  sini.getTxtApellidoPe().setText("");
  sini.getTxtDetalles().setText("");
  sini.getTxtTotal().setText("");
  limpiarTabla();
  
  sini.getTxtCodPerito().requestFocusInWindow();
           
  
  }        
  private void BuscarSiniestro() throws SQLException
{
  String Cadena= sini.getTxtCodigoSi().getText();
  
  if (Cadena.length() > 0) 
  { sini.getTxtCedula().setText("");
    sini.getTxtNombreCli().setText("");
    sini.getTxtApellidoCli().setText("");
    sini.getTxtPlaca().setText("");
    sini.getTxtMarca().setText("");
    sini.getTxtModelo().setText("");
    
    ResultSet regis;
    DaoDeclaracionSiniestro daoCli=new DaoDeclaracionSiniestro();
    regis=daoCli.BuscarDeclaracionSiniestro(Cadena);
    
    if (regis.next())
     { 
         if(regis.getString("status").trim().equals("activo"))
         {
           
           sini.getTxtCedula().setText(regis.getString("cedulacli").trim());
           sini.getTxtNombreCli().setText(regis.getString("nombrecli").trim());           
           sini.getTxtApellidoCli().setText(regis.getString("apellidocli").trim());
           sini.getTxtPlaca().setText(regis.getString("placacli").trim());
           sini.getTxtMarca().setText(regis.getString("marcacli").trim());
           sini.getTxtModelo().setText(regis.getString("modelocli").trim());
           sini.getTxtAno().setText(regis.getString("anocli").trim());
           sini.getTxtCarroceria().setText(regis.getString("serialcarrcli").trim());
           sini.getTxtCodigoSi().setEditable(false);
        }           
         else{
           Validaciones.Aviso("El cliente está eliminado", "ATENCIÓN");
        
         }
     }
         
     else
     { 
        Validaciones.Aviso("El siniestro no está registrado", "ATENCIÓN");
           
     }
     sini.getTxtCodigoSi().requestFocusInWindow();
     }
   }
 //--------------------------------------   
private void BuscarPerito() throws SQLException
{
  String Cadena= sini.getTxtCodPerito().getText();
  
  if (Cadena.length() > 0) 
  { sini.getTxtNombrePe().setText("");
    sini.getTxtApellidoPe().setText("");
    
    ResultSet regis;
    DaoPerito daoPe=new DaoPerito();
    regis=daoPe.BuscarPerito(Cadena);
    
    if (regis.next())
     { 
         if(regis.getString("status").trim().equals("activo"))
         {
           sini.getTxtNombrePe().setText(regis.getString("nombre").trim());           
           sini.getTxtApellidoPe().setText(regis.getString("apellido").trim());
           sini.getTxtDetalles().setEditable(true);
           sini.getTxtCodPerito().setEditable(false);
           sini.getTxtDetalles().requestFocusInWindow();
        }           
         else
        {
           Validaciones.Aviso("El perito está eliminado", "ATENCIÓN");
        }
     }
         
     else
     { 
        Validaciones.Aviso("El perito no está registrado", "ATENCIÓN");
           
     }
     sini.getTxtCodPerito().requestFocusInWindow();
     }
   }
//--------------------------------

private void llenarComboReparacion() throws SQLException //llena el combo
{                                                      //con las descripcion de
                                                       // las reparaciones
String infoBD;
ResultSet regisRep;
DaoReparacion daoReparacion=new DaoReparacion();

sini.getCmbRepa().addItem("Seleccione");
regisRep=daoReparacion.ConsultarReparacion();
             while (regisRep.next())
              {
                infoBD=regisRep.getString("codigorepa").trim()+"-";
                infoBD=infoBD+regisRep.getString("nombrerepa").trim()+"-";
                infoBD=infoBD+regisRep.getString("costorepa").trim();
                sini.getCmbTipo().addItem(infoBD); 
              }
  }
private void llenarDescripciones() throws SQLException //llena los combos
{                                                      //con las descripciones
                                                       // de los repuestos de cada reparación
   ResultSet regis;
   String contenidoCombo; 
   String [] arrContenidoCombo;
   String codrepa;
   contenidoCombo=(String)sini.getCmbTipo().getSelectedItem();
   arrContenidoCombo=contenidoCombo.split("-");
   sini.getTxtPrecio().setText("");
   DaoRepaRepu daoRepaRepu = new DaoRepaRepu();
   String infoBD;
   codrepa = arrContenidoCombo[0];
   sini.getCmbRepa().removeAllItems();
   sini.getCmbRepa().addItem("Seleccione");
   regis=daoRepaRepu.ConsultarRepaRepu(codrepa);       
             while (regis.next())
              {
                infoBD=regis.getString("codigo_repu").trim()+"-";
                infoBD=infoBD+regis.getString("nombrerepu").trim()+"-";
                infoBD=infoBD+regis.getString("precio").trim();
                sini.getCmbRepa().addItem(infoBD); 
              } 
}       

//--------------------------------------
private void traerPrecioRepuesto() throws SQLException //le asigna al caja de texto
{                                                      //el precio del repuesto seleccionado
  ResultSet busquedaTabla;  
  DaoReparacion daoRepa;
  DaoRepuesto daoRepues;
  String [] arrOpcionCombo;  
  String texto;
  String codigo;
  
  if (sini.getCmbRepa().getSelectedIndex()==0)  
    {  
       sini.getTxtPrecio().setText("");  
       return;
    }   
  
  
  texto=(String)sini.getCmbRepa().getSelectedItem();
  if (texto==null)
    {  
      sini.getTxtPrecio().setText("");
      return; 
    } 
      
  arrOpcionCombo=texto.split("-");
  codigo=arrOpcionCombo[0];
    
             daoRepues=new DaoRepuesto(); 
             busquedaTabla=daoRepues.BuscarRepuesto(codigo);
             if (busquedaTabla.next())
             { sini.getTxtPrecio().setText(busquedaTabla.getString("precio"));
               
             }
                  
  } 
 

private void agregarReparacionATabla() throws SQLException
{   
    String contenidoCombo; 
    String [] arrContenidoCombo;
    contenidoCombo=(String)sini.getCmbTipo().getSelectedItem();
    arrContenidoCombo=contenidoCombo.split("-");
    ResultSet regis;
    DaoReparacion daoRepa=new DaoReparacion(); 
    regis=daoRepa.BuscarReparacion(arrContenidoCombo[0]);
    
    String precio; 
    
    Float total=0.0f;
    Float subTotal=0.0f;
    Float cantidad;
    String stCan;
    Integer Fila=0;
    
    if (sini.getCmbTipo().getSelectedIndex()==0)
   {   
       sini.getjTableProductos().setValueAt("", Fila, 0);
       Validaciones.Aviso("Debe escoger una reparacion", "ATENCIÓN");   
   }
  
   sini.getjTableProductos().setValueAt(arrContenidoCombo[0],Fila, 0);
   sini.getjTableProductos().setValueAt(arrContenidoCombo[1],Fila, 1);
   sini.getjTableProductos().setValueAt("1",Fila, 2); 
   sini.getjTableProductos().setValueAt(arrContenidoCombo[2],Fila, 3);        


   for (int i=0;i<sigFilavacia();i++) 
   {
       precio=(String)sini.getjTableProductos().getValueAt(i,3 );
       stCan=(String)sini.getjTableProductos().getValueAt(i, 2);
       cantidad=Validaciones.CStr_Float(stCan);
       
       subTotal=Validaciones.CStr_Float(precio);
       subTotal=subTotal*cantidad;
       total=total+subTotal;
    } 
   sini.getjTableProductos().setValueAt(subTotal.toString(), Fila, 4);
   sini.getTxtTotal().setText(total.toString());
}

//--------------------------------
private void BorrarDetalleInforme()
{        
Integer Fila = (sigFilavacia())-1;

if(Fila<sigFilavacia())
{
  sini.getjTableProductos().setValueAt("", Fila, 0);
  sini.getjTableProductos().setValueAt("", Fila, 1);
  sini.getjTableProductos().setValueAt("", Fila, 2);
  sini.getjTableProductos().setValueAt("", Fila, 3);
  sini.getjTableProductos().setValueAt("", Fila, 4);
  Fila--;
}

}
//--------------------------------
private void AgregarDetalleInforme()
{
   String precio; 
   Integer Fila; 
   String contenidoCombo; 
   String [] arrContenidoCombo;
   contenidoCombo=(String)sini.getCmbRepa().getSelectedItem();
   Float total=0.0f;
   Float subTotal=0.0f;
   
   arrContenidoCombo=contenidoCombo.split("-");

   Fila=sigFilavacia();
   sini.getjTableProductos().setValueAt(arrContenidoCombo[0], Fila, 0);
    
   sini.getjTableProductos().setValueAt(arrContenidoCombo[1], Fila, 1);
    
       
   String Cadena=sini.getTxtCantidad().getText().trim();
        if (Cadena.length()==0)
            {
            sini.getjTableProductos().setValueAt("", Fila, 0);
            sini.getjTableProductos().setValueAt("", Fila, 1);
            sini.getjTableProductos().setValueAt("", Fila, 2);
            sini.getjTableProductos().setValueAt("", Fila, 3);
            sini.getjTableProductos().setValueAt("", Fila, 4);
            Validaciones.Aviso("Ingrese la cantidad del repuesto seleccionado", "ATENCIÓN");
            sini.getTxtCantidad().requestFocusInWindow();
            return;
            } 
  
   
   sini.getjTableProductos().setValueAt(sini.getTxtCantidad().getText(), Fila, 2);      
 
   sini.getjTableProductos().setValueAt(sini.getTxtPrecio().getText(), Fila, 3);

  Float cantidad;
  String stCan;
  
   for (int i=0;i<sigFilavacia();i++) 
   {
       precio=(String)sini.getjTableProductos().getValueAt(i,3 );
       stCan=(String)sini.getjTableProductos().getValueAt(i, 2);
       cantidad=Validaciones.CStr_Float(stCan);
       
       subTotal=Validaciones.CStr_Float(precio);
       subTotal=subTotal*cantidad;
       total=total+subTotal;
    } 
   sini.getjTableProductos().setValueAt(subTotal.toString(), Fila, 4);
   sini.getTxtTotal().setText(total.toString());
}        

//--------------------------------------------------------------------------
private void Grabar() throws SQLException
{
  String Cadena;
  Float monto=0.0f;
  InformeSiniestro info;
  
  Cadena=sini.getTxtCodigoSi().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Codigo de Declaración de Siniestro Vacio", "sistema");   
     sini.getTxtCodigoSi().requestFocusInWindow();
     return;
   }
Cadena=sini.getTxtCedula().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Cedula Vacio", "sistema");   
     sini.getTxtCedula().requestFocusInWindow();
     return;
   }

Cadena=sini.getTxtNombrePe().getText();
if (Cadena.length()==0)
    {
     Validaciones.Aviso("Cedula Vacio", "sistema");   
     sini.getTxtNombrePe().requestFocusInWindow();
     return;
   } 
  
  Cadena=sini.getTxtDetalles().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Detalle de inspeaccion Vacio", "sistema");   
     sini.getTxtDetalles().requestFocusInWindow();
     return;
   } 
  
  Cadena=sini.getTxtTotal().getText();
  if (Cadena.length()==0)
    {
     Validaciones.Aviso("Debe introducir la reparacion/repuesto", "sistema");   
     sini.getTxtTotal().requestFocusInWindow();
     return;
   } 
  
    //Convertir a Float
  Cadena=sini.getTxtTotal().getText();

     monto=Float.parseFloat(Cadena);
   
  
  info=new InformeSiniestro(sini.getTxtCodigo().getText().trim(), 
                            sini.getTxtCodigoSi().getText().trim(), 
                            sini.getTxtCedula().getText().trim(),
                            sini.getTxtNombreCli().getText().trim(),
                            sini.getTxtApellidoCli().getText().trim(),
                            sini.getTxtCodPerito().getText().trim(),
                            sini.getTxtNombrePe().getText().trim(),
                            sini.getTxtApellidoPe().getText().trim(),
                            sini.getTxtPlaca().getText().trim(),
                            sini.getTxtMarca().getText().trim(),
                            sini.getTxtModelo().getText().trim(),
                            sini.getTxtAno().getText().trim(),
                            sini.getTxtCarroceria().getText().trim(),   
                            sini.getTxtDetalles().getText().trim(),
                            monto,
                            "activo");

  DaoInformeSiniestro daoIS=new DaoInformeSiniestro();
  daoIS.InsertarInformeSiniestro(info);
  Validaciones.Aviso("El informe de siniestro ha sido registado", "ATENCIÓN");
  Cancelar();
}
 
//--------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(sini.getCmbTipo())) 
         try {
            llenarDescripciones();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInformeSiniestro.class.getName()).log(Level.SEVERE, null, ex);
        }  
       //--------------------------------------
       if (e.getSource().equals(sini.getBtnAdd()))
        {
          AgregarDetalleInforme();   
        } 
       //-------------------------------------------
       
       if (e.getSource().equals(sini.getBtnDe()))
        {
          BorrarDetalleInforme();   
        } 
       //-------------------------------------------
       
       if (e.getSource().equals(sini.getBtnBuscarPe()))
        {
           try {   
               BuscarPerito();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorInformeSiniestro.class.getName()).log(Level.SEVERE, null, ex);
           }
        } 
       
       //---------
       if (e.getSource().equals(sini.getBtnBuscarSi()))
        {
           try {   
               BuscarSiniestro();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorInformeSiniestro.class.getName()).log(Level.SEVERE, null, ex);
           }
        } 
       //---------------
       if (e.getSource().equals(sini.getCmbRepa()))
        {
            try { 
                traerPrecioRepuesto();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorInformeSiniestro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
       //---------------
       if (e.getSource().equals(sini.getBtnGuardar()))
        {
           try {
               Grabar();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorInformeSiniestro.class.getName()).log(Level.SEVERE, null, ex);
           }
        } 
       if (e.getSource().equals(sini.getCmbTipo()))
        {
           try {
               agregarReparacionATabla();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorInformeSiniestro.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       if (e.getSource().equals(sini.getBtnSalir())){
           sini.dispose();
       }
    }
   
       
}

