/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Indrina Meza
 */
public class RepaRepu {
    private
        String codigo;
        String codrepa;
        String codrepu;
        String nombrerepu;
        Float preciorepu;
    
    public  RepaRepu(String codigo,String codrepa, String codrepu,String nombrerepu, Float preciorepu) 
    {   this.codigo = codigo;
        this.codrepa = codrepa;
        this.codrepu = codrepu; 
        this.nombrerepu = nombrerepu;
        this.preciorepu = preciorepu;
    }
   
    public RepaRepu()
    {   this.codigo="";
        this.codrepa="";
        this.codrepu="";
        this.nombrerepu="";
        this.preciorepu=0.0f;
    } 

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodrepa() {
        return codrepa;
    }

    public void setCodrepa(String codrepa) {
        this.codrepa = codrepa;
    }

    public String getCodrepu() {
        return codrepu;
    }

    public void setCodrepu(String codrepu) {
        this.codrepu = codrepu;
    }

    public String getNombrerepu() {
        return nombrerepu;
    }

    public void setNombrerepu(String nombrerepu) {
        this.nombrerepu = nombrerepu;
    }

    public Float getPreciorepu() {
        return preciorepu;
    }

    public void setPreciorepu(Float preciorepu) {
        this.preciorepu = preciorepu;
    }
    
    
    
}
