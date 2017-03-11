/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DaoRepuesto;
import Modelo.Repuesto;
import Vista.VentanaConsultarRepuesto;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorConsultarRepuesto
{
  private VentanaConsultarRepuesto Consultar;  

   
    public ControladorConsultarRepuesto() throws SQLException 
    {
       
        Consultar = new VentanaConsultarRepuesto();
        Consultar.setVisible(true);
        CargarGridRepuesto();
    }
  //--------------------
private void CargarGridRepuesto() throws SQLException
{

  Integer Fila =0;
  Repuesto re=new Repuesto(); 
  DaoRepuesto daoR=new DaoRepuesto();
  ResultSet regis;
  
  regis=daoR.ConsultarRepuesto();
   
   if (regis.next()) {
        do       
        {
        Consultar.getjTableRepuesto().setValueAt(regis.getString("codigorepu"), Fila, 0);
        Consultar.getjTableRepuesto().setValueAt(regis.getString("nombrerepu"), Fila, 1);
        Consultar.getjTableRepuesto().setValueAt(regis.getString("precio"), Fila, 2); 
           Fila++;
        }while (regis.next());
    }  
 
  
}        
 
}


