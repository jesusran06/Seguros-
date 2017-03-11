
package Modelo;

/**
 *
 * @author Indrina Meza
 */
public class InformeSiniestro {
    private
        String codigo;
        String codigosiniestro;
        String cedulacli;
        String nombrecli;
        String apellidocli;
        String cedulape;
        String nombrepe;
        String apellidope;
        String placa;
        String marca;
        String modelo;
        String ano;
        String scarroceria;
        String detalles;
        Float monto;
        String status;
    
    public  InformeSiniestro(String codigo,String codigosiniestro, 
            String cedculacli, String nombrecli, String apellidocli,
            String cedculape, String nombrepe, String apellidope,
            String placa, String marca, String modelo, String ano,
            String scarroceria, String detalles, Float monto, String status) 
    {   this.codigo = codigo;
        this.codigosiniestro = codigosiniestro;
        this.cedulacli = cedulacli;
        this.nombrecli = nombrecli;
        this.apellidocli =apellidocli;
        this.cedulape = cedulape;
        this.nombrepe = nombrepe;
        this.apellidope =apellidope;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.scarroceria = scarroceria;
        this.detalles = detalles;
        this.monto=monto;
        this.status= status;   
    }
   
    public InformeSiniestro()
    {   this.codigo="";
        this.codigosiniestro = "";
        this.cedulacli = "";
        this.nombrecli = "";
        this.apellidocli ="";
        this.cedulape = "";
        this.nombrepe = "";
        this.apellidope ="";
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.ano = "";
        this.scarroceria = "";
        this.detalles = "";
        this.monto=0.0f; 
        this.status="";
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigosiniestro() {
        return codigosiniestro;
    }

    public void setCodigosiniestro(String codigosiniestro) {
        this.codigosiniestro = codigosiniestro;
    }

    public String getCedulacli() {
        return cedulacli;
    }

    public void setCedulacli(String cedulacli) {
        this.cedulacli = cedulacli;
    }

    public String getNombrecli() {
        return nombrecli;
    }

    public void setNombrecli(String nombrecli) {
        this.nombrecli = nombrecli;
    }

    public String getApellidocli() {
        return apellidocli;
    }

    public void setApellidocli(String apellidocli) {
        this.apellidocli = apellidocli;
    }

    public String getCedulape() {
        return cedulape;
    }

    public String getNombrepe() {
        return nombrepe;
    }

    public String getApellidope() {
        return apellidope;
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getScarroceria() {
        return scarroceria;
    }

    public void setScarroceria(String scarroceria) {
        this.scarroceria = scarroceria;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
