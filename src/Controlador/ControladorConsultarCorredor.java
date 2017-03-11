
package Controlador;
import Vista.VentanaConsultarCorredor;
import DAO.DaoCorredor;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ControladorConsultarCorredor 
{
    private VentanaConsultarCorredor corredor;
    
    ControladorConsultarCorredor() throws SQLException
    {
        corredor = new VentanaConsultarCorredor();
        corredor.setVisible(true);
        CargarGridCorredor();
    }
    
    private void CargarGridCorredor() throws SQLException{
        Integer Fila =0;
        ResultSet regis;
        DaoCorredor daoCor = new DaoCorredor();
        regis = daoCor.ConsultarCorredor();
        if (regis.next()){
            do{
               corredor.getjTableCorredor().setValueAt(regis.getString("codcorr"), Fila, 0);
               corredor.getjTableCorredor().setValueAt(regis.getString("cedcorr"), Fila, 1);
               corredor.getjTableCorredor().setValueAt(regis.getString("nomcorr"), Fila, 2);
               corredor.getjTableCorredor().setValueAt(regis.getString("apellcorr"), Fila, 3);
               corredor.getjTableCorredor().setValueAt(regis.getString("telecorr"), Fila, 4);
               corredor.getjTableCorredor().setValueAt(regis.getString("direcorr"), Fila, 5);
               corredor.getjTableCorredor().setValueAt(regis.getString("correocorr"), Fila, 6);
               Fila++;
              }while(regis.next());
        }
    }
}
