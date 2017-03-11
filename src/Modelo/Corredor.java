/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jesus
 */
public class Corredor {
    
    private
    String codigocorr;
    String cedulacorr;
    String nombrecorr;
    String apellidocorr;
    String tlfcorr;
    String direccioncorr;
    String emailcorr;
    String status;

    public Corredor(String codigocorr, String nombrecorr, String tlfcorr, String apellidocorr, 
                    String cedulacorr, String emailcorr, String direccioncorr, String status) 
    {
        this.codigocorr = codigocorr;
        this.cedulacorr = cedulacorr;
        this.nombrecorr = nombrecorr;
        this.apellidocorr = apellidocorr;
        this.tlfcorr= tlfcorr;
        this.status= status;
        this.emailcorr = emailcorr;
        this.direccioncorr = direccioncorr;
        
    }

    public Corredor() {
        this.codigocorr = "";
        this.cedulacorr = "";
        this.nombrecorr = "";
        this.apellidocorr = "";
        this.tlfcorr= "";
        this.status= "";
        this.emailcorr = "";
        this.direccioncorr = "";
    }
    
    public String getCodigocorr() {
        return codigocorr;
    }

    public void setCodigocorr(String codigocorr) {
        this.codigocorr = codigocorr;
    }

    public String getCedulacorr() {
        return cedulacorr;
    }

    public void setCedulacorr(String cedulacorr) {
        this.cedulacorr = cedulacorr;
    }

    public String getNombrecorr() {
        return nombrecorr;
    }

    public void setNombrecorr(String nombrecorr) {
        this.nombrecorr = nombrecorr;
    }

    public String getApellidocorr() {
        return apellidocorr;
    }

    public void setApellidocorr(String apellidocorr) {
        this.apellidocorr = apellidocorr;
    }

    public String getTlfcorr() {
        return tlfcorr;
    }

    public void setTlfcorr(String tlfcorr) {
        this.tlfcorr = tlfcorr;
    }

    public String getDireccioncorr() {
        return direccioncorr;
    }

    public void setDireccioncorr(String direccioncorr) {
        this.direccioncorr = direccioncorr;
    }

    public String getEmailcorr() {
        return emailcorr;
    }

    public void setEmailcorr(String emailcorr) {
        this.emailcorr = emailcorr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
