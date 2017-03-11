/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.VentanaConsultarAnalistas;
import DAO.DaoAnalista;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author jesus
 */
public class ControladorConsultarAnalista {
    private VentanaConsultarAnalistas analista;
    
    ControladorConsultarAnalista() throws SQLException
    {
        analista = new VentanaConsultarAnalistas();
        analista.setVisible(true);
        CargarGridAnalista();
    }
    
    private void CargarGridAnalista() throws SQLException{
        Integer Fila =0;
        ResultSet regis;
        DaoAnalista daoCor = new DaoAnalista();
        regis = daoCor.ConsultarAnalista();
        if (regis.next()){
            do{
               analista.getjTableAnalista().setValueAt(regis.getString("codigoana"), Fila, 0);
               analista.getjTableAnalista().setValueAt(regis.getString("cedula"), Fila, 1);
               analista.getjTableAnalista().setValueAt(regis.getString("nombre"), Fila, 2);
               analista.getjTableAnalista().setValueAt(regis.getString("apellido"), Fila, 3);
               analista.getjTableAnalista().setValueAt(regis.getString("telefono"), Fila, 4);
               analista.getjTableAnalista().setValueAt(regis.getString("direccion"), Fila, 5);
               analista.getjTableAnalista().setValueAt(regis.getString("correo"), Fila, 6);
               Fila++;
              }while(regis.next());
        }
    }
    
}
