package DAO;



import Modelo.ClassConexionDAO;
import Modelo.Perito;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoPerito extends ClassConexionDAO
{
    public void InsertarPerito(Perito pe)  
  {
     String Sql;
     
     Sql="INSERT INTO perito(codigo, cedula, nombre, apellido, telefono, direccion, email, status) VALUES (";
     Sql=Sql+"'"+pe.GetCodigo()+"',";
     Sql=Sql+"'"+pe.GetCedula()+"',";
     Sql=Sql+"'"+pe.GetNombre()+"',";
     Sql=Sql+"'"+pe.GetApellido()+"',";
     Sql=Sql+"'"+pe.GetTlf()+"',";
     Sql=Sql+"'"+pe.GetDireccion()+"',";
     Sql=Sql+"'"+pe.GetEmail()+"','activo')";
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  } 
  
 //----------------------------------
  public void ModificarPerito(Perito pe)  
  {
     String Sql;
     
     Sql="UPDATE perito SET cedula="+Validaciones.Apost(pe.GetCedula())+",";
     Sql=Sql+"nombre="+Validaciones.Apost(pe.GetNombre())+",";
     Sql=Sql+"apellido="+Validaciones.Apost(pe.GetApellido())+",";
     Sql=Sql+"telefono="+Validaciones.Apost(pe.GetTlf())+",";
     Sql=Sql+"direccion="+Validaciones.Apost(pe.GetDireccion())+",";
     Sql=Sql+"email="+Validaciones.Apost(pe.GetEmail());
     Sql=Sql+" WHERE codigo="+Validaciones.Apost(pe.GetCodigo());
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
 //-------------------------------------- 
   public void EliminarPerito(String pe)  
  {
     String Sql;
     
     Sql="UPDATE perito SET status='eliminado' WHERE codigo="+Validaciones.Apost(pe);                  
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
  
  //----------------------------------
  public ResultSet GetPerito()
  {
     String Sql;
     ResultSet registroPe;
     
     Sql="SELECT * FROM  perito WHERE status='activo'";
     registroPe=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroPe;
          
  }   
//-----------------------------
  public ResultSet BuscarPerito(String codigo)
  {
     String Sql;
     ResultSet registroPe;
     
     codigo=codigo.trim();
     Sql="SELECT * FROM  perito WHERE codigo="+Validaciones.Apost(codigo);
     registroPe=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroPe;      
  }  
  
    public ResultSet ConsultarPerito() throws SQLException
    {
      String Sql;
      ResultSet RegistroPe=null;  
      
      Sql="SELECT * FROM  perito WHERE status='activo'";                                            
      RegistroPe=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return RegistroPe; 
        
   }
}
