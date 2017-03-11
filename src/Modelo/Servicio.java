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
public class Servicio {
    private
    String nombSer;
     String codSer;
    String descSer;
    String costSer;
    String Status;
public Servicio(String codser, String nombser, String descser, String costser, String status){
    this.nombSer=nombser;
    this.codSer=codser;
    this.descSer=descser;
    this.costSer=costser;
    this.Status=status;
}
    public Servicio(){
        this.nombSer = "";
        this.codSer = "";
        this.descSer = "";
        this.costSer = "";
        this.Status = "";
    }
    public String getNombSer() {
        return nombSer;
    }

    public void setNombSer(String nombSer) {
        this.nombSer = nombSer;
    }

    public String getCodSer() {
        return codSer;
    }

    public void setCodSer(String codSer) {
        this.codSer = codSer;
    }

    public String getDescSer() {
        return descSer;
    }

    public void setDescSer(String descSer) {
        this.descSer = descSer;
    }

    public String getCostSer() {
        return costSer;
    }

    public void setCostSer(String costSer) {
        this.costSer = costSer;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
   
}
