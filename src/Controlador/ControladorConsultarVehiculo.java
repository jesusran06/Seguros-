package Controlador;

import DAO.DaoVehiculo;
import Modelo.Vehiculo;
import Vista.VentanaConsultarVehiculo;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorConsultarVehiculo
{
  private VentanaConsultarVehiculo ConsultarVehiculo;  

   
    public ControladorConsultarVehiculo() throws SQLException 
    {
       
        ConsultarVehiculo = new VentanaConsultarVehiculo();
        ConsultarVehiculo.setVisible(true);
        CargarGridVehiculo();
    }
  //--------------------
private void CargarGridVehiculo() throws SQLException
{

  Integer Fila =0;
  Vehiculo ve=new Vehiculo(); 
  DaoVehiculo daoV=new DaoVehiculo();
  ResultSet regis;
  
  regis=daoV.ConsultarVehiculo();
   
   if (regis.next()) {
        do       
        {
        ConsultarVehiculo.getjTableVehiculos().setValueAt(regis.getString("placa"), Fila, 0);
        ConsultarVehiculo.getjTableVehiculos().setValueAt(regis.getString("marca"), Fila, 1);
        ConsultarVehiculo.getjTableVehiculos().setValueAt(regis.getString("modelo"), Fila, 2);    
        ConsultarVehiculo.getjTableVehiculos().setValueAt(regis.getString("ano"), Fila, 3);
        ConsultarVehiculo.getjTableVehiculos().setValueAt(regis.getString("color"), Fila, 4);
        ConsultarVehiculo.getjTableVehiculos().setValueAt(regis.getString("codigopol"), Fila, 5);
        ConsultarVehiculo.getjTableVehiculos().setValueAt(regis.getString("tipoveh"), Fila, 6);
        ConsultarVehiculo.getjTableVehiculos().setValueAt(regis.getString("precioveh"), Fila, 7);
        ConsultarVehiculo.getjTableVehiculos().setValueAt(regis.getString("cedulacli"), Fila, 8);
        ConsultarVehiculo.getjTableVehiculos().setValueAt(regis.getString("nombrecli"), Fila, 9);
          
           Fila++;
        }while (regis.next());
    }  
 
  
}        
 
}
