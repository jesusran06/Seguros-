package DAO;

import Modelo.ClassConexionDAO;
import Modelo.Vehiculo;
import Modelo.Validaciones;
import PackageConeccion.ConeccionBD;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoVehiculo extends ClassConexionDAO
{ String precioveh;
    public void InsertarVehiculo(Vehiculo ve)  
  {
     String Sql;
     precioveh=Float.toString((float)ve.getPrecioveh());
     Sql="INSERT INTO vehiculo(placa, marca, modelo, "
             + "serialcarroceria, ano, color, "
             + "descripcion, tipoveh, precioveh, status) VALUES (";
     Sql=Sql+"'"+ve.getPlaca()+"',";
     Sql=Sql+"'"+ve.getMarca()+"',";
     Sql=Sql+"'"+ve.getModelo()+"',";
     Sql=Sql+"'"+ve.getSerialcarr()+"',";
     Sql=Sql+"'"+ve.getAno()+"',";
     Sql=Sql+"'"+ve.getColor()+"',";
     Sql=Sql+"'"+ve.getDescripcion()+"',";
     Sql=Sql+"'"+ve.getTipoveh()+"',";
     Sql=Sql+"'"+precioveh+"','activo')";
 
     PackageConeccion.ConeccionBD.ejecutar(Sql);
   
  } 
  
 //----------------------------------
  public void ModificarVehiculo(Vehiculo ve)  
  {
     String Sql;
     precioveh=Float.toString((float)ve.getPrecioveh());
     Sql="UPDATE vehiculo SET marca='"+ve.getMarca()+"',";
     Sql=Sql+"modelo='"+ve.getModelo()+"',";
     Sql=Sql+"serialcarroceria='"+ve.getSerialcarr()+"',";
     Sql=Sql+"ano='"+ve.getAno()+"',";
     Sql=Sql+"color='"+ve.getColor()+"',";
     Sql=Sql+"descripcion='"+ve.getDescripcion()+"',";
     Sql=Sql+"tipoveh='"+ve.getTipoveh()+"',";
     Sql=Sql+"precioveh='"+precioveh+"'";
     Sql=Sql+"WHERE placa="+Validaciones.Apost(ve.getPlaca());
     
  PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
 //-------------------------------------- 
   public void EliminarVehiculo(String ve)  
  {
     String Sql;
     
     Sql="UPDATE vehiculo SET status='eliminado' WHERE placa="+Validaciones.Apost(ve);                  
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
  
  //----------------------------------
  public ResultSet GetVehiculo()
  {
     String Sql;
     ResultSet registroVe;
     
     Sql="SELECT * FROM  vehiculo WHERE status='activo'";
     registroVe=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroVe;
          
  }   
//-----------------------------

   public ResultSet BuscarVehiculo(String placa)
  {
     String Sql;
     ResultSet registroVe;
     
     placa=placa.trim();
     Sql="SELECT * FROM  vehiculo WHERE placa="+Validaciones.Apost(placa);
     //Sql=Sql+" AND status='activo'";
     registroVe=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroVe;      
  } 
   

    public ResultSet ConsultarVehiculo() throws SQLException
    {
        
      String Sql;
      ResultSet RegistroVe=null;  
      
      Sql="SELECT * FROM  vehiculo WHERE status='activo'";                                            
      RegistroVe=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return RegistroVe; 
        
   }
}
