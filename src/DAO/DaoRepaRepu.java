
package DAO;

import Modelo.RepaRepu;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Indrina Meza
 */
public class DaoRepaRepu {
    String precio;
    public void InsertarRepaRepu(RepaRepu rep){
        precio=Float.toString((float)rep.getPreciorepu());
        String sql;
        sql="INSERT INTO repa_repu(codigo, codigo_repa, codigo_repu,nombre_repu,precio) VALUES (";
     sql=sql+"'"+rep.getCodigo()+"',";
     sql=sql+"'"+rep.getCodrepu()+"',";
     sql=sql+"'"+rep.getCodrepa()+"',";
     sql=sql+"'"+rep.getNombrerepu()+"',";
     sql=sql+"'"+precio+"')";
     PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    public void ModificarRepaRepu(RepaRepu rep){
        String sql;
        sql = "UPDATE repa_repu SET"+
                "codigo='"+rep.getCodigo()+"',"+
                "codigo_repu='"+rep.getCodrepu()+"',"+
                "codigo_repa'"+rep.getCodrepa()+"',"+
                "nombre_repu'"+rep.getNombrerepu()+"',"+
                "precio'"+rep.getPreciorepu()+"',"+
                "WHERE codigo='"+rep.getCodigo()+"'";
        PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    
    public ResultSet ConsultarRepaRepu(String cod) throws SQLException {
        String sql;
        ResultSet Registro ;
        cod=cod.trim();
        sql = "SELECT * FROM repa_repu WHERE codigo_repa="+Validaciones.Apost(cod);
        Registro=PackageConeccion.ConeccionBD.consultar(sql);
        return Registro;
    }
    
    public String ReparepuSiguiente() throws SQLException
{
    String codigo;
    ResultSet regisUltimo;
    String Sql="SELECT MAX(codigo_generado) AS ultimo FROM repa_repu";                                            
    regisUltimo = PackageConeccion.ConeccionBD.consultar(Sql);
    
    if (regisUltimo.next()) 
      {
        codigo="REPARE"+ Validaciones.Cint_String(regisUltimo.getInt("ultimo")+1);
      }
    else
     codigo="REPARE1";
    
    return codigo;
}
    
    public void EliminarRepaRepu(String cod)  
  {
     String Sql;
     Sql="DELETE FROM repa_repu WHERE codigo_repa="+Validaciones.Apost(cod);
     cod=cod.trim();
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
    
}
