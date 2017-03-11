/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modelo.ClassConexionDAO;
import Modelo.Corredor;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author jesus
 */
public class DaoCorredor extends ClassConexionDAO{
    public void InsertarCorredor(Corredor cor){
        String sql;
        sql = "INSERT INTO corredor(codcorr, nomcorr, telecorr, apellcorr, cedcorr,"
                + "correocorr, direcorr, status) VALUES (";
        sql=sql+"'"+cor.getCodigocorr()+"',";
     sql=sql+"'"+cor.getNombrecorr()+"',";
     sql=sql+"'"+cor.getTlfcorr()+"',";
     sql=sql+"'"+cor.getApellidocorr()+"',";
     sql=sql+"'"+cor.getCedulacorr()+"',";
     sql=sql+"'"+cor.getEmailcorr()+"',";
     sql=sql+"'"+cor.getDireccioncorr()+"','activo')";
     
     PackageConeccion.ConeccionBD.ejecutar(sql);               
    }
    public void ModificarCorredor(Corredor cor)  
  {
     String Sql;
     
     Sql="UPDATE corredor SET nomcorr="+Validaciones.Apost(cor.getNombrecorr())+",";
     Sql=Sql+"telecorr="+Validaciones.Apost(cor.getTlfcorr())+",";
     Sql=Sql+"apellcorr="+Validaciones.Apost(cor.getApellidocorr())+",";
     Sql=Sql+"cedcorr="+Validaciones.Apost(cor.getCedulacorr())+",";
     Sql=Sql+"correocorr="+Validaciones.Apost(cor.getEmailcorr())+",";
     Sql=Sql+"direcorr="+Validaciones.Apost(cor.getDireccioncorr());
     Sql=Sql+" WHERE codcorr="+Validaciones.Apost(cor.getCodigocorr());
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
    public void EliminarCorredor(String cor)  
  {
     String Sql;
     
     Sql="UPDATE corredor SET status='eliminado' WHERE codcorr="+Validaciones.Apost(cor);                  
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
    public ResultSet GetCorredor()
  {
     String Sql;
     ResultSet registroCor;
     
     Sql="SELECT * FROM  corredor WHERE status='activo'";
     registroCor=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroCor;
          
  }   
//-----------------------------
  public ResultSet BuscarCorredor(String codigo)
  {
     String Sql;
     ResultSet registroCor;
     
     codigo=codigo.trim();
     Sql="SELECT * FROM  corredor WHERE codcorr="+Validaciones.Apost(codigo);
     
     registroCor=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroCor;      
  }  
  
    public ResultSet ConsultarCorredor() throws SQLException
    {
      String Sql;
      ResultSet RegistroCor;  
      
      Sql="SELECT * FROM corredor WHERE status='activo'";                                            
      RegistroCor=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return RegistroCor; 
        
   }
}
