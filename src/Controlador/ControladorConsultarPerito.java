/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import DAO.DaoPerito;
import Vista.VentanaConsultarPerito;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author jesus
 */
public class ControladorConsultarPerito {
    private VentanaConsultarPerito perito;
    
    ControladorConsultarPerito() throws SQLException{
        perito = new VentanaConsultarPerito();
        perito.setVisible(true);
        CargarGridPerito();
    }
    private void CargarGridPerito() throws SQLException{
        Integer Fila =0;
        ResultSet regis;
        DaoPerito daoPer = new DaoPerito();
        regis = daoPer.ConsultarPerito();
        if (regis.next()){
            do{
               perito.getjTablePerito().setValueAt(regis.getString("codigo"), Fila, 0);
               perito.getjTablePerito().setValueAt(regis.getString("cedula"), Fila, 1);
               perito.getjTablePerito().setValueAt(regis.getString("nombre"), Fila, 2);
               perito.getjTablePerito().setValueAt(regis.getString("apellido"), Fila, 3);
               perito.getjTablePerito().setValueAt(regis.getString("telefono"), Fila, 4);
               perito.getjTablePerito().setValueAt(regis.getString("direccion"), Fila, 5);
               perito.getjTablePerito().setValueAt(regis.getString("email"), Fila, 6);
               Fila++;
              }while(regis.next());
        }
    }
}
