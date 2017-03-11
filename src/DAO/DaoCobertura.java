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
import Modelo.Cobertura;
import Modelo.ClassConexionDAO;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCobertura extends ClassConexionDAO
{
    public void InsertarCobertura(Cobertura cob){
        String sql;
        sql="INSERT INTO cobertura(codcob, costo, status) VALUES (";
     sql=sql+"'"+cob.getCodCober()+"',";
     sql=sql+"'"+cob.getCosto()+"','activo')";
    
     PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public void ModificarCobertura(Cobertura cob){
        String sql;
        sql="UPDATE cobertura SET costo="+Validaciones.Apost(cob.getCosto());
        sql=sql+" WHERE codcob= "+Validaciones.Apost(cob.getCodCober());
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public void EliminarCobertura(String cob){
        String sql;
        sql="UPDATE cobertura SET status='eliminado' WHERE codser="+Validaciones.Apost(cob);
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public ResultSet ConsultarCobertura() throws SQLException {
        String sql;
        ResultSet RegistroCob = null;
        sql = "SELECT FROM cobertura WHERE status='activo'";
        RegistroCob=PackageConeccion.ConeccionBD.consultar(sql);
        return RegistroCob;
    }
    public ResultSet BuscarCobertura(String cod){
        String sql;
     ResultSet registroCob;
     
     cod=cod.trim();
     sql="SELECT * FROM  cobertura WHERE codcob="+Validaciones.Apost(cod);
     sql=sql+" AND status='activo'";
     registroCob=PackageConeccion.ConeccionBD.consultar(sql);
     return registroCob; 
    }
    public String CoberturaSiguiente() throws SQLException
{
    String codigo;
    ResultSet regisUltimo;
    String Sql="SELECT MAX(codigo_generado) AS ultimo FROM Cobertura";                                            
    regisUltimo = PackageConeccion.ConeccionBD.consultar(Sql);
    
    if (regisUltimo.next()) 
      {
        codigo="COB-"+ Validaciones.Cint_String(regisUltimo.getInt("ultimo")+1);
      }
    else
     codigo="COB-1";
    
    return codigo;
}
}   
