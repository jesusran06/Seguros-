package Modelo;
import java.util.Date;

public class Siniestro 
{
    private
    String codigo;
    Date fechaocurrencia;
    Date fechareigstro;
    String lugarocurrencia;
    String ciudad;
    String estado;
    String autoridad;
    String descripsiniestro;
    String ceduladecla;
    String nombredecla;
    String apellidodecla;
    String tlfdecla;
    String relaciondecla;
    String cedulacli;
    String nombrecli;
    String apellidocli;
    
    String placacli;
    String marcacli;
    String modelocli;
    String serialcarrcli;
    String anocli;
    String colorcli;
    String danoscli;
    
    String placacontra;
    String marcacontra;
    String modelocontra;
    String serialcarrcontra;
    String anocontra;
    String colorcontra;
    String danoscontra;
    
    String codigoana;
    String nombreana;
    String status;
  
            
    public Siniestro( String codigo, Date fechaocurrencia, Date fechareigstro,
    String lugarocurrencia, String cuidad, String estado, String autoridad,
    String descripsiniestro, String ceduladecla, String nombredecla,
    String apellidodecla, String tlfdecla, String relaciondecla, String cedulacli,
    String nombrecli, String apellidocli, String placacli,String marcacli, String modelocli, 
    String serialcarrcli, String anocli,String colorcli, String danoscli, 
    String placacontra, String marcacontra,String modelocontra, String serialcarrcontra,
    String anocontra, String colorcontra, String danoscontra, String codigoana, String nombreana,
    String status) 
    {
        this.codigo = codigo;
        this.fechaocurrencia = fechaocurrencia;
        this.fechareigstro = fechareigstro;
        this.descripsiniestro = descripsiniestro;
        this.lugarocurrencia = lugarocurrencia;
        this.ciudad = cuidad;
        this.estado = estado;
        this.autoridad = autoridad;
        this.descripsiniestro = descripsiniestro;
        
        this.ceduladecla = ceduladecla;
        this.nombredecla = nombredecla;
        this.apellidodecla = apellidodecla;
        this.tlfdecla = tlfdecla;
        this.relaciondecla = relaciondecla;
        
        this.cedulacli = cedulacli;
        this.nombrecli = nombrecli;
        this.apellidocli = apellidocli;
        
        
        this.placacli=placacli;
        this.marcacli=marcacli;
        this.modelocli=modelocli;
        this.serialcarrcli=serialcarrcli;
        this.anocli=anocli;
        this.danoscli=danoscli;
        
        this.placacontra=placacontra;
        this.marcacontra=marcacontra;
        this.modelocontra=modelocontra;
        this.serialcarrcontra=serialcarrcontra;
        this.anocontra=anocontra;
        this.danoscontra=danoscontra;
        this.codigoana=codigoana;
        this.nombreana=nombreana;
        this.status=status;
    }
   
//-------------------------------------------------------    
    public Siniestro()
    {
       this.codigo = "";
        this.fechaocurrencia = null;
        this.fechareigstro = null;
        this.descripsiniestro = "";
        this.lugarocurrencia = "";
        this.ciudad = "";
        this.estado = "";
        this.autoridad = "";
        this.descripsiniestro = "";
        
        this.ceduladecla = "";
        this.nombredecla = "";
        this.apellidodecla = "";
        this.tlfdecla ="";
        this.relaciondecla = "";
        
        this.cedulacli = "";
        this.nombrecli = "";
        this.apellidocli ="";
        
        
        this.placacli="";
        this.marcacli="";
        this.modelocli="";
        this.serialcarrcli="";
        this.anocli="";
        this.danoscli="";
        
        this.placacontra="";
        this.marcacontra="";
        this.modelocontra="";
        this.serialcarrcontra="";
        this.anocontra="";
        this.danoscontra=""; 
        
        this.codigoana="";
        this.nombreana="";
        this.status="";
       
    }            

    public String GetCodigo() {
        return codigo;
    }

    public void SetCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date GetFechaocurrencia() {
        return fechaocurrencia;
    }

    public void SetFechaocurrencia(Date fechaocurrencia) {
        this.fechaocurrencia = fechaocurrencia;
    }

    public Date GetFechareigstro() {
        return fechareigstro;
    }

    public void SetFechareigstro(Date fechareigstro) {
        this.fechareigstro = fechareigstro;
    }

    public String GetLugarocurrencia() {
        return lugarocurrencia;
    }

    public void SetLugarocurrencia(String lugarocurrencia) {
        this.lugarocurrencia = lugarocurrencia;
    }

