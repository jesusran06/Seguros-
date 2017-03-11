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
import Modelo.TipoPoliza;
import Modelo.ClassConexionDAO;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoTipoPoliza {
   
    public class DaoSTipoCobertura extends ClassConexionDAO{
        public void InsertarTipo(TipoPoliza tip){
            String sql;
            sql="INSERT INTO tipo_poliza(codigo, nombre, anorest, codigocober, porcentajepol, status)VALUES(";
     sql=sql+"'"+tip.getCodTip()+"',";
     sql=sql+"'"+tip.getNombTip()+"',";
     sql=sql+"'"+tip.getRestTip()+"',";
     sql=sql+"'"+tip.getCodcob()+"',";
     sql=sql+"'"+tip.getPorctip()+"',";
     sql=sql+"'"+tip.getRestTip()+"','activo')";
     PackageConeccion.ConeccionBD.ejecutar(sql);
        }
        public void ModificarTipoPoliza(TipoPoliza tip){
        String sql;
        sql = "UPDATE Servicio SET"+
                "codigo='"+tip.getCodTip()+"',"+
                "nombre='"+tip.getNombTip()+"',"+
                "anorest='"+tip.getRestTip()+"',"+
                "codigocober='"+tip.getCodcob()+"',"+
                "costSer'"+tip.getPorctip()+"',"+
                "WHERE codigo='"+tip.getCodTip()+"'";
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
        public void EliminarTipo(TipoPoliza tip){
        String sql;
        sql="UPDATE tipo_poliza SET status='eliminado' WHERE codigo="+tip.getCodTip();
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
        public ResultSet ConsultarTipo() throws SQLException {
        String sql;
        ResultSet RegistroTip = null;
        sql = "SELECT FROM tipo_poliza WHERE status='activo'";
        RegistroTip=PackageConeccion.ConeccionBD.consultar(sql);
        return RegistroTip;
        }
        public ResultSet BuscarTipo(String cod){
        String sql;
     ResultSet registroTip;
     
     cod=cod.trim();
     sql="SELECT * FROM  tipo_poliza WHERE codigo="+Validaciones.Apost(cod);
     sql=sql+" AND status='activo'";
     registroTip=PackageConeccion.ConeccionBD.consultar(sql);
     return registroTip; 
    }
    }
    
}
