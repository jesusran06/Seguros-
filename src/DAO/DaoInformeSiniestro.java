
package DAO;

import Modelo.ClassConexionDAO;
import Modelo.InformeSiniestro;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Indrina Meza
 */
public class DaoInformeSiniestro extends ClassConexionDAO
{  String monto;
    public void InsertarInformeSiniestro(InformeSiniestro is)  
  {
     String Sql;
     monto=Float.toString(is.getMonto());
     Sql="INSERT INTO informe_siniestro (codigois, codigosiniestro, "
             + "cedulacli, nombrecli, apellidocli, placa, marca, "
             + "modelo, ano, serialcarr, detalles, monto,"
             + "cedulape, nombrepe, apellidope, status) VALUES (";
     Sql=Sql+"'"+is.getCodigo()+"',";
     Sql=Sql+"'"+is.getCodigosiniestro()+"',";
     Sql=Sql+"'"+is.getCedulacli()+"',";
     Sql=Sql+"'"+is.getNombrecli()+"',";
     Sql=Sql+"'"+is.getApellidocli()+"',";
     Sql=Sql+"'"+is.getPlaca()+"',";
     Sql=Sql+"'"+is.getMarca()+"',";
     Sql=Sql+"'"+is.getModelo()+"',";
     Sql=Sql+"'"+is.getAno()+"',";
     Sql=Sql+"'"+is.getScarroceria()+"',";
     Sql=Sql+"'"+is.getDetalles()+"',";
     Sql=Sql+"'"+monto+"',";
     Sql=Sql+"'"+is.getCedulape()+"',";
     Sql=Sql+"'"+is.getNombrepe()+"',";
     Sql=Sql+"'"+is.getApellidope()+"','activo')";
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  } 
 //----------------------------------------
    public ResultSet ConsultarInformeSiniestro() throws SQLException
    {
      String Sql;
      ResultSet RegistroIS=null;  
      
      Sql="SELECT * FROM  informe_siniestro WHERE status='activo'";                                            
      RegistroIS=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return RegistroIS; 
        
   }
    
  
//-----------------------------------------
public String siniestroSiguiente() throws SQLException
{
    String codigo;
    ResultSet regisUltimo;
    String Sql="SELECT MAX(codigo_generado) AS ultimo FROM informe_siniestro";                                            
    regisUltimo = PackageConeccion.ConeccionBD.consultar(Sql);
    
    if (regisUltimo.next()) 
      {
        codigo="IS"+ Validaciones.Cint_String(regisUltimo.getInt("ultimo")+1);
      }
    else
     codigo="IS1";
    
    return codigo;
}
//------------------------------------------------------

}
