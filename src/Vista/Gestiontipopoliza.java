/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author jesus
 */
public class Gestiontipopoliza extends javax.swing.JFrame {

    /**
     * Creates new form Gestiontipopoliza
     */
    public Gestiontipopoliza() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        butguardartipo = new javax.swing.JButton();
        buteliminartipo = new javax.swing.JButton();
        butconsultartipo = new javax.swing.JButton();
        butsalirtipo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        butbuscartipo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtexcodtipo = new javax.swing.JTextField();
        jtexnomtipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtexporctipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtCob = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(840, 410));
        setMinimumSize(new java.awt.Dimension(840, 410));
        setPreferredSize(new java.awt.Dimension(858, 437));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Gestión de Tipos de Póliza");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 30, 244, 22);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        butguardartipo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        butguardartipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/guardar.png"))); // NOI18N
        butguardartipo.setText("Guardar");
        butguardartipo.setBorder(null);
        butguardartipo.setBorderPainted(false);
        butguardartipo.setContentAreaFilled(false);
        butguardartipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butguardartipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butguardartipo.setIconTextGap(-3);
        butguardartipo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Guardarpeque.png"))); // NOI18N
        butguardartipo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Buscargran.png"))); // NOI18N
        butguardartipo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        butguardartipo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(butguardartipo);
        butguardartipo.setBounds(28, 11, 61, 71);

        buteliminartipo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        buteliminartipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Eliminar.png"))); // NOI18N
        buteliminartipo.setText("eliminar");
        buteliminartipo.setBorder(null);
        buteliminartipo.setBorderPainted(false);
        buteliminartipo.setContentAreaFilled(false);
        buteliminartipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buteliminartipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buteliminartipo.setIconTextGap(-3);
        buteliminartipo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/eliminarchiquito.png"))); // NOI18N
        buteliminartipo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/eliminargrande.png"))); // NOI18N
        buteliminartipo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buteliminartipo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(buteliminartipo);
        buteliminartipo.setBounds(133, 11, 61, 71);

        butconsultartipo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        butconsultartipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Consultar.png"))); // NOI18N
        butconsultartipo.setText("Consultar");
        butconsultartipo.setActionCommand("consultar");
        butconsultartipo.setBorder(null);
        butconsultartipo.setBorderPainted(false);
        butconsultartipo.setContentAreaFilled(false);
        butconsultartipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butconsultartipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butconsultartipo.setIconTextGap(-3);
        butconsultartipo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Consultarpeque.png"))); // NOI18N
        butconsultartipo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/consultargrand.png"))); // NOI18N
        butconsultartipo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        butconsultartipo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(butconsultartipo);
        butconsultartipo.setBounds(310, 10, 61, 71);

        butsalirtipo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        butsalirtipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Salir.png"))); // NOI18N
        butsalirtipo.setText("salir");
        butsalirtipo.setBorder(null);
        butsalirtipo.setBorderPainted(false);
        butsalirtipo.setContentAreaFilled(false);
        butsalirtipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butsalirtipo.setDefaultCapable(false);
        butsalirtipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butsalirtipo.setIconTextGap(-3);
        butsalirtipo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Salirpeque.png"))); // NOI18N
        butsalirtipo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Salirgrande.png"))); // NOI18N
        butsalirtipo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        butsalirtipo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(butsalirtipo);
        butsalirtipo.setBounds(400, 10, 61, 71);

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setIconTextGap(-3);
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Modificarpeque.png"))); // NOI18N
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/MoificarGrande.png"))); // NOI18N
        btnModificar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btnModificar);
        btnModificar.setBounds(210, 20, 79, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 70, 480, 90);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        butbuscartipo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        butbuscartipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Buscar.png"))); // NOI18N
        butbuscartipo.setText("buscar");
        butbuscartipo.setBorder(null);
        butbuscartipo.setBorderPainted(false);
        butbuscartipo.setContentAreaFilled(false);
        butbuscartipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butbuscartipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butbuscartipo.setIconTextGap(-3);
        butbuscartipo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Buscarpeque.png"))); // NOI18N
        butbuscartipo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Buscargrande.png"))); // NOI18N
        butbuscartipo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        butbuscartipo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(butbuscartipo);
        butbuscartipo.setBounds(352, 31, 61, 71);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Código");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(196, 59, 50, 23);

        jtexcodtipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jtexcodtipo);
        jtexcodtipo.setBounds(256, 59, 86, 23);

        jtexnomtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtexnomtipoActionPerformed(evt);
            }
        });
        jPanel2.add(jtexnomtipo);
        jtexnomtipo.setBounds(648, 59, 138, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del Tipo de Póliza");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(456, 60, 182, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Porcentaje de Cobertura");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(82, 128, 173, 17);

        jtexporctipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jtexporctipo);
        jtexporctipo.setBounds(259, 128, 71, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Años de diferencia aceptables");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(33, 235, 213, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("A partir de");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(560, 130, 90, 17);

        jTxtCob.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jTxtCob);
        jTxtCob.setBounds(648, 128, 138, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-40, 160, 810, 210);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Fondo Grande.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 890, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtexnomtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtexnomtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtexnomtipoActionPerformed

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getButbuscartipo() {
        return butbuscartipo;
    }

    public JButton getButconsultartipo() {
        return butconsultartipo;
    }

    public JButton getButeliminartipo() {
        return buteliminartipo;
    }

    public JButton getButguardartipo() {
        return butguardartipo;
    }

    public JButton getButsalirtipo() {
        return butsalirtipo;
    }

    public JTextField getjTxtCob() {
        return jTxtCob;
    }

    public JTextField getJtexcodtipo() {
        return jtexcodtipo;
    }

    public JTextField getJtexnomtipo() {
        return jtexnomtipo;
    }

    public JTextField getJtexporctipo() {
        return jtexporctipo;
    }

    public void agregarListener(ActionListener accion) 
    {
        this.btnModificar.addActionListener(accion);
        this.butbuscartipo.addActionListener(accion);
        this.butconsultartipo.addActionListener(accion);
        this.buteliminartipo.addActionListener(accion);
        this.butguardartipo.addActionListener(accion);
        this.butsalirtipo.addActionListener(accion);
    }
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
            java.util.logging.Logger.getLogger(Gestiontipopoliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestiontipopoliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestiontipopoliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestiontipopoliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestiontipopoliza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton butbuscartipo;
    public javax.swing.JButton butconsultartipo;
    public javax.swing.JButton buteliminartipo;
    public javax.swing.JButton butguardartipo;
    public javax.swing.JButton butsalirtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField jTxtCob;
    public javax.swing.JTextField jtexcodtipo;
    public javax.swing.JTextField jtexnomtipo;
    public javax.swing.JTextField jtexporctipo;
    // End of variables declaration//GEN-END:variables
}
