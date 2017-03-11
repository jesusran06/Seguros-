package Modelo;

public class Analista 
{
    private
    String codigoana;
    String cedulaana;
    String nombreana;
    String apellidoana;
    String tlfana;
    String direc;
    String email;
    String statusa;

    public Analista(String codigoana, String cedulaana, String nombreana, 
            String apellidoana,String tlfana, String direc, String email, String status) 
    {
        this.cedulaana = cedulaana;
        this.codigoana = codigoana;
        this.nombreana = nombreana;
        this.apellidoana = apellidoana;
        this.tlfana= tlfana;
        this.statusa= status;
        this.direc=direc;
        this.email=email;
        
    }
   
//-------------------------------------------------------    
    public Analista()
    {
        this.cedulaana="";
        this.codigoana="";
        this.nombreana="";
        this.apellidoana="";
        this.tlfana="";
        this.statusa="";
        this.email="";
        this.direc="";
       
    }            

    public String GetCedulaana() {
        return cedulaana;
    }

    public void SetCedulaana(String cedulaana) {
        this.cedulaana = cedulaana;
    }

    public String GetCodigoana() {
        return codigoana;
    }

    public void SetCodigoana(String codigoana) {
        this.codigoana = codigoana;
    }
    
    

    public String GetNombreana() {
        return nombreana;
    }

    public void SetNombreana(String nombreana) {
        this.nombreana = nombreana;
    }

    public String GetApellidoana() {
        return apellidoana;
    }

    public void SetApellidoana(String apellidoana) {
        this.apellidoana = apellidoana;
    }

    public String GetTlfana() {
        return tlfana;
    }

    public void SetTlfana(String tlfana) {
        this.tlfana = tlfana;
    }

    public String GetStatusa() {
        return statusa;
    }

    public void SetStatusa(String statusa) {
        this.statusa = statusa;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}
