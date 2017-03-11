
package Modelo;


public class Reparacion {
    private
        String codigo;
        String nombre;
        String descripcion;
        float costo;
        String status;
    
    public  Reparacion(String codigo,String nombre, String descripcion, 
                   float costo, String status) 
    {   this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo=costo;
        this.status= status;   
    }
   
    public Reparacion()
    {   this.codigo="";
        this.nombre="";
        this.descripcion="";
        this.costo=0;
        this.status="";
        
    } 

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
            
            
    
}
