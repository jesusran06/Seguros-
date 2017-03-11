package DAO;

import Modelo.ClassConexionDAO;
import Modelo.Repuesto;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Indrina Meza
 */

    public class DaoRepuesto extends ClassConexionDAO
{   String precio;
    public void InsertarRepuesto(Repuesto re)  
  {
     String Sql;
     precio=Float.toString(re.getPrecio());
     Sql="INSERT INTO repuesto(codigorepu, nombrerepu, precio, statusrepu) VALUES (";
     Sql=Sql+"'"+re.getCodigo()+"',";
     Sql=Sql+"'"+re.getNombre()+"',";
     Sql=Sql+"'"+precio+"','activo')";
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  } 
  
 //----------------------------------
  public void ModificarRepuesto(Repuesto re)  
  {
     String Sql;
     precio=Float.toString(re.getPrecio());
     Sql="UPDATE repuesto SET nombrerepu="+Validaciones.Apost(re.getNombre())+",";
     Sql=Sql+"precio='"+precio+"'";
     Sql=Sql+" WHERE codigorepu="+Validaciones.Apost(re.getCodigo());
     
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
 //-------------------------------------- 
   public void EliminarRepuesto(String re)  
  {
     String Sql;
     
     Sql="UPDATE repuesto SET statusrepu='eliminado' WHERE codigorepu="+Validaciones.Apost(re);                  
     PackageConeccion.ConeccionBD.ejecutar(Sql);
  }
  
  //----------------------------------
  public ResultSet GetRepuesto()
  {
     String Sql;
     ResultSet registroRe;
     
     Sql="SELECT * FROM  repuesto WHERE statusrepu='activo'";
     registroRe=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroRe;
          
  }   
//-----------------------------
  public ResultSet BuscarRepuesto(String codigo)
  {
     String Sql;
     ResultSet registroRe;
     
     codigo=codigo.trim();
     Sql="SELECT * FROM  repuesto WHERE codigorepu="+Validaciones.Apost(codigo);
     //Sql=Sql+" AND status='activo'";
     registroRe=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroRe;      
  }  
//------------------------------------------------  
    public ResultSet ConsultarRepuesto() throws SQLException
    {
      String Sql;
      ResultSet RegistroRe=null;  
      
      Sql="SELECT * FROM  repuesto WHERE statusrepu='activo'";                                            
      RegistroRe=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return RegistroRe; 
        
   }
//------------------------------------------------ 
    public String repuestoSiguiente() throws SQLException
{
    String codigo;
    ResultSet regisUltimo;
    String Sql="SELECT MAX(codigo_generado) AS ultimo FROM repuesto";                                            
    regisUltimo = PackageConeccion.ConeccionBD.consultar(Sql);
    
    if (regisUltimo.next()) 
      {
        codigo="REPU"+ Validaciones.Cint_String(regisUltimo.getInt("ultimo")+1);
      }
    else
     codigo="REPU1";
    
    return codigo;
}
}
