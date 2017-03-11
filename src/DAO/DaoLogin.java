/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modelo.Login;
import Modelo.ClassConexionDAO;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author jesus
 */
public class DaoLogin extends ClassConexionDAO{
    public void InsertarLogin(Login log){
        String sql;
        sql= "INSERT INTO Login(Usuario, Contraseña, Roll, status) VALUES(";
        sql= sql+"'"+log.getUsuario()+"',";
        sql= sql+"'"+log.getContraseña()+"',";
        sql= sql+"'"+log.getRoll()+"','activo')";
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public void ModificarLogin(Login log){
        String sql;
        sql= "UPDATE Login SET contraseña="+Validaciones.Apost(log.getContraseña())+",";
        sql= sql+"roll ="+Validaciones.Apost(log.getRoll());
        sql= sql+"WHERE usuario="+Validaciones.Apost(log.getUsuario());
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
     public ResultSet ConsultarLogin() throws SQLException
    {
      String Sql;
      ResultSet RegistroLog;  
      
      Sql="SELECT * FROM Login WHERE status='activo'";                                            
      RegistroLog=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return RegistroLog; 
        
   }
     public ResultSet VerificarUsuario(String usuario)
  {
     String Sql;
     ResultSet registroLog;
     
     usuario=usuario.trim();
     Sql="SELECT * FROM  login WHERE usuario = "+Validaciones.Apost(usuario);
     registroLog=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroLog;      
  } 
      public void EliminarLogin(String log)  
  {
     String Sql;
     
     Sql="UPDATE Login SET status='eliminado' WHERE Usuario="+Validaciones.Apost(log);                  
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
}
