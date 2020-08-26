/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import funciones.ComboBoxCargarDato;
import graficos.MenuPrincipal;
import javax.swing.JComboBox;

/**
 *
 * @author grifiun
 */
public class PanelPedidos extends javax.swing.JPanel {

    /**
     * Creates new form PanelPedidos
     */
    public PanelPedidos() {
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

        txtFacturarPedido = new javax.swing.JButton();
        txtCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnIngresarProducto3 = new javax.swing.JButton();
        btnListadoPedidos = new javax.swing.JButton();

        txtFacturarPedido.setText("Facturar pedido");
        txtFacturarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturarPedidoActionPerformed(evt);
            }
        });

        txtCancelar.setText("Cancelar");
        txtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("PEDIDOS");

        btnIngresarProducto3.setText("Ingresar Pedido");
        btnIngresarProducto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarProducto3ActionPerformed(evt);
            }
        });

        btnListadoPedidos.setText("Listado de pedidos");
        btnListadoPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFacturarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresarProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListadoPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)))
                .addGap(361, 361, 361))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresarProducto3)
                .addGap(8, 8, 8)
                .addComponent(btnListadoPedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFacturarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCancelar)
                .addContainerGap(222, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFacturarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturarPedidoActionPerformed
        PanelFacturarPedido panelCreacionEmp = new PanelFacturarPedido();
        MenuPrincipal.cargarPanel(panelCreacionEmp);
    }//GEN-LAST:event_txtFacturarPedidoActionPerformed

    private void txtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelarActionPerformed
        PanelEmpleado panelEmpleado = new PanelEmpleado();
        MenuPrincipal.cargarPanel(panelEmpleado);
    }//GEN-LAST:event_txtCancelarActionPerformed

    private void btnIngresarProducto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarProducto3ActionPerformed
        PanelCrearPedido cp = new PanelCrearPedido();
        MenuPrincipal.cargarPanel(cp);
    }//GEN-LAST:event_btnIngresarProducto3ActionPerformed

    private void btnListadoPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoPedidosActionPerformed
        PanelListaPedidos cp = new PanelListaPedidos();
        MenuPrincipal.cargarPanel(cp);
    }//GEN-LAST:event_btnListadoPedidosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarProducto3;
    private javax.swing.JButton btnListadoPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton txtCancelar;
    private javax.swing.JButton txtFacturarPedido;
    // End of variables declaration//GEN-END:variables
}
