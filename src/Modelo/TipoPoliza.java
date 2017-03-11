
package Modelo;

public class TipoPoliza {
    private
            String nombTip;
            String codTip;
            String restTip;
            String porctip;
            String codcob;
            String Status;
public TipoPoliza(String nombtip,String codtip, String resttip,String porctip, String codcob, String status){
    this.nombTip=nombtip;
    this.codTip=codtip;
    this.restTip=resttip;
    this.porctip=porctip;
    this.codcob=codcob;
    this.Status=status;
}
public TipoPoliza(){
    this.nombTip="";
    this.codTip="";
    this.restTip="";
    this.porctip="";
    this.codcob="";
    this.Status="";
            }

    public String getNombTip() {
        return nombTip;
    }

    public String getCodcob() {
        return codcob;
    }

    public void setCodcob(String codcob) {
        this.codcob = codcob;
    }

    public void setNombTip(String nombTip) {
        this.nombTip = nombTip;
    }

    public String getCodTip() {
        return codTip;
    }

    public void setCodTip(String codTip) {
        this.codTip = codTip;
    }

    public String getRestTip() {
        return restTip;
    }

    public void setRestTip(String restTip) {
        this.restTip = restTip;
    }

    public String getPorctip() {
        return porctip;
    }

    public void setPorctip(String porctip) {
        this.porctip = porctip;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

}
