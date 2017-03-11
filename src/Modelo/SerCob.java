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
public class SerCob {
    private            
           String codigo;
           String codigoser;
           String codigocob;
           String nombre;
           String precio;

    public SerCob(String codigo, String codigoser, String codigocob, String nombre, String precio) {
        this.codigo = codigo;
        this.codigoser = codigoser;
        this.codigocob = codigocob;
        this.nombre = nombre;
        this.precio = precio;
    }
    public SerCob(){
        this.codigo = "";
        this.codigoser = "";
        this.codigocob = "";
        this.nombre = "";
        this.precio = "";
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoser() {
        return codigoser;
    }

    public void setCodigoser(String codigoser) {
        this.codigoser = codigoser;
    }

    public String getCodigocob() {
        return codigocob;
    }

    public void setCodigocob(String codigocob) {
        this.codigocob = codigocob;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
           
   
}
