/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.VentanaConsultarServicios;
import DAO.DaoServicio;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author jesus
 */
public class ControladorConsultarServicio {
    private VentanaConsultarServicios servicios;
    ControladorConsultarServicio() throws SQLException{
        servicios = new VentanaConsultarServicios();
        servicios.setVisible(true);
        CargarGridServicios();
    }
    
    private void CargarGridServicios() throws SQLException{
        Integer Fila =0;
        ResultSet regis;
        DaoServicio daoSer = new DaoServicio();
        regis = daoSer.ConsultarServicio();
        if (regis.next()){
            do{
               servicios.getjTableServicios().setValueAt(regis.getString("codser"), Fila, 0);
               servicios.getjTableServicios().setValueAt(regis.getString("nombser"), Fila, 1);
               servicios.getjTableServicios().setValueAt(regis.getString("costser"), Fila, 2);
               servicios.getjTableServicios().setValueAt(regis.getString("descser"), Fila, 3);
               Fila++;
              }while(regis.next());
        }
    }
       
}
