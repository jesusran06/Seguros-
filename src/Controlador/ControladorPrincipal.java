package Controlador;

import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Vista.GestionLogin;
import Modelo.Login; 

public class ControladorPrincipal implements ActionListener
{
    private VentanaPrincipal Principal;    
    private GestionLogin log;
    private Login login;
    ControladorPrincipal() 
    {
      Principal =new VentanaPrincipal();
      Principal.agregarListener(this);
      Principal.setVisible(true);
      Principal.setSize(632,560);
      Principal.setLocationRelativeTo(null);
      
    }
    
    //------------------------------
    // Opciones del Menu Principal
    //-----------------------------
        
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource().equals(Principal.getjMenuItemCliente()))   
       {
         new ControladorCliente();    
       }   
       if (e.getSource().equals(Principal.jMenuServicio))
       {
           new ControladorServicio();
       }
       if (e.getSource().equals(Principal.getjMenuItemSiniestro()))   
       {
           try {    
               new ControladorDeclaracionSiniestro();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
      
       if (e.getSource().equals(Principal.getjMenuItemReporteSiniestros()))   
       {
         new ControladorReporteSiniestros();    
       }
       
       if (e.getSource().equals(Principal.getjMenuItemVehiculo()))   
       {
           try {    
               new ControladorVehiculo();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       if (e.getSource().equals(Principal.getjMenuItemAnalista()))
       {
           new ControladorAnalista();
       }
       
       if (e.getSource().equals(Principal.getjMenuItemCorredor()))   
       {
         new ControladorCorredor();    
       }
       
        if (e.getSource().equals(Principal.getjMenuItemPerito()))   
       {
         new ControladorPerito();    
       }
        
         if (e.getSource().equals(Principal.getjMenuItemInformeSiniestro()))   
       {
           try {    
               new ControladorInformeSiniestro();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
         
         if (e.getSource().equals(Principal.getjMenuItemReparacion()))   
       {
           try {    
               new ControladorReparacion();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
         if (e.getSource().equals(Principal.getjMenuItemRepuesto()))   
       {
          
           try {
               new ControladorRepuesto();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
         if (e.getSource().equals(Principal.getjMenuItemUsuario())){
             new ControladorUsuario();
         }
         if (e.getSource().equals(Principal.getJbtnsalir())){
             Principal.dispose();
             new ControladorLogin();
         }
         if (e.getSource().equals(Principal.getjMenuItemCobertura())){
           try {
               new ControladorCobertura();
           } catch (SQLException ex) {
               Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
         
      
      

    }
}