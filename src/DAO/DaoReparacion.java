
package DAO;

import Modelo.ClassConexionDAO;
import Modelo.Reparacion;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Indrina Meza
 */
 public class DaoReparacion extends ClassConexionDAO
{   
   String costo;
    public void InsertarReparacion(Reparacion re)  
  {
     String Sql;
     costo=Float.toString(re.getCosto());
     Sql="INSERT INTO reparacion(codigorepa, nombrerepa, descripcionrepa,costorepa, status) VALUES (";
     Sql=Sql+"'"+re.getCodigo()+"',";
     Sql=Sql+"'"+re.getNombre()+"',";
     Sql=Sql+"'"+re.getDescripcion()+"',";
     Sql=Sql+"'"+costo+"','activo')";
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  } 
  
 //----------------------------------
  public void ModificarReparacion(Reparacion re)  
  {
     String Sql;
     costo=Float.toString(re.getCosto());
     Sql="UPDATE reparacion SET nombrerepa="+Validaciones.Apost(re.getNombre())+",";
     Sql=Sql+"descripcionrepa="+Validaciones.Apost(re.getDescripcion())+",";
     Sql=Sql+"costorepa='"+costo+"'";
     Sql=Sql+" WHERE codigorepa="+Validaciones.Apost(re.getCodigo());
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
 //-------------------------------------- 
   public void EliminarReparacion(String re)  
  {
     String Sql;
     
     Sql="UPDATE reparacion SET status='eliminado' WHERE codigorepa="+Validaciones.Apost(re);                  
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
  
  //----------------------------------
  public ResultSet GetReparacion()
  {
     String Sql;
     ResultSet registroRe;
     
     Sql="SELECT * FROM  reparacion WHERE statusrepa='activo'";
     registroRe=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroRe;
          
  }   
//-----------------------------
  public ResultSet BuscarReparacion(String codigo)
  {
     String Sql;
     ResultSet registroRe;
     
     codigo=codigo.trim();
     Sql="SELECT * FROM  reparacion WHERE codigorepa="+Validaciones.Apost(codigo);
     //Sql=Sql+" AND status='activo'";
     registroRe=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroRe;      
  }  
  //-----------------------------------
    public ResultSet ConsultarReparacion() 
    {
      String Sql;
      ResultSet RegistroRe;  
      
      Sql="SELECT * FROM  reparacion WHERE status='activo'";                                            
      RegistroRe=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return RegistroRe; 
        
   }
    
    
public String reparacionSiguiente() throws SQLException
{
    String codigo;
    ResultSet regisUltimo;
    String Sql="SELECT MAX(codigo_generado) AS ultimo FROM reparacion";                                            
    regisUltimo = PackageConeccion.ConeccionBD.consultar(Sql);
    
    if (regisUltimo.next()) 
      {
        codigo="REPA"+ Validaciones.Cint_String(regisUltimo.getInt("ultimo")+1);
      }
    else
     codigo="REPA1";
    
    return codigo;
}
}
