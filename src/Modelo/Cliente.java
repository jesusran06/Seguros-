package Modelo;

import java.util.Date;

public class Cliente 
{
    private
    String cedulacli;
    String nombrecli;
    String apellidocli;
    String tlfcli;
    String direccion;
    String email;
    String status;

    public Cliente(String cedulacli,String nombrecli, String apellidocli, 
                   String tlfcli, String direccion, String email, String status) 
    {
        this.cedulacli = cedulacli;
        this.nombrecli = nombrecli;
        this.apellidocli = apellidocli;
        this.tlfcli= tlfcli;
        this.status= status;
        this.direccion = direccion;
        this.email = email;
        
    }
   
//-------------------------------------------------------    
    public Cliente()
    {
        this.cedulacli="";
        this.nombrecli="";
        this.apellidocli="";
        this.tlfcli="";
        this.direccion="";        
        this.email="";
        this.status="";
    }            

    public void SetCedulacli(String cedulacli) {
        this.cedulacli = cedulacli;
    }

    public void SetNombrecli(String nombrecli) {
        this.nombrecli = nombrecli;
    }

    public void SetApellidocli(String apellidocli) {
        this.apellidocli = apellidocli;
    }

    public void SetTlfcli(String tlfcli) {
        this.tlfcli = tlfcli;
    }

    public void SetStatus(String status) {
        this.status = status;
    }

    public String GetCedulacli() {
        return cedulacli;
    }

    public String GetNombrecli() {
        return nombrecli;
    }

    public String GetApellidocli() {
        return apellidocli;
    }

    public String GetTlfcli() {
        return tlfcli;
    }

    public String GetStatus() {
        return status;
    }

    public String GetDireccion() {
        return direccion;
    }

    public void SetDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String GetEmail() {
        return email;
    }

    public void SetEmail(String email) {
        this.email = email;
    } 
}
