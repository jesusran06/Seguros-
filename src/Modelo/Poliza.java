
package Modelo;
public class Poliza {
    private
            String codPol;
            String fechainiPol;
            String fechafinPol;
            String status;
public Poliza(String codpol, String fechainipol, String fechafinpol, String status){
    this.codPol=codpol;
    this.fechafinPol=fechafinpol;
    this.fechainiPol=fechainipol;
    this.status=status;
}
public Poliza(){
    this.codPol="";
    this.fechafinPol="";
    this.fechainiPol="";
    this.status="";
}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodPol() {
        return codPol;
    }

    public void setCodPol(String codPol) {
        this.codPol = codPol;
    }

    public String getFechainiPol() {
        return fechainiPol;
    }

    public void setFechainiPol(String fechainiPol) {
        this.fechainiPol = fechainiPol;
    }

    public String getFechafinPol() {
        return fechafinPol;
    }

    public void setFechafinPol(String fechafinPol) {
        this.fechafinPol = fechafinPol;
    }

}
