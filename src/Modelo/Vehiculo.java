
package Modelo;

public class Vehiculo {
    private
    String placa;
    String marca;
    String modelo;
    String serialcarr;
    String ano;
    String color;
    String status;
    String descripcion;
    String tipoveh;
    Float precioveh;
   

    public Vehiculo(String placa,String marca, String modelo, 
                   String serialcarr,String ano, String color,
                   String descripcion,String tipoveh, Float precioveh,
                   String status) 
    {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.serialcarr= serialcarr;
        this.ano = ano;
        this.color = color;
        this.descripcion=descripcion;
        this.tipoveh=tipoveh;
        this.precioveh=precioveh;
        this.status= status;
    }
   
//-------------------------------------------------------    
    public Vehiculo()
    {
       super(); //Asi inicializa todo
    }            
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerialcarr() {
        return serialcarr;
    }

    public void setSerialcarr(String serialcarr) {
        this.serialcarr = serialcarr;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoveh() {
        return tipoveh;
    }

    public void setTipoveh(String tipoveh) {
        this.tipoveh = tipoveh;
    }

    public double getPrecioveh() {
        return precioveh;
    }

    public void setPrecioveh(Float precioveh) {
        this.precioveh = precioveh;
    }
    
}


