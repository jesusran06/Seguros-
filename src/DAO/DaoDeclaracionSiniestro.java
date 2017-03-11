package Dao;

import Modelo.ClassConexionDAO;
import Modelo.DeclaracionSiniestro;
import Modelo.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoDeclaracionSiniestro extends ClassConexionDAO
{
    public void InsertarDeclaracionSiniestro(DeclaracionSiniestro si)  
  {
     String Sql;
     
     Sql="INSERT INTO declaracion_siniestro(codigosiniestro,"
             + "fechaocurrencia,fecharegistro,"
             + "lugarocurrencia,ciudad,"
             + "estado,autoridad,"
             + "descripcion,ceduladecla,"
             + "nombredecla, apellidodecla,"
             + "tlfdecla, relaciondecla,"
             + "cedulacli, nombrecli,"
             + "placacli,marcacli,modelocli,"
             + "serialcarrcli,anocli,"
             + "colorcli,danoscli,placacontra,"
             + "marcacontra, modelocontra,serialcarrcontra,"
             + "anocontra,colorcontra, danoscontra, codigoana,"
             + "nombreana,apellidocli,status) VALUES (";
     Sql=Sql+"'"+si.GetCodigo()+"',";
     Sql=Sql+"'"+si.GetFechaocurrencia()+"',";
     Sql=Sql+"'"+si.GetFechareigstro()+"',";
     Sql=Sql+"'"+si.GetLugarocurrencia()+"',";
     Sql=Sql+"'"+si.GetCiudad()+"',";
     Sql=Sql+"'"+si.GetEstado()+"',";
     Sql=Sql+"'"+si.GetAutoridad()+"',";
     Sql=Sql+"'"+si.GetDescripsiniestro()+"',";
     Sql=Sql+"'"+si.GetCeduladecla()+"',";
     Sql=Sql+"'"+si.GetNombredecla()+"',";
     Sql=Sql+"'"+si.GetApellidodecla()+"',";
     Sql=Sql+"'"+si.GetTlfdecla()+"',";
     Sql=Sql+"'"+si.GetRelaciondecla()+"',";
     Sql=Sql+"'"+si.GetCedulacli()+"',";
     Sql=Sql+"'"+si.GetNombrecli()+"',";
     Sql=Sql+"'"+si.GetPlacacli()+"',";
     Sql=Sql+"'"+si.GetMarcacli()+"',";
     Sql=Sql+"'"+si.GetModelocli()+"',";
     Sql=Sql+"'"+si.GetSerialcarrcli()+"',";
     Sql=Sql+"'"+si.GetAnocli()+"',";
     Sql=Sql+"'"+si.GetColorcli()+"',";
     Sql=Sql+"'"+si.GetDanoscli()+"',";
     Sql=Sql+"'"+si.GetPlacacontra()+"',";
     Sql=Sql+"'"+si.GetMarcacontra()+"',";
     Sql=Sql+"'"+si.GetModelocontra()+"',";
     Sql=Sql+"'"+si.GetSerialcarrcontra()+"',";
     Sql=Sql+"'"+si.GetAnocontra()+"',";
     Sql=Sql+"'"+si.GetColorcontra()+"',";
     Sql=Sql+"'"+si.GetDanoscontra()+"',";
     Sql=Sql+"'"+si.GetCodigoana()+"',";
     Sql=Sql+"'"+si.GetNombreana()+"',";
     Sql=Sql+"'"+si.GetApellidoCli()+"','activo')";
   

     PackageConeccion.ConeccionBD.ejecutar(Sql);
  } 
        
  
  //----------------------------------
  public ResultSet GetSiniestro()
  {
     String Sql;
     ResultSet registroSi;
     
     Sql="SELECT * FROM  declaracion_siniestro";
     registroSi=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroSi;
           
  }   
//-----------------------------
  public ResultSet BuscarDeclaracionSiniestro(String codigo)
  {
     String Sql;
     ResultSet registroSi;
     
     codigo=codigo.trim();
     Sql="SELECT * FROM  declaracion_siniestro WHERE codigosiniestro='"+codigo+"'";
     Sql=Sql+" AND status='activo'";
     registroSi=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroSi;
           
  }
  
  public ResultSet ConsultarMarcaSiniestro(String marca, String modelo) throws SQLException
    {
      String Sql;
      ResultSet Registro=null;  
      
      Sql="SELECT * FROM  declaracion_siniestro WHERE status='activo' AND marcacli='"+marca+"'";
      Sql=Sql+" AND modelocli='"+modelo+"'";
      Registro=PackageConeccion.ConeccionBD.consultar(Sql);
      
      return Registro; 
        
   }

  public String dsiniestroSiguiente() throws SQLException
{
    String codigo;
    ResultSet regisUltimo;
    String Sql="SELECT MAX(codigo_generado) AS ultimo FROM declaracion_siniestro";                                            
    regisUltimo = PackageConeccion.ConeccionBD.consultar(Sql);
    
    if (regisUltimo.next()) 
      {
        codigo="DS"+ Validaciones.Cint_String(regisUltimo.getInt("ultimo")+1);
      }
    else
     codigo="DS1";
    
    return codigo;
}

}