    public String GetCiudad() {
        return ciudad;
    }

    public void SetCiudad(String ciudad) {
        this.ciudad = this.ciudad;
    }

    public String GetEstado() {
        return estado;
    }

    public void SetEstado(String estado) {
        this.estado = estado;
    }

    public String GetAutoridad() {
        return autoridad;
    }

    public void SetAutoridad(String autoridad) {
        this.autoridad = autoridad;
    }

    public String GetDescripsiniestro() {
        return descripsiniestro;
    }

    public void SetDescripsiniestro(String descripsiniestro) {
        this.descripsiniestro = descripsiniestro;
    }

    public String GetCeduladecla() {
        return ceduladecla;
    }

    public void SetCeduladecla(String ceduladecla) {
        this.ceduladecla = ceduladecla;
    }

    public String GetNombredecla() {
        return nombredecla;
    }

    public void SetNombredecla(String nombredecla) {
        this.nombredecla = nombredecla;
    }

    public String GetApellidodecla() {
        return apellidodecla;
    }

    public void SetApellidodecla(String apellidodecla) {
        this.apellidodecla = apellidodecla;
    }

    public String GetTlfdecla() {
        return tlfdecla;
    }

    public void SetTlfdecla(String tlfdecla) {
        this.tlfdecla = tlfdecla;
    }

    public String GetRelaciondecla() {
        return relaciondecla;
    }

    public void SetRelaciondecla(String relaciondecla) {
        this.relaciondecla = relaciondecla;
    }

    public String GetCedulacli() {
        return cedulacli;
    }

    public void SetCedulacli(String cedulacli) {
        this.cedulacli = cedulacli;
    }

    public String GetNombrecli() {
        return nombrecli;
    }

    public void SetNombrecli(String nombrecli) {
        this.nombrecli = nombrecli;
    }

    public String GetApellidoCli() {
        return apellidocli;
    }

    public void SetApellidoCli(String apellidocli) {
        this.apellidocli = apellidocli;
    }



    public String GetPlacacli() {
        return placacli;
    }

    public void SetPlacacli(String placacli) {
        this.placacli = placacli;
    }

    public String GetMarcacli() {
        return marcacli;
    }

    public void SetMarcacli(String marcacli) {
        this.marcacli = marcacli;
    }

    public String GetModelocli() {
        return modelocli;
    }

    public void SetModelocli(String modelocli) {
        this.modelocli = modelocli;
    }

    public String GetSerialcarrcli() {
        return serialcarrcli;
    }

    public void SetSerialcarrcli(String serialcarrcli) {
        this.serialcarrcli = serialcarrcli;
    }

    public String GetAnocli() {
        return anocli;
    }

    public void SetAnocli(String anocli) {
        this.anocli = anocli;
    }

    public String GetColorcli() {
        return colorcli;
    }

    public void SetColorcli(String colorcli) {
        this.colorcli = colorcli;
    }

    public String GetDanoscli() {
        return danoscli;
    }

    public void SetDanoscli(String danoscli) {
        this.danoscli = danoscli;
    }

    public String GetPlacacontra() {
        return placacontra;
    }

    public void SetPlacacontra(String placacontra) {
        this.placacontra = placacontra;
    }

    public String GetMarcacontra() {
        return marcacontra;
    }

    public void SetMarcacontra(String marcacontra) {
        this.marcacontra = marcacontra;
    }

    public String GetModelocontra() {
        return modelocontra;
    }

    public void SetModelocontra(String modelocontra) {
        this.modelocontra = modelocontra;
    }

    public String GetSerialcarrcontra() {
        return serialcarrcontra;
    }

    public void SetSerialcarrcontra(String serialcarrcontra) {
        this.serialcarrcontra = serialcarrcontra;
    }

    public String GetAnocontra() {
        return anocontra;
    }

    public void SetAnocontra(String anocontra) {
        this.anocontra = anocontra;
    }

    public String GetColorcontra() {
        return colorcontra;
    }

    public void SetColorcontra(String colorcontra) {
        this.colorcontra = colorcontra;
    }

    public String GetDanoscontra() {
        return danoscontra;
    }

    public void SetDanoscontra(String danoscontra) {
        this.danoscontra = danoscontra;
    }

    public String GetCodigoana() {
        return codigoana;
    }

    public void SetCodigoana(String codigoana) {
        this.codigoana = codigoana;
    }

    public String GetNombreana() {
        return nombreana;
    }

    public void SetNombreana(String nombreana) {
        this.nombreana = nombreana;
    }

    public String getStatus() {
        return status;
    }
    
}


