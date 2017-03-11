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
public class Marca {
    
    private
    String nombre;
    String status;

    public Marca(String nombre, String status) 
    {
        this.nombre = nombre;
        this.status= status;
    }
    
    public Marca()
    {
       super(); //Asi inicializa todo
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
