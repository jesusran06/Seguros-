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
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.SerCob;

public class DaoSerCob {
    String precio;
    
    public void InsertarSerCob(SerCob sercob){
        
        String sql;
        sql = sql="INSERT INTO sercob(codser, codcob, codigo, precio, nombre) VALUES (";
        sql=sql+"'"+sercob.getCodigoser()+"',";
        sql=sql+"'"+sercob.getCodigocob()+"',";
        sql=sql+"'"+sercob.getCodigo()+"',";
        sql=sql+"'"+sercob.getPrecio()+"',";
        sql=sql+"'"+sercob.getNombre()+"')";
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    
    public void ModificarSerCob(SerCob sercob){
        String sql;
        sql = "UPDATE sercob SET"+
                "codser='"+sercob.getCodigoser()+"',"+
                "codcob='"+sercob.getCodigocob()+"',"+
                "precio='"+sercob.getPrecio()+"',"+
                "nombre'"+sercob.getNombre()+"',"+
                "WHERE codigo = '"+sercob.getCodigo()+"'";
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public ResultSet ConsultarSerCob(String cod) throws SQLException {
        String sql;
        ResultSet Registro ;
        cod=cod.trim();
        sql = "SELECT * FROM sercob WHERE codcob="+Validaciones.Apost(cod);
        Registro=PackageConeccion.ConeccionBD.consultar(sql);
        return Registro;
    }
     public void EliminarSercob(String cod)  
  {
     String Sql;
     Sql="DELETE FROM sercob WHERE codcob="+Validaciones.Apost(cod);
     cod=cod.trim();
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
     public String SerCobSiguiente() throws SQLException
{
    String codigo;
    ResultSet regisUltimo;
    String Sql="SELECT MAX(codigo_generado) AS ultimo FROM sercob";                                            
    regisUltimo = PackageConeccion.ConeccionBD.consultar(Sql);
    
    if (regisUltimo.next()) 
      {
        codigo="COBER"+ Validaciones.Cint_String(regisUltimo.getInt("ultimo")+1);
      }
    else
     codigo="COBER1";
    
    return codigo;
}
}
