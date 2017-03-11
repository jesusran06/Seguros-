
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GestionCorredor extends javax.swing.JFrame {

    public GestionCorredor() {
        initComponents();
     
     
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        butmodificarcorr = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTlf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtadirecc = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(585, 500));
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblTitulo.setText("Gestión de Usuario");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(201, 27, 197, 22);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setIconTextGap(-3);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Guardarpeque.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Buscargran.png"))); // NOI18N
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);
        btnGuardar.setBounds(10, 11, 61, 71);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Eliminar.png"))); // NOI18N
        btnCancelar.setText("Eliminar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setIconTextGap(-3);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/eliminarchiquito.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/eliminargrande.png"))); // NOI18N
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(260, 10, 61, 71);

        butmodificarcorr.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        butmodificarcorr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Modificar.png"))); // NOI18N
        butmodificarcorr.setText("Modificar");
        butmodificarcorr.setBorder(null);
        butmodificarcorr.setBorderPainted(false);
        butmodificarcorr.setContentAreaFilled(false);
        butmodificarcorr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butmodificarcorr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butmodificarcorr.setIconTextGap(-3);
        butmodificarcorr.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Modificarpeque.png"))); // NOI18N
        butmodificarcorr.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/MoificarGrande.png"))); // NOI18N
        butmodificarcorr.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        butmodificarcorr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(butmodificarcorr);
        butmodificarcorr.setBounds(90, 10, 79, 70);

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Consultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(null);
        btnConsultar.setBorderPainted(false);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setIconTextGap(-3);
        btnConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Consultarpeque.png"))); // NOI18N
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/consultargrand.png"))); // NOI18N
        btnConsultar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnConsultar);
        btnConsultar.setBounds(180, 20, 61, 61);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setIconTextGap(-3);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Salirpeque.png"))); // NOI18N
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Salirgrande.png"))); // NOI18N
        btnSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnSalir);
        btnSalir.setBounds(340, 10, 61, 71);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 60, 420, 100);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Cédula");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 100, 49, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 82, 55, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Teléfono");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 140, 62, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(256, 123, 57, 17);

        txtCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCedula.setNextFocusableComponent(txtNombre);
        jPanel1.add(txtCedula);
        txtCedula.setBounds(70, 100, 100, 23);

        txtApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtApellido.setNextFocusableComponent(txtTlf);
        jPanel1.add(txtApellido);
        txtApellido.setBounds(319, 120, 146, 23);

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setNextFocusableComponent(txtApellido);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(319, 79, 145, 23);

        txtTlf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTlf.setNextFocusableComponent(txtEmail);
        jPanel1.add(txtTlf);
        txtTlf.setBounds(70, 140, 100, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Dirección");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(248, 160, 67, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("E-mail");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 180, 42, 17);

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setNextFocusableComponent(jtxtadirecc);
        jPanel1.add(txtEmail);
        txtEmail.setBounds(70, 180, 170, 23);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setIconTextGap(-3);
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Buscarpeque.png"))); // NOI18N
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Buscargrande.png"))); // NOI18N
        btnBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(178, 31, 61, 71);

        txtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodigo.setToolTipText("");
        txtCodigo.setNextFocusableComponent(txtCedula);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(70, 60, 100, 23);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Código");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 60, 50, 17);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        jtxtadirecc.setColumns(1);
        jtxtadirecc.setLineWrap(true);
        jtxtadirecc.setRows(1);
        jtxtadirecc.setMaximumSize(new java.awt.Dimension(4, 22));
        jScrollPane1.setViewportView(jtxtadirecc);
        jtxtadirecc.getAccessibleContext().setAccessibleParent(jtxtadirecc);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(320, 160, 170, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 150, 524, 270);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/fondo.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 610, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
   
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    public JTextArea getJtxtadirecc() {
        return jtxtadirecc;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public JButton getButmodificarcorr() {
        return butmodificarcorr;
    }
    
    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtTlf() {
        return txtTlf;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }
    public void agregarListener(ActionListener accion) 
    {
        this.btnCancelar.addActionListener(accion);
        this.btnGuardar.addActionListener(accion);
        this.btnSalir.addActionListener(accion);
        this.btnConsultar.addActionListener(accion);
        this.butmodificarcorr.addActionListener(accion);
        this.btnBuscar.addActionListener(accion);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    public javax.swing.JButton butmodificarcorr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jtxtadirecc;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTlf;
    // End of variables declaration//GEN-END:variables
}
