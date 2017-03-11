package Controlador;

import DAO.DaoCliente;
import Vista.VentanaConsultarCliente;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorConsultarCliente
{
  private VentanaConsultarCliente ConsultarCliente;  

   
    public ControladorConsultarCliente() throws SQLException 
    {
       
        ConsultarCliente = new VentanaConsultarCliente();
        ConsultarCliente.setVisible(true);
        CargarGridCliente();
    }
  //--------------------
private void CargarGridCliente() throws SQLException
{

  Integer Fila =0;
  DaoCliente daoCli=new DaoCliente();
  ResultSet regis;
  
  regis=daoCli.ConsultarCliente();
   
   if (regis.next()) {
        do       
        {
        ConsultarCliente.getjTableClientes().setValueAt(regis.getString("cedulacli"), Fila, 0);
        ConsultarCliente.getjTableClientes().setValueAt(regis.getString("nombre"), Fila, 1);
        ConsultarCliente.getjTableClientes().setValueAt(regis.getString("apellido"), Fila, 2);    
        ConsultarCliente.getjTableClientes().setValueAt(regis.getString("telefono"), Fila, 3);
        ConsultarCliente.getjTableClientes().setValueAt(regis.getString("direccion"), Fila, 4);
        ConsultarCliente.getjTableClientes().setValueAt(regis.getString("email"), Fila, 5);
          
           Fila++;
        }while (regis.next());
    }  
 
  
}        
 
}
