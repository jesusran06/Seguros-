package Controlador;
import DAO.DaoReparacion;
import Modelo.Reparacion;
import Vista.VentanaConsultarReparacion;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorConsultarReparacion
{
  private VentanaConsultarReparacion Consultar;  

   
    public ControladorConsultarReparacion() throws SQLException 
    {
       
        Consultar = new VentanaConsultarReparacion();
        Consultar.setVisible(true);
        CargarGridReparacion();
    }
  //--------------------
private void CargarGridReparacion() throws SQLException
{

  Integer Fila =0;
  Reparacion re=new Reparacion(); 
  DaoReparacion daoR=new DaoReparacion();
  ResultSet regis;
  
  regis=daoR.ConsultarReparacion();
   
   if (regis.next()) {
        do       
        {
        Consultar.getjTableRepa().setValueAt(regis.getString("codigorepa"), Fila, 0);
        Consultar.getjTableRepa().setValueAt(regis.getString("nombrerepa"), Fila, 1);
        Consultar.getjTableRepa().setValueAt(regis.getString("descripcionrepa"), Fila, 2);    
        Consultar.getjTableRepa().setValueAt(regis.getString("costorepa"), Fila, 3);
          
           Fila++;
        }while (regis.next());
    }  
 
  
}        
 
}

