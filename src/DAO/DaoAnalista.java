package DAO;

import Modelo.ClassConexionDAO;
import Modelo.Analista;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAnalista extends ClassConexionDAO
{
    public void InsertarAnalista(Analista ana)  
  {
     String Sql;
     
     Sql="INSERT INTO analista(codigoana, cedula, nombre, apellido, telefono, status, direccion, correo) VALUES (";
     Sql=Sql+"'"+ana.GetCodigoana()+"',";
     Sql=Sql+"'"+ana.GetCedulaana()+"',";
     Sql=Sql+"'"+ana.GetNombreana()+"',";
     Sql=Sql+"'"+ana.GetApellidoana()+"',";
     Sql=Sql+"'"+ana.GetTlfana()+"',";
     Sql=Sql+"'"+ana.getDirec()+"',";
     Sql=Sql+"'"+ana.getEmail()+"','activo')";                         

     PackageConeccion.ConeccionBD.ejecutar(Sql);
  } 
  
 //----------------------------------
  public void ModificarAnalista(Analista ana)  
  {
     String Sql;
     
     Sql="UPDATE analista SET cedula="+Validaciones.Apost(ana.GetCedulaana())+",";
     Sql=Sql+"nombre="+Validaciones.Apost(ana.GetNombreana())+",";
     Sql=Sql+"apellido="+Validaciones.Apost(ana.GetApellidoana())+",";
     Sql=Sql+"telefono="+Validaciones.Apost(ana.GetTlfana())+",";
     Sql=Sql+"direccion="+Validaciones.Apost(ana.getDirec())+",";
     Sql=Sql+"correo="+Validaciones.Apost(ana.getEmail());
     Sql=Sql+" WHERE codigoana="+Validaciones.Apost(ana.GetCodigoana());
     Sql=Sql+" AND status='activo'";
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
 //-------------------------------------- 
   public void EliminarAnalista(String ana)  
  {
     String Sql;
     
     Sql="UPDATE analista SET status='eliminado'";                
     Sql=Sql+" WHERE codigoana="+Validaciones.Apost(ana);
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
  
  //----------------------------------
  public ResultSet GetAnalista()
  {
     String Sql;
     ResultSet registro;
     
     Sql="SELECT * FROM  analista";
     registro=PackageConeccion.ConeccionBD.consultar(Sql);
     return registro;
           
  }   
//-----------------------------
  public ResultSet BuscarAnalista(String codigo)
  {
     String Sql;
     ResultSet registro;
     
     codigo=codigo.trim();
     Sql="SELECT * FROM  analista WHERE codigoana='"+codigo+"'";
     registro=PackageConeccion.ConeccionBD.consultar(Sql);
     return registro;
           
  }   
  
  public ResultSet ConsultarAnalista() throws SQLException
    {
      String Sql;
      ResultSet RegistroAna=null;  
      
      Sql="SELECT * FROM  analista WHERE status='activo'";                                            
      RegistroAna=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return RegistroAna; 
        
   }
  
}

