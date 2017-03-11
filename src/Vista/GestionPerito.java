
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GestionPerito extends javax.swing.JFrame {

    public GestionPerito() {
        initComponents();
     
     
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSalirper = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
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
        jtxtadirec = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 440));
        setMinimumSize(new java.awt.Dimension(640, 440));
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblTitulo.setText("Gestión de Perito");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(240, 20, 197, 22);

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
        btnGuardar.setVerifyInputWhenFocusTarget(false);
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
        btnCancelar.setVerifyInputWhenFocusTarget(false);
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(240, 10, 61, 71);

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
        btnConsultar.setVerifyInputWhenFocusTarget(false);
        btnConsultar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnConsultar);
        btnConsultar.setBounds(170, 10, 67, 70);

        btnSalirper.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSalirper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Salir.png"))); // NOI18N
        btnSalirper.setText("Salir");
        btnSalirper.setBorder(null);
        btnSalirper.setBorderPainted(false);
        btnSalirper.setContentAreaFilled(false);
        btnSalirper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirper.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalirper.setIconTextGap(-3);
        btnSalirper.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Salirpeque.png"))); // NOI18N
        btnSalirper.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Salirgrande.png"))); // NOI18N
        btnSalirper.setVerifyInputWhenFocusTarget(false);
        btnSalirper.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalirper.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnSalirper);
        btnSalirper.setBounds(310, 10, 61, 71);

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Modificar.png"))); // NOI18N
        btnModificar.setText("Moidifcar");
        btnModificar.setBorder(null);
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setIconTextGap(-3);
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Modificarpeque.png"))); // NOI18N
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/MoificarGrande.png"))); // NOI18N
        btnModificar.setVerifyInputWhenFocusTarget(false);
        btnModificar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnModificar);
        btnModificar.setBounds(90, 10, 61, 71);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(130, 50, 390, 90);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Cédula");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 70, 49, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(269, 55, 55, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Teléfono");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 110, 62, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(269, 89, 57, 17);

        txtCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCedula.setNextFocusableComponent(txtNombre);
        jPanel1.add(txtCedula);
        txtCedula.setBounds(70, 70, 93, 23);

        txtApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtApellido.setNextFocusableComponent(txtTlf);
        jPanel1.add(txtApellido);
        txtApellido.setBounds(330, 86, 146, 23);

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setNextFocusableComponent(txtApellido);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(330, 50, 145, 23);

        txtTlf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTlf.setNextFocusableComponent(txtEmail);
        jPanel1.add(txtTlf);
        txtTlf.setBounds(70, 110, 95, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Dirección");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 130, 67, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("E-mail");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 150, 42, 17);

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setNextFocusableComponent(jtxtadirec);
        jPanel1.add(txtEmail);
        txtEmail.setBounds(70, 150, 154, 23);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Buscar.png"))); // NOI18N
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
        btnBuscar.setBounds(170, 0, 61, 60);

        txtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodigo.setText("PER-");
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(70, 20, 87, 23);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Código");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 20, 50, 17);

        jtxtadirec.setColumns(20);
        jtxtadirec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtadirec.setLineWrap(true);
        jtxtadirec.setRows(5);
        jScrollPane1.setViewportView(jtxtadirec);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(330, 130, 230, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(41, 140, 560, 250);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Fondo Grande.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-10, -10, 670, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getBtnSalirper() {
        return btnSalirper;
    }

    

    public JTextArea getJtxtadirec() {
        return jtxtadirec;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtTlf() {
        return txtTlf;
    }

    
    
      public void agregarListener(ActionListener accion) 
    {
        this.btnBuscar.addActionListener(accion);
        this.btnCancelar.addActionListener(accion);
        this.btnConsultar.addActionListener(accion);
        this.btnModificar.addActionListener(accion);
        this.btnGuardar.addActionListener(accion);
        this.btnSalirper.addActionListener(accion);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    public javax.swing.JButton btnSalirper;
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
    public javax.swing.JTextArea jtxtadirec;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTlf;
    // End of variables declaration//GEN-END:variables
}
