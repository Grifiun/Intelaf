/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import conection_data_base.Consulta;
import entidades.Tiempo_envio;
import graficos.MenuPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import registros.RegistroDatos;
import registros.RegistroTiempo;
/**
 *
 * @author grifiun
 */
public class PanelCreacionTiempoEnvio extends javax.swing.JPanel {
    private String codigoTiendaActual;
    private String[] codigosTienda;
    /**
     * Creates new form PanelCreacionTiempoEnvio
     */
    public PanelCreacionTiempoEnvio(String codTienda) {
        initComponents();
        this.codigoTiendaActual = codTienda;        
        agregarCodTienda1();
        cargarTiendas();
        agregarCodTienda2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarTienda = new javax.swing.JButton();
        txtHorario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCancelar = new javax.swing.JButton();
        txtCodigoTienda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblTituloNuevaTienda = new javax.swing.JLabel();
        txtNombreTienda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccionTienda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTituloNuevaTienda1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCodTienda1 = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        cmbBoxTienda = new javax.swing.JComboBox<>();
        txtTiempoDias = new javax.swing.JFormattedTextField();

        btnRegistrarTienda.setText("Registrar");
        btnRegistrarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTiendaActionPerformed(evt);
            }
        });

        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });

        jLabel6.setText("horario");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabel7.setText("correo");

        txtCancelar.setText("Cancelar");
        txtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("*Cod tienda");

        lblTituloNuevaTienda.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTituloNuevaTienda.setText("INGRESO NUEVA TIENDA");

        jLabel2.setText("*Nombre:");

        txtDireccionTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionTiendaActionPerformed(evt);
            }
        });

        jLabel3.setText("*Direccion:");

        txtTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono1ActionPerformed(evt);
            }
        });

        jLabel4.setText("*Telefono 1:");

        txtTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono 2:");

        jLabel11.setText("*Cod tienda 1:");

        lblTituloNuevaTienda1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTituloNuevaTienda1.setText("INGRESO NUEVO TIEMPO DE ENVIO");

        jLabel12.setText("*Cod tienda 2:");

        jLabel13.setText("*Tiempo en dias");

        txtCodTienda1.setEnabled(false);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtTiempoDias.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(lblTituloNuevaTienda1)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodTienda1)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbBoxTienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTiempoDias))))
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(lblTituloNuevaTienda1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodTienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBoxTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTiempoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar)
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTiendaActionPerformed
        
    }//GEN-LAST:event_btnRegistrarTiendaActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelarActionPerformed
       
    }//GEN-LAST:event_txtCancelarActionPerformed

    private void txtDireccionTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionTiendaActionPerformed

    private void txtTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1ActionPerformed

    private void txtTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono2ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         //REGISTRAMOS EL TIEMPO DE ENVIO
         
         Tiempo_envio entidadAux = new Tiempo_envio(txtCodTienda1.getText(), String.valueOf(cmbBoxTienda.getSelectedItem()), txtTiempoDias.getText());
       //Revisamos los campos obligatorios, si están llenos o vacíos      
       if(entidadAux.getTiempo().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el numero de dias");
       }else{
           
            //instanciamos y agregamos todos los datos
            ArrayList<String> aux = new ArrayList();
            aux.add(entidadAux.getTienda_1());
            aux.add(entidadAux.getTienda_2());
            aux.add(entidadAux.getTiempo());
            //REGISTRAMOS LA TIENDA
            RegistroDatos regAux = new RegistroTiempo();//Le agregamos la suborden
            regAux.registrarDatos(aux);//creamos el registro con los datos
           
            cmbBoxTienda.removeItemAt(cmbBoxTienda.getSelectedIndex());//removemos la opcion
            if(cmbBoxTienda.getItemCount() == 0){//Si esta vacio entonces terminamos el ingreso de los tiempos de envio
                JOptionPane.showMessageDialog(null, "Registro de tiempo de envio terminado");
                PanelEmpleado pe = new PanelEmpleado();                
                MenuPrincipal.cargarPanel(pe);
            }
       }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * Agregamos el codigo de la tienda a la que se le agregaran los tiempos de envio
     */
    private void agregarCodTienda1() {
        txtCodTienda1.setText(codigoTiendaActual);
    }
    
    private void agregarCodTienda2() {
        
    }
    
    private void cargarTiendas() {        
        try(ResultSet rs = Consulta.consultaOrden("SELECT codigo_tienda FROM Tienda")){
            //Agregamos los codigos de las tiendas al comboBox
            while(rs.next()){
                if(rs.getString("codigo_tienda").equals(codigoTiendaActual) == false)
                cmbBoxTienda.addItem(rs.getString("codigo_tienda"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PanelCreacionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarTienda;
    private javax.swing.JComboBox<String> cmbBoxTienda;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblTituloNuevaTienda;
    private javax.swing.JLabel lblTituloNuevaTienda1;
    private javax.swing.JButton txtCancelar;
    private javax.swing.JTextField txtCodTienda1;
    private javax.swing.JTextField txtCodigoTienda;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccionTienda;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNombreTienda;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    private javax.swing.JFormattedTextField txtTiempoDias;
    // End of variables declaration//GEN-END:variables

}