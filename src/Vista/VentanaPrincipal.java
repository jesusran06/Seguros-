
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class VentanaPrincipal extends javax.swing.JFrame {

    
    public VentanaPrincipal() {
        initComponents();
        
        
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jbtnsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuIAnalista = new javax.swing.JMenu();
        jMenuItemAnalista = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemCobertura = new javax.swing.JMenuItem();
        jMenuItemCorredor = new javax.swing.JMenuItem();
        jMenuItemPerito = new javax.swing.JMenuItem();
        jMenuItemReparacion = new javax.swing.JMenuItem();
        jMenuItemRepuesto = new javax.swing.JMenuItem();
        jMenuServicio = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuItemVehiculo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemInformeSiniestro = new javax.swing.JMenuItem();
        jMenuItemSiniestro = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemReporteSiniestros = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/carro.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 90, 430, 270);

        jbtnsalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Estaticos/apagar.png"))); // NOI18N
        jbtnsalir.setText("Salir");
        jbtnsalir.setBorder(null);
        jbtnsalir.setBorderPainted(false);
        jbtnsalir.setContentAreaFilled(false);
        jbtnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnsalir.setDefaultCapable(false);
        jbtnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnsalir.setIconTextGap(0);
        jbtnsalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Pequeños/apagarchiquito.png"))); // NOI18N
        jbtnsalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Botones/Grandes/apagargrande.png"))); // NOI18N
        jbtnsalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnsalir);
        jbtnsalir.setBounds(470, 330, 101, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Fondo Grande.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 675);

        jMenuIAnalista.setText("Maestros");

        jMenuItemAnalista.setText("Analista");
        jMenuItemAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnalistaActionPerformed(evt);
            }
        });
        jMenuIAnalista.add(jMenuItemAnalista);

        jMenuItemCliente.setText("Cliente");
        jMenuIAnalista.add(jMenuItemCliente);

        jMenuItemCobertura.setText("Cobertura");
        jMenuItemCobertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCoberturaActionPerformed(evt);
            }
        });
        jMenuIAnalista.add(jMenuItemCobertura);

        jMenuItemCorredor.setText("Corredor");
        jMenuIAnalista.add(jMenuItemCorredor);

        jMenuItemPerito.setText("Perito");
        jMenuIAnalista.add(jMenuItemPerito);

        jMenuItemReparacion.setText("Reparacion");
        jMenuItemReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReparacionActionPerformed(evt);
            }
        });
        jMenuIAnalista.add(jMenuItemReparacion);

        jMenuItemRepuesto.setText("Repuesto");
        jMenuItemRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRepuestoActionPerformed(evt);
            }
        });
        jMenuIAnalista.add(jMenuItemRepuesto);

        jMenuServicio.setText("Servicio");
        jMenuServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuServicioActionPerformed(evt);
            }
        });
        jMenuIAnalista.add(jMenuServicio);

        jMenuItemUsuario.setText("Usuario");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuIAnalista.add(jMenuItemUsuario);

        jMenuItemVehiculo.setText("Vehículo");
        jMenuIAnalista.add(jMenuItemVehiculo);

        jMenuBar1.add(jMenuIAnalista);

        jMenu2.setText("Movimientos");

        jMenuItemInformeSiniestro.setText("Generar Informe de Siniestro");
        jMenu2.add(jMenuItemInformeSiniestro);

        jMenuItemSiniestro.setText("Declaración de Siniestro");
        jMenu2.add(jMenuItemSiniestro);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");

        jMenuItemReporteSiniestros.setText("Reporte de siniestros por marca");
        jMenu3.add(jMenuItemReporteSiniestros);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuServicioActionPerformed

    private void jMenuItemReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReparacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemReparacionActionPerformed

    private void jMenuItemRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRepuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRepuestoActionPerformed

    private void jMenuItemAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnalistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAnalistaActionPerformed

    private void jbtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnsalirActionPerformed

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

    private void jMenuItemCoberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCoberturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCoberturaActionPerformed

    public JMenuItem getjMenuItemCliente() {
        return jMenuItemCliente;
    }

    public JMenuItem getjMenuItemAnalista() {
        return jMenuItemAnalista;
    }

   
    
    public JMenuItem getjMenuItemRepuesto() {
        return jMenuItemRepuesto;
    }
    

    public JMenuItem getjMenuItemPerito() {
        return jMenuItemPerito;
    }

    

    public JMenuItem getjMenuItemSiniestro() {
        return jMenuItemSiniestro;
    }

    public JMenuItem getjMenuItemReporteSiniestros() {
        return jMenuItemReporteSiniestros;
    }

    
    public JMenuItem getjMenuItemVehiculo() {
        return jMenuItemVehiculo;
    }

    public JMenuItem getjMenuItemCorredor() {
        return jMenuItemCorredor;
    }

    public JMenuItem getjMenuItemInformeSiniestro() {
        return jMenuItemInformeSiniestro;
    }

    public JMenuItem getjMenuItemReparacion() {
        return jMenuItemReparacion;
    }

    public JButton getJbtnsalir() {
        return jbtnsalir;
    }

    public JMenuItem getjMenuItemUsuario() {
        return jMenuItemUsuario;
    }

    public JMenuItem getjMenuItemCobertura() {
        return jMenuItemCobertura;
    }
    
    
     public void agregarListener (ActionListener accion)
{
    this.jMenuItemCliente.addActionListener(accion);
    this.jMenuItemSiniestro.addActionListener(accion);
    this.jMenuServicio.addActionListener(accion);
    this.jMenuItemReporteSiniestros.addActionListener(accion);
    this.jMenuItemVehiculo.addActionListener(accion);
    this.jMenuItemCorredor.addActionListener(accion);
    this.jMenuItemPerito.addActionListener(accion);
    this.jMenuItemInformeSiniestro.addActionListener(accion);
    this.jMenuItemReparacion.addActionListener(accion);
    this.jMenuItemRepuesto.addActionListener(accion);
    this.jMenuItemAnalista.addActionListener(accion);
    this.jbtnsalir.addActionListener(accion);
    this.jMenuItemUsuario.addActionListener(accion);
    this.jMenuItemCobertura.addActionListener(accion);
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuIAnalista;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAnalista;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemCobertura;
    private javax.swing.JMenuItem jMenuItemCorredor;
    private javax.swing.JMenuItem jMenuItemInformeSiniestro;
    private javax.swing.JMenuItem jMenuItemPerito;
    private javax.swing.JMenuItem jMenuItemReparacion;
    private javax.swing.JMenuItem jMenuItemReporteSiniestros;
    private javax.swing.JMenuItem jMenuItemRepuesto;
    private javax.swing.JMenuItem jMenuItemSiniestro;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenuItem jMenuItemVehiculo;
    public javax.swing.JMenuItem jMenuServicio;
    private javax.swing.JButton jbtnsalir;
    // End of variables declaration//GEN-END:variables
}
