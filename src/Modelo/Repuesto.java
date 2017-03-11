
package Modelo;

/**
 *
 * @author Indrina Meza
 */
public class Repuesto {
    private
        String codigo;
        String nombre;
        float precio;
        String status;
    
        public  Repuesto(String codigo,String nombre, 
                   float precio, String status) 
    {   this.codigo = codigo;
        this.nombre = nombre;
        this.precio=precio;
        this.status= status;   
    }
   
    public Repuesto()
    {   this.codigo="";
        this.nombre="";
        this.precio=0;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
