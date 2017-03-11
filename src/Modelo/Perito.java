package Modelo;



import java.util.Date;

public class Perito 
{
    private
    String codigo;
    String cedula;
    String nombre;
    String apellido;
    String tlf;
    String status;
    String direccion;
    String email;

    public Perito(String codigo,String cedula,String nombre, String apellido, 
                   String tlf, String direccion, String email, String status) 
    {   this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tlf= tlf;
        this.status= status;
        this.direccion = direccion;
        this.email = email;
        
    }
   
//-------------------------------------------------------    
    public Perito()
    {   this.codigo="";
        this.cedula="";
        this.nombre="";
        this.apellido="";
        this.tlf="";
        this.status="";
        this.direccion="";        
        this.email="";
    } 

  

    public String GetCodigo() {
        return codigo;
    }

    public void SetCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String GetCedula() {
        return cedula;
    }

    public void SetCedula(String cedula) {
        this.cedula = cedula;
    }

    public String GetNombre() {
        return nombre;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String GetApellido() {
        return apellido;
    }

    public void SetApellido(String apellido) {
        this.apellido = apellido;
    }

    public String GetTlf() {
        return tlf;
    }

    public void SetTlf(String tlf) {
        this.tlf = tlf;
    }

    public String GetStatus() {
        return status;
    }

    public void SetStatus(String status) {
        this.status = status;
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
