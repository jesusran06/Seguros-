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
public class Login {
    private
            String usuario;
            String contraseña;
            String roll;
            String status;

    public Login(String usuario, String contraseña, String roll, String status) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.roll = roll;
        this.status = status;
    }
    public Login()
    {
        this.usuario="";
        this.contraseña="";
        this.roll="";
        this.status="";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
