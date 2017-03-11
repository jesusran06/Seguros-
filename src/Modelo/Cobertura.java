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
public class Cobertura {
    private
            String CodCober;
            String Staus;
            String Costo;

    
public Cobertura(String codcob, String Costo, String status){
    this.CodCober=codcob;
    this.Staus = status;
    this.Costo = Costo;
}
public Cobertura(){
    this.CodCober="";
    this.Costo="";
}

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }

    public String getCodCober() {
        return CodCober;
    }

    public void setCodCober(String CodCober) {
        this.CodCober = CodCober;
    }
    public String getStaus() {
        return Staus;
    }

    public void setStaus(String Staus) {
        this.Staus = Staus;
    }
}
