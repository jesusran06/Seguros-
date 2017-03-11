
package DAO;

import Modelo.ClassConexionDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Indrina Meza
 */
public class DaoModelo extends ClassConexionDAO
{ 
   public ResultSet ConsultarModelo() throws SQLException
    {
      String Sql;
      ResultSet Registro;  
      
      Sql="SELECT * FROM  modelo WHERE status='activo'";                                            
      Registro=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return Registro; 
        
   }

    
}