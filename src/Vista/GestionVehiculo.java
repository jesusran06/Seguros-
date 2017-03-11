
package Vista;

import Controlador.ControladorVehiculo;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GestionVehiculo extends javax.swing.JFrame {

    public GestionVehiculo() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnSalirper = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSerialCarr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarVe = new javax.swing.JButton();
        txtPlaca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbAno = new javax.swing.JComboBox();
        txtColor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioVe = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();
        cmbVehiculo = new javax.swing.JComboBox();
        cmbMarca = new javax.swing.JComboBox();
        cmbModelo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(648, 545));
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblTitulo.setText("Gestión de Vehículo");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(240, 20, 178, 22);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setIconTextGap(-3);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Guardarpeque.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Buscargran.png"))); // NOI18N
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnGuardar);
        btnGuardar.setBounds(10, 11, 93, 79);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setIconTextGap(-3);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/eliminarchiquito.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/eliminargrande.png"))); // NOI18N
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(260, 20, 93, 71);

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Consultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
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
        btnConsultar.setBounds(180, 30, 93, 60);

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
        jPanel2.add(btnModificar);
        btnModificar.setBounds(90, 20, 93, 70);

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
        btnSalirper.setBounds(350, 10, 61, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(110, 40, 440, 100);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de vehículo"));
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Marca");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Serial de carrocería");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Modelo");

        txtSerialCarr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Año");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Precio del vehículo");

        btnBuscarVe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnBuscarVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/Buscar.png"))); // NOI18N
        btnBuscarVe.setText("Buscar");
        btnBuscarVe.setBorderPainted(false);
        btnBuscarVe.setContentAreaFilled(false);
        btnBuscarVe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarVe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarVe.setIconTextGap(-3);
        btnBuscarVe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/Buscarpeque.png"))); // NOI18N
        btnBuscarVe.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/Buscargrande.png"))); // NOI18N
        btnBuscarVe.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscarVe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVeActionPerformed(evt);
            }
        });

        txtPlaca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Placa");

        cmbAno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));

        txtColor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtColor.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Color");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Tipo de vehículo");

        txtPrecioVe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Descripción");

        txtDescrip.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cmbVehiculo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Automovil", "Camion", "Camioneta", "Volqueta", "Cuatrimoto", "Moto" }));

        cmbMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        cmbModelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarVe))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSerialCarr, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(281, 281, 281)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioVe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(btnBuscarVe))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSerialCarr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cmbVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrecioVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 136, 600, 288);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Fondo Grande.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 710, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarVeActionPerformed

    public JComboBox getCmbAno() {
        return cmbAno;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }


    public JComboBox getCmbVehiculo() {
        return cmbVehiculo;
    }
    
   
    public JTextField getTxtColor() {
        return txtColor;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JComboBox getCmbMarca() {
        return cmbMarca;
    }

    public JComboBox getCmbModelo() {
        return cmbModelo;
    }

    public JTextField getTxtPlaca() {
        return txtPlaca;
    }

    public JTextField getTxtPrecioVe() {
        return txtPrecioVe;
    }

    public JTextField getTxtSerialCarr() {
        return txtSerialCarr;
    }

    public JTextField getTxtDescrip() {
        return txtDescrip;
    }


    public JButton getBtnCancelar() {
        return btnEliminar;
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnSalirper() {
        return btnSalirper;
    }

    

    public JButton getBtnBuscarVe() {
        return btnBuscarVe;
    }

    

      public void agregarListener(ActionListener accion) 
    {
        this.btnEliminar.addActionListener(accion);
        this.btnGuardar.addActionListener(accion);
        this.btnSalirper.addActionListener(accion);
        this.btnModificar.addActionListener(accion);
        this.btnConsultar.addActionListener(accion);
        this.btnBuscarVe.addActionListener(accion);
        this.cmbVehiculo.addActionListener(accion);
        this.cmbMarca.addActionListener(accion);
        this.cmbModelo.addActionListener(accion);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVe;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnSalirper;
    private javax.swing.JComboBox cmbAno;
    private javax.swing.JComboBox cmbMarca;
    private javax.swing.JComboBox cmbModelo;
    private javax.swing.JComboBox cmbVehiculo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrecioVe;
    private javax.swing.JTextField txtSerialCarr;
    // End of variables declaration//GEN-END:variables
}
