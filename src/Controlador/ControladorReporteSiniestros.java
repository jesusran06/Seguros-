package Controlador;

import Dao.DaoDeclaracionSiniestro;
import Modelo.Siniestro;
import Modelo.Validaciones;
import Vista.GestionReporteSiniestros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorReporteSiniestros implements ActionListener
{
    private GestionReporteSiniestros reporte;
  
    
    public ControladorReporteSiniestros() 
    {
       
        reporte = new GestionReporteSiniestros();
        reporte.agregarListener(this);
        reporte.setVisible(true);
    }

   //---------------------------
private void MostrarListado() throws SQLException
{  
  
  Integer i=0;  
  String marca, modelo;
  SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");  
  Siniestro si=new Siniestro();
  boolean rangoFechaOk;
  String Fecha;
  Date FechaI = null, FechaF = null;

  if (reporte.getCmbMarca().getSelectedIndex()==0)  
   {
     Validaciones.Aviso("Debe escoger la marca del vehículo","SISTEMA");   
     return;
   }  
  
  if (reporte.getCmbModelo().getSelectedIndex()==0)  
   {
     Validaciones.Aviso("Debe escoger el modelo del vehículo", "");   
     return;
   }

  marca=(String)reporte.getCmbMarca().getSelectedItem();
  marca=marca.trim();
  
  modelo=(String)reporte.getCmbModelo().getSelectedItem();
  modelo=modelo.trim();
  
  FechaI=Validaciones.CnvStringFecha(reporte.getjFormattedTextFieldFechaInicio().getText());
  FechaF=Validaciones.CnvStringFecha(reporte.getjFormattedTextFieldFechaFinal().getText());
  
  DaoDeclaracionSiniestro daoSi=new DaoDeclaracionSiniestro();
  ResultSet regis;
  
  regis=daoSi.ConsultarMarcaSiniestro(marca.trim(),modelo.trim());
   
   if (regis.next()) {
        do       
        {
            rangoFechaOk=false;
            if (regis.getDate("fecharegistro").compareTo(FechaI) >=0 && regis.getDate("fecharegistro").compareTo(FechaF)<=0)            
              rangoFechaOk=true;
         
         if (marca.equals(regis.getString("marcacli").trim()) && modelo.equals(regis.getString("modelocli").trim())
                     && rangoFechaOk)
         {
            reporte.getjTableSiniestros().setValueAt(regis.getString("codigosiniestro"), i, 0);
            reporte.getjTableSiniestros().setValueAt(regis.getString("cedulacli"),i, 1);
            reporte.getjTableSiniestros().setValueAt(regis.getString("fechaocurrencia"), i, 2);    
            reporte.getjTableSiniestros().setValueAt(regis.getString("fecharegistro"), i, 3);
            reporte.getjTableSiniestros().setValueAt(regis.getString("marcacli"), i, 4);
            reporte.getjTableSiniestros().setValueAt(regis.getString("modelocli"), i, 5);
            reporte.getjTableSiniestros().setValueAt(regis.getString("colorcli"), i, 6);
            reporte.getjTableSiniestros().setValueAt(regis.getString("anocli"), i, 7);
             i++;
           
           }
         reporte.getTxtTotal().setText(i.toString());
        }while (regis.next());
    }  
 
  
}  
 

private void Limpiar()
{     
  for (int i=0;i<99;i++)
    {
        reporte.getjTableSiniestros().setValueAt("", i, 0);
        reporte.getjTableSiniestros().setValueAt("",i, 1);
        reporte.getjTableSiniestros().setValueAt("", i, 2);    
        reporte.getjTableSiniestros().setValueAt("", i, 3);
        reporte.getjTableSiniestros().setValueAt("", i, 4);
        reporte.getjTableSiniestros().setValueAt("", i, 5);
        reporte.getjTableSiniestros().setValueAt("", i, 6);
        reporte.getjTableSiniestros().setValueAt("", i, 7);
             
             reporte.getTxtTotal().setText("");
           
    }
}


    @Override
    public void actionPerformed(ActionEvent e)
    {
      if (e.getSource().equals(reporte.getBtnMostrar()))
        {
          try {       
              MostrarListado();
          } catch (SQLException ex) {
              Logger.getLogger(ControladorReporteSiniestros.class.getName()).log(Level.SEVERE, null, ex);
          }
        }  
        //-------------
      if (e.getSource().equals(reporte.getCmbMarca()))
        {
          Limpiar();       
        } 
      if (e.getSource().equals(reporte.getCmbModelo()))
        {
          Limpiar();       
        }
     
    }
    
}
