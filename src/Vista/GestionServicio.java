/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jesus
 */
public class GestionServicio extends javax.swing.JFrame {

    /**
     * Creates new form GestionServicio
     */
    public GestionServicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jtexcodser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buteliminarser = new javax.swing.JButton();
        butsalirser = new javax.swing.JButton();
        butconsultarser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        butguardarser = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texadesc = new javax.swing.JTextArea();
        jtexcostser = new javax.swing.JTextField();
        jtexnomser = new javax.swing.JTextField();
        butmodificarser = new javax.swing.JButton();
        butbuscarser1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(673, 474));
        setMinimumSize(new java.awt.Dimension(673, 474));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Código");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 220, 50, 17);

        jtexcodser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtexcodser.setText("SER-");
        getContentPane().add(jtexcodser);
        jtexcodser.setBounds(110, 220, 100, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Descripción");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 290, 84, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 230, 55, 17);

        buteliminarser.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        buteliminarser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Eliminar.png"))); // NOI18N
        buteliminarser.setText("Eliminar");
        buteliminarser.setBorder(null);
        buteliminarser.setBorderPainted(false);
        buteliminarser.setContentAreaFilled(false);
        buteliminarser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buteliminarser.setIconTextGap(-3);
        buteliminarser.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/eliminarchiquito.png"))); // NOI18N
        buteliminarser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/eliminargrande.png"))); // NOI18N
        buteliminarser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buteliminarser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buteliminarser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buteliminarserActionPerformed(evt);
            }
        });
        getContentPane().add(buteliminarser);
        buteliminarser.setBounds(420, 100, 61, 71);

        butsalirser.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        butsalirser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Salir.png"))); // NOI18N
        butsalirser.setText("Salir");
        butsalirser.setBorder(null);
        butsalirser.setBorderPainted(false);
        butsalirser.setContentAreaFilled(false);
        butsalirser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butsalirser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butsalirser.setIconTextGap(-3);
        butsalirser.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Salirpeque.png"))); // NOI18N
        butsalirser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Salirgrande.png"))); // NOI18N
        butsalirser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        butsalirser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(butsalirser);
        butsalirser.setBounds(530, 100, 61, 71);

        butconsultarser.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        butconsultarser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Consultar.png"))); // NOI18N
        butconsultarser.setText("Consultar");
        butconsultarser.setBorder(null);
        butconsultarser.setBorderPainted(false);
        butconsultarser.setContentAreaFilled(false);
        butconsultarser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butconsultarser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butconsultarser.setIconTextGap(-3);
        butconsultarser.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Consultarpeque.png"))); // NOI18N
        butconsultarser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/consultargrand.png"))); // NOI18N
        butconsultarser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        butconsultarser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(butconsultarser);
        butconsultarser.setBounds(300, 100, 61, 71);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Gestión de Servicio");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 40, 180, 22);

        butguardarser.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        butguardarser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/guardar.png"))); // NOI18N
        butguardarser.setText("Guardar");
        butguardarser.setBorder(null);
        butguardarser.setBorderPainted(false);
        butguardarser.setContentAreaFilled(false);
        butguardarser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butguardarser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butguardarser.setIconTextGap(-3);
        butguardarser.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Guardarpeque.png"))); // NOI18N
        butguardarser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Buscargran.png"))); // NOI18N
        butguardarser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        butguardarser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(butguardarser);
        butguardarser.setBounds(60, 100, 61, 71);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Costo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 300, 41, 17);

        texadesc.setColumns(20);
        texadesc.setLineWrap(true);
        texadesc.setRows(5);
        jScrollPane1.setViewportView(texadesc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 290, 246, 124);

        jtexcostser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtexcostser);
        jtexcostser.setBounds(110, 300, 100, 23);

        jtexnomser.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(jtexnomser);
        jtexnomser.setBounds(380, 230, 254, 20);

        butmodificarser.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        butmodificarser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Modificar.png"))); // NOI18N
        butmodificarser.setText("Modificar");
        butmodificarser.setBorder(null);
        butmodificarser.setBorderPainted(false);
        butmodificarser.setContentAreaFilled(false);
        butmodificarser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butmodificarser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butmodificarser.setIconTextGap(-3);
        butmodificarser.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Modificarpeque.png"))); // NOI18N
        butmodificarser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/MoificarGrande.png"))); // NOI18N
        butmodificarser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        butmodificarser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(butmodificarser);
        butmodificarser.setBounds(170, 100, 79, 70);

        butbuscarser1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        butbuscarser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Buscar.png"))); // NOI18N
        butbuscarser1.setText("Buscar");
        butbuscarser1.setBorder(null);
        butbuscarser1.setBorderPainted(false);
        butbuscarser1.setContentAreaFilled(false);
        butbuscarser1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butbuscarser1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butbuscarser1.setIconTextGap(-3);
        butbuscarser1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Buscarpeque.png"))); // NOI18N
        butbuscarser1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Buscargrande.png"))); // NOI18N
        butbuscarser1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        butbuscarser1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(butbuscarser1);
        butbuscarser1.setBounds(220, 190, 61, 71);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/fondo.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1000, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buteliminarserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buteliminarserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buteliminarserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionServicio().setVisible(true);
            }
        });
    }

    public JButton getButbuscarser1() {
        return butbuscarser1;
    }

    public JButton getButconsultarser() {
        return butconsultarser;
    }

    public JButton getButeliminarser() {
        return buteliminarser;
    }

    public JButton getButguardarser() {
        return butguardarser;
    }

    public JButton getButsalirser() {
        return butsalirser;
    }

    public JTextField getJtexnomser() {
        return jtexnomser;
    }

    public JTextField getJtexcodser() {
        return jtexcodser;
    }

    public JButton getButmodificarser() {
        return butmodificarser;
    }

    public JTextField getJtexcostser() {
        return jtexcostser;
    }

    public JTextArea getTexadesc() {
        return texadesc;
    }
    public void agregarListener(ActionListener accion) 
    {
        this.butbuscarser1.addActionListener(accion);
        this.butconsultarser.addActionListener(accion);
        this.buteliminarser.addActionListener(accion);
        this.butguardarser.addActionListener(accion);
        this.butsalirser.addActionListener(accion);
        this.butmodificarser.addActionListener(accion);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton butbuscarser1;
    public javax.swing.JButton butconsultarser;
    public javax.swing.JButton buteliminarser;
    public javax.swing.JButton butguardarser;
    public javax.swing.JButton butmodificarser;
    public javax.swing.JButton butsalirser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jtexcodser;
    public javax.swing.JTextField jtexcostser;
    public javax.swing.JTextField jtexnomser;
    public javax.swing.JTextArea texadesc;
    // End of variables declaration//GEN-END:variables
}
