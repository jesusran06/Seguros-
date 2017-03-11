package DAO;

import Modelo.ClassConexionDAO;
import Modelo.Cliente;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCliente extends ClassConexionDAO
{
    public void InsertarCliente(Cliente cli)  
  {
     String Sql;
     
     Sql="INSERT INTO cliente(cedulacli, nombre, apellido,"
             + " telefono, direccion, email, status) VALUES (";
     Sql=Sql+"'"+cli.GetCedulacli()+"',";
     Sql=Sql+"'"+cli.GetNombrecli()+"',";
     Sql=Sql+"'"+cli.GetApellidocli()+"',";
     Sql=Sql+"'"+cli.GetTlfcli()+"',";
     Sql=Sql+"'"+cli.GetDireccion()+"',";
     Sql=Sql+"'"+cli.GetEmail()+"','activo')";
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  } 
  
 //----------------------------------
  public void ModificarCliente(Cliente cli)  
  {
     String Sql;
     
     Sql="UPDATE cliente SET nombre="+Validaciones.Apost(cli.GetNombrecli())+",";
     Sql=Sql+"apellido="+Validaciones.Apost(cli.GetApellidocli())+",";
     Sql=Sql+"telefono="+Validaciones.Apost(cli.GetTlfcli())+",";
     Sql=Sql+"direccion="+Validaciones.Apost(cli.GetDireccion())+",";
     Sql=Sql+"email="+Validaciones.Apost(cli.GetEmail());
     Sql=Sql+" WHERE cedulacli="+Validaciones.Apost(cli.GetCedulacli());
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
 //-------------------------------------- 
   public void EliminarCliente(String cli)  
  {
     String Sql;
     
     Sql="UPDATE cliente SET status='eliminado' WHERE cedulacli="+Validaciones.Apost(cli);                  
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
  //----------------------------------
  public ResultSet GetCliente()
  {
     String Sql;
     ResultSet registroCli;
     
     Sql="SELECT * FROM  cliente WHERE status='activo'";
     registroCli=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroCli;
          
  }   
//-----------------------------
  public ResultSet BuscarCliente(String cedula)
  {
     String Sql;
     ResultSet registroCli;
     
     cedula=cedula.trim();
     Sql="SELECT * FROM  cliente WHERE cedulacli="+Validaciones.Apost(cedula);
     //Sql=Sql+" AND status='activo'";
     registroCli=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroCli;      
  }  
  
    public ResultSet ConsultarCliente() throws SQLException
    {
      String Sql;
      ResultSet RegistroCli;  
      
      Sql="SELECT * FROM  Cliente WHERE status='activo'";                                            
      RegistroCli=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return RegistroCli; 
        
   }
}
