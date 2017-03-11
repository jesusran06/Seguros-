/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.TipoPoliza;
import DAO.DaoTipoPoliza;
import Modelo.Validaciones;
import Vista.Gestiontipopoliza;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jesus
 */
public class ControladorTipoPoliza implements ActionListener,KeyListener{
    private Gestiontipopoliza tipo;
    private Boolean Existe=false;
    
    public ControladorTipoPoliza(){
        tipo = new Gestiontipopoliza();
        
    }
    
}
