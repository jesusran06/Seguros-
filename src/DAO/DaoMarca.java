/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ClassConexionDAO;
import Modelo.Marca;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Indrina Meza
 */
public class DaoMarca extends ClassConexionDAO
{ 
   public ResultSet ConsultarMarca() throws SQLException
    {
      String Sql;
      ResultSet Registro;  
      
      Sql="SELECT * FROM  marca WHERE status='activo'";                                            
      Registro=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return Registro; 
        
   }
   
   public ResultSet BuscarMarca(String nombre)
  {
     String Sql;
     ResultSet registroCli;
     
     nombre=nombre.trim();
     Sql="SELECT * FROM  marca WHERE cedulacli="+Validaciones.Apost(nombre);
     //Sql=Sql+" AND status='activo'";
     registroCli=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroCli;      
  } 

    
}
