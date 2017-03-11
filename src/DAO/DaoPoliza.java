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
import Modelo.Poliza;
import Modelo.ClassConexionDAO;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoPoliza extends ClassConexionDAO
{
    public void InsertServicio(Poliza pol){
        String sql;
        sql="INSERT INTO poliza(codpol, fechainicio, fechafin, status) VALUES (";
     sql=sql+"'"+pol.getCodPol()+"',";
     sql=sql+"'"+pol.getFechainiPol()+"',";
     sql=sql+"'"+pol.getFechafinPol()+"','activo')";
     PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public void ModificarServicio(Poliza pol){
        String sql;
        sql = "UPDATE Servicio SET"+
                "nombSer='"+pol.getCodPol()+"',"+
                "codSer='"+pol.getFechafinPol()+"',"+
                "descSer'"+pol.getFechainiPol()+"',"+
                "WHERE codpol='"+pol.getCodPol()+"'";
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public void EliminarServicio(Poliza pol){
        String sql;
        sql="UPDATE Servicio SET status='eliminado' WHERE codpol="+pol.getCodPol();
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public ResultSet ConsultarServicio() throws SQLException {
        String sql;
        ResultSet RegistroSer = null;
        sql = "SELECT FROM Servicio WHERE status='activo'";
        RegistroSer=PackageConeccion.ConeccionBD.consultar(sql);
        return RegistroSer;
    }
    public ResultSet BuscarServicio(String cod){
        String sql;
     ResultSet registroSer;
     
     cod=cod.trim();
     sql="SELECT * FROM  Servicio WHERE cedulacli="+Validaciones.Apost(cod);
     sql=sql+" AND status='activo'";
     registroSer=PackageConeccion.ConeccionBD.consultar(sql);
     return registroSer; 
    }
}   
