/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import DAO.DaoLogin;
import Vista.VentanaConsultarUsuario;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author jesus
 */
public class ControladorConsultarUsuario{
    private VentanaConsultarUsuario usuario;
    
    ControladorConsultarUsuario() throws SQLException{
        usuario = new VentanaConsultarUsuario();
        usuario.setVisible(true);
        CargarGridUsuario();
    }
    private void CargarGridUsuario() throws SQLException{
    Integer Fila =0;
        ResultSet regis;
        DaoLogin daoUsu = new DaoLogin();
        regis = daoUsu.ConsultarLogin();
        if (regis.next()){
            do{
               usuario.getjTableUsuarios().setValueAt(regis.getString("usuario"), Fila, 0);
               usuario.getjTableUsuarios().setValueAt(regis.getString("contraseña"), Fila, 1);
               usuario.getjTableUsuarios().setValueAt(regis.getString("roll"), Fila, 2);
               Fila++;
              }while(regis.next());
        }
    }
}
