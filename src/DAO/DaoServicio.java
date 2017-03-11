/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author jesus
 */
import Modelo.Servicio;
import Modelo.ClassConexionDAO;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoServicio extends ClassConexionDAO
{
    public void InsertServicio(Servicio ser){
        String sql;
        sql="INSERT INTO servicio(codser, nombser, descser, costser, status) VALUES (";
     sql=sql+"'"+ser.getCodSer()+"',";
     sql=sql+"'"+ser.getNombSer()+"',";
     sql=sql+"'"+ser.getDescSer()+"',";
     sql=sql+"'"+ser.getCostSer()+"','activo')";
     PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public void ModificarServicio(Servicio ser){
        String Sql;
        Sql = "UPDATE servicio SET nombser="+Validaciones.Apost(ser.getNombSer())+",";
     Sql=Sql+"descser="+Validaciones.Apost(ser.getDescSer())+",";
     Sql=Sql+"costser="+Validaciones.Apost(ser.getCostSer());
     Sql=Sql+" WHERE codser="+Validaciones.Apost(ser.getCodSer());
        PackageConeccion.ConeccionBD.ejecutar(Sql);
    }
    public void EliminarServicio(String ser){
        String sql;
        sql="UPDATE servicio SET status='eliminado' WHERE codser="+Validaciones.Apost(ser);
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public ResultSet ConsultarServicio() throws SQLException {
        String sql;
        ResultSet RegistroSer;
        sql = "SELECT * FROM servicio WHERE status='activo'";
        RegistroSer=PackageConeccion.ConeccionBD.consultar(sql);
        return RegistroSer;
    }
    public ResultSet GetServicio()
  {
     String Sql;
     ResultSet registroSer;
     
     Sql="SELECT * FROM  servicio WHERE status='activo'";
     registroSer=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroSer;
  }
    public ResultSet BuscarServicio(String cod){
        String sql;
     ResultSet registroSer;
     
     cod=cod.trim();
     sql="SELECT * FROM  servicio WHERE codser="+Validaciones.Apost(cod);
     registroSer=PackageConeccion.ConeccionBD.consultar(sql);
     return registroSer; 
    }
}   

