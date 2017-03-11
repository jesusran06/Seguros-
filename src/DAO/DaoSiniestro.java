package Dao;

import Modelo.ClassConexionDAO;
import Modelo.Siniestro;
import Modelo.Validaciones;
import java.sql.ResultSet;

public class DaoSiniestro extends ClassConexionDAO
{
    public void InsertarSiniestro(Siniestro si)  
  {
     String Sql;
     
     Sql="INSERT INTO Siniestro(codigosiniestro,fechasiniestro,fecharevsiniestro,"
             + "descripsiniestro,placavehiculo,codigoanalista,cedulacliente,status) VALUES (";
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
     Sql=Sql+"'"+si.GetSerialcarrcli()+"',";
     Sql=Sql+"'"+si.GetAnocli()+"',";
     Sql=Sql+"'"+si.GetColorcli()+"',";
     Sql=Sql+"'"+si.GetDanoscontra()+"',";
     Sql=Sql+"'"+si.GetCodigoana()+"',";
     Sql=Sql+"'"+si.GetNombreana()+"',";
   

     PackageConeccion.ConeccionBD.ejecutar(Sql);
  } 
  
 //----------------------------------
  public void ModificarSiniestro(Siniestro si)  
  {
     String Sql;
     
     Sql="UPDATE Siniestro SET Fecha de ocurrrencia="+si.GetFechaocurrencia()+",";
     Sql=Sql+"Fecha de registro="+si.GetFechareigstro()+",";
     Sql=Sql+"Lugar de ocurrencia="+Validaciones.Apost(si.GetLugarocurrencia())+","; 
     Sql=Sql+"Ciudad="+Validaciones.Apost(si.GetCiudad())+","; 
     Sql=Sql+"Estado="+Validaciones.Apost(si.GetEstado())+",";
     Sql=Sql+"Autoridad que intervino="+Validaciones.Apost(si.GetAutoridad())+","; 
     Sql=Sql+"Descripcion="+Validaciones.Apost(si.GetDescripsiniestro());
     Sql=Sql+"Cedula declarante="+Validaciones.Apost(si.GetCeduladecla())+","; 
     Sql=Sql+"Nombre declarante="+Validaciones.Apost(si.GetNombredecla());
     Sql=Sql+"Apellido declarante="+Validaciones.Apost(si.GetApellidodecla())+","; 
     Sql=Sql+"Telefono declarante="+Validaciones.Apost(si.GetTlfdecla());
     Sql=Sql+"Relacion del declarante="+Validaciones.Apost(si.GetRelaciondecla())+","; 
     Sql=Sql+"Cedula del cliente="+Validaciones.Apost(si.GetCedulacli());
     Sql=Sql+"Nombre del cliente="+Validaciones.Apost(si.GetNombrecli())+","; 
     Sql=Sql+"Placa de vehiculo del cliente="+Validaciones.Apost(si.GetPlacacli())+","; 
     Sql=Sql+"Marca del cliente="+Validaciones.Apost(si.GetMarcacli());
     Sql=Sql+"modelo del cliente="+Validaciones.Apost(si.GetModelocli())+","; 
     Sql=Sql+"Serial de carroceria="+Validaciones.Apost(si.GetSerialcarrcli());
     Sql=Sql+"Ano del vehiculo="+Validaciones.Apost(si.GetAnocli())+","; 
     Sql=Sql+"Color="+Validaciones.Apost(si.GetColorcli());
     Sql=Sql+"Danos presentados="+Validaciones.Apost(si.GetDanoscli())+","; 
     Sql=Sql+"Placa del vehiculo contrario="+Validaciones.Apost(si.GetPlacacontra());
     Sql=Sql+"Marca="+Validaciones.Apost(si.GetMarcacontra())+","; 
     Sql=Sql+"Modelo="+Validaciones.Apost(si.GetModelocontra());
     Sql=Sql+"Serial de carroceria="+Validaciones.Apost(si.GetSerialcarrcli())+","; 
     Sql=Sql+"Ano="+Validaciones.Apost(si.GetAnocli());
     Sql=Sql+"Color="+Validaciones.Apost(si.GetColorcli())+","; 
     Sql=Sql+"Danos="+Validaciones.Apost(si.GetDanoscontra());
     Sql=Sql+"Cedula de analista="+Validaciones.Apost(si.GetCodigoana())+","; 
     Sql=Sql+"Nombre="+Validaciones.Apost(si.GetNombreana()); 
     Sql=Sql+" WHERE codigo="+Validaciones.Apost(si.GetCodigo());
     PackageConeccion.ConeccionBD.ejecutar(Sql);
    
  }        
  
  //----------------------------------
  public ResultSet GetSiniestro()
  {
     String Sql;
     ResultSet registroSi;
     
     Sql="SELECT * FROM  Siniestro";
     registroSi=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroSi;
           
  }   
//-----------------------------
  public ResultSet BuscarSiniestro(String codigo)
  {
     String Sql;
     ResultSet registroSi;
     
     codigo=codigo.trim();
     Sql="SELECT * FROM  Siniestro WHERE codigo='"+codigo+"'";
     Sql=Sql+" AND status='activo'";
     registroSi=PackageConeccion.ConeccionBD.consultar(Sql);
     return registroSi;
           
  }   
  
}
