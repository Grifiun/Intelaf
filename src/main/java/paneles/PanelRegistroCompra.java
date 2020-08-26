/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import entidades.Pedido;
import entidades.Subpedido;
import funciones.ComboBoxCargarDato;
import funciones.SubStringDatos;
import graficos.MenuPrincipal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import registros.RegistroCompra;
import registros.RegistroDatos;
import registros.RegistroPedido;
import registros.RegistroSubPedido;
import entidades.Compra;
/**
 *
 * @author grifiun
 */
public class PanelRegistroCompra extends javax.swing.JPanel {
    String codigoPedidoGenerado;
    String codigoCompra;
    ArrayList<Subpedido> subpedidos = new ArrayList();
    /**
     * Creates new form PanelRegistroCompra
     */
    public PanelRegistroCompra() {
        initComponents();
        generarCodigos();
        
        cargarCodigosTiendas();
        cargarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxCodTienda = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JFormattedTextField();
        txtNIT = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        boxCodProducto = new javax.swing.JComboBox<>();
        lblTituloNuevaTienda = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCreditoAUsar = new javax.swing.JFormattedTextField();
        txtCancelar = new javax.swing.JButton();
        btnRegistrarCompra = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTituloNuevaTienda1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();

        boxCodTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCodTiendaActionPerformed(evt);
            }
        });

        txtCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel4.setText("*Cod. Producto:");

        lblTituloNuevaTienda.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTituloNuevaTienda.setText("COMPRA");

        jLabel11.setText("*Credito a usar:");

        txtCreditoAUsar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter((DecimalFormat)NumberFormat.getNumberInstance(Locale.US))));

        txtCancelar.setText("Cancelar");
        txtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelarActionPerformed(evt);
            }
        });

        btnRegistrarCompra.setText("Registrar");
        btnRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompraActionPerformed(evt);
            }
        });

        jLabel5.setText("*NIT Cliente:");

        jLabel3.setText("*Cod. Tienda:");

        lblTituloNuevaTienda1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTituloNuevaTienda1.setText("DESCRIPCION DE LOS PRODUCTOS");

        jLabel9.setText("*Cantidad:");

        btnAgregarProducto.setText("Agregar producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        jLabel1.setText("Total: Q.");

        lblPrecio.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(466, 466, 466)
                        .addComponent(txtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblTituloNuevaTienda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCreditoAUsar)
                                        .addComponent(boxCodTienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNIT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boxCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel1)
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnRegistrarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAgregarProducto))))))))
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTituloNuevaTienda)
                .addGap(410, 410, 410))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblTituloNuevaTienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreditoAUsar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxCodTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloNuevaTienda1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProducto)
                    .addComponent(jLabel1)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCancelar)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void generarCodigos(){
        RegistroPedido rp = new RegistroPedido();
        codigoPedidoGenerado = String.valueOf(rp.generarCodAleatorio());
        
        RegistroCompra rc = new RegistroCompra();
        codigoCompra = String.valueOf(rc.generarCodAleatorio());
    }
    private void boxCodTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCodTiendaActionPerformed
        // TODO add your handling code here:
        cargarProductosTienda();//cargamos los productos cuando se cambie de tienda de origen
    }//GEN-LAST:event_boxCodTiendaActionPerformed
    /**
     * Se registran los pedidos
     */
    private void registrarPedido(){
        Pedido entidadAux = new Pedido(codigoPedidoGenerado, lblPrecio.getText(), "POR COMPRA", MenuPrincipal.getFecha(),
                "0.00",  "-", String.valueOf(boxCodTienda.getSelectedItem()),  
                String.valueOf(txtNIT.getSelectedItem()), "0.00");
        //Revisamos los campos obligatorios, si están llenos o vacíos
        if(entidadAux.getCodigo_pedido().isEmpty() || entidadAux.getFecha().isEmpty() || entidadAux.getAnticipo().isEmpty() || entidadAux.getCodigo_tienda_origen().isEmpty()
                 ||  entidadAux.getCodigo_tienda_destino().isEmpty() || entidadAux.getNit_cliente().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos del pedido");
        }else{            
            RegistroDatos rd = new RegistroDatos();
            try{                
                //instanciamos y agregamos todos los datos
                SubStringDatos auxiliarSubDatos = new SubStringDatos("Pedido (");
                auxiliarSubDatos.agregarSubStringYDato(entidadAux.getCodigo_pedido(), "codigo_pedido");
                auxiliarSubDatos.agregarSubStringYDato(entidadAux.getEstado(), ", estado");
                auxiliarSubDatos.agregarSubStringYDato(entidadAux.getFecha(), ", fecha");
                auxiliarSubDatos.agregarSubStringYDato(entidadAux.getAnticipo(), ", anticipo");
                auxiliarSubDatos.agregarSubStringYDato(entidadAux.getCodigo_tienda_origen(), ", codigo_tienda_1");
                auxiliarSubDatos.agregarSubStringYDato(entidadAux.getCodigo_tienda_destino(), ", codigo_tienda_2");
                auxiliarSubDatos.agregarSubStringYDato(entidadAux.getNit_cliente(), ", nit_cliente");
                auxiliarSubDatos.agregarSubStringYDato(entidadAux.getCredito_usado(), ", credito_usado_anticipo");

                //REGISTRAMOS EL CLIENTE
                RegistroDatos regAux = new RegistroPedido(auxiliarSubDatos.getSubOrden());//Le agregamos la suborden
                regAux.registrarDatos(auxiliarSubDatos.getDatos());//creamos el registro con los datos

                ArrayList<String> datos = new ArrayList();
                datos.add(entidadAux.getCodigo_pedido());

                try{//Se verifica si el pedido se registro
                    if(regAux.verificarExistenciaRegisgtro("SELECT codigo_pedido FROM Pedido WHERE codigo_pedido = ?", datos)){                        

                        registrarSubPedidos();
                    }
                }catch(Exception ex){
                    System.out.println("Se produjo un error al verificar el exito del registro");
                }
                
                
            }catch(Exception ex){
            
            }
            
        }
    }
    /**
     * Se registran los subpedidos
     */
    private void registrarSubPedidos(){
        for(int i = 0; i < subpedidos.size(); i++){            
            //Subpedido (codigo_pedido, codigo_producto, cantidad, subtotal)
            ArrayList<String> datos = new ArrayList();
            datos.add(subpedidos.get(i).getCodigo_pedido());//Agregamos el codigo del pedido
            datos.add(subpedidos.get(i).getCodigo_producto());//agregamos el codigo del producto
            datos.add(subpedidos.get(i).getCantidad());//agregamos la cantidad
            datos.add(subpedidos.get(i).getSubtotal());//agregamos el precio subtotal
            //REGISTRAMOS EL CLIENTE
            RegistroDatos regAux = new RegistroSubPedido();//Le agregamos la suborden
            regAux.registrarDatos(datos);//creamos el registro con los datos
            
            RegistroDatos rd = new RegistroDatos();
            datos.clear();//limpiamos el arrayList
            //Obtenemos la existencia actual
            String[] cantidadActual= rd.obtenerDatos("Producto", "cantidad", " WHERE codigo_producto = '"
                    +subpedidos.get(i).getCodigo_producto()+"' AND codigo_tienda = '"+String.valueOf(boxCodTienda.getSelectedItem())+"'");
            //agregamos la nueva cantidad
            datos.add(String.valueOf( Double.parseDouble(cantidadActual[0]) - Double.parseDouble(subpedidos.get(i).getCantidad()) ));//actualizamos la cantidad del producto
            
            //agregamos el codigo del producto
            datos.add(subpedidos.get(i).getCodigo_producto());
            //agregamos el codigo de la tienda
            datos.add(String.valueOf(boxCodTienda.getSelectedItem()));
                        
            rd.actualizarDatos(datos, "Producto", "cantidad ", "codigo_producto", "codigo_tienda");                            
        }
    }
    /**
     * Registra la compra
     */
    private void registrarCompra(){
        Compra entidadAux = new Compra(codigoCompra, txtCreditoAUsar.getText(), lblPrecio.getText(), String.valueOf(boxCodTienda.getSelectedItem())
        ,String.valueOf(txtNIT.getSelectedItem()), codigoPedidoGenerado);
        
        SubStringDatos auxiliarSubDatos = new SubStringDatos("Compra (");
        auxiliarSubDatos.agregarSubStringYDato(entidadAux.getCodigo_compra(), "codigo_compra");
        auxiliarSubDatos.agregarSubStringYDato(entidadAux.getEfectivo(), ", efectivo");
        auxiliarSubDatos.agregarSubStringYDato(entidadAux.getCredito_usado(), ", credito_usado");
        auxiliarSubDatos.agregarSubStringYDato(entidadAux.getPrecio_total(), ", precio_total");
        auxiliarSubDatos.agregarSubStringYDato(entidadAux.getCodigo_tienda(), ", codigo_tienda");
        auxiliarSubDatos.agregarSubStringYDato(entidadAux.getNit_cliente(), ", nit_cliente");
        auxiliarSubDatos.agregarSubStringYDato(codigoPedidoGenerado, ", codigo_pedido");

        //REGISTRAMOS EL CLIENTE
        RegistroDatos regAux = new RegistroCompra(auxiliarSubDatos.getSubOrden());//Le agregamos la suborden
        regAux.registrarDatos(auxiliarSubDatos.getDatos());//creamos el registro con los datos
        
        RegistroDatos rd = new RegistroDatos();
        String[] creditoActualCliente = rd.obtenerDatos("Cliente", "credito", " WHERE nit = '"+String.valueOf(txtNIT.getSelectedItem())+"'");

        ArrayList<String> datos = new ArrayList();//removemos los datos del arraylist
        datos.add(String.valueOf(Double.parseDouble(creditoActualCliente[0]) - Double.parseDouble(entidadAux.getCredito_usado())));//actualizamos el credito
        datos.add(String.valueOf(txtNIT.getSelectedItem()));

        rd.actualizarDatos(datos, "Cliente", "credito ", "nit");
        
    };
    private void txtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelarActionPerformed
        PanelEmpleado panelEmpleado = new PanelEmpleado();
        MenuPrincipal.cargarPanel(panelEmpleado);
    }//GEN-LAST:event_txtCancelarActionPerformed

    private void btnRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCompraActionPerformed
        conection_data_base.Consulta.mensajesEmergentes = false;
        try{
            RegistroDatos rd = new RegistroDatos();
            String[] creditoActualCliente = rd.obtenerDatos("Cliente", "credito", " WHERE nit = '"+String.valueOf(txtNIT.getSelectedItem())+"'");
            if(Double.parseDouble(txtCreditoAUsar.getText()) > Double.parseDouble(creditoActualCliente[0])){//Revisamos si el credito actual del cliente lo cubre
                JOptionPane.showMessageDialog(null, "El credito que quiere usar es mayor al credito actual: "+creditoActualCliente[0]);
            }else{
            registrarPedido();

            try{//Se verifica si el pedido se registro
                RegistroDatos regAux = new RegistroDatos();//Le agregamos la suborden
                ArrayList<String> datos = new ArrayList();
                datos.add(codigoPedidoGenerado);

                if(regAux.verificarExistenciaRegisgtro("SELECT codigo_pedido FROM Pedido WHERE codigo_pedido = ?", datos)){
                    //Si el registro se hizo de forma correcta cerramos el panel y nos pasamos a otro
                    registrarCompra();
                    JOptionPane.showMessageDialog(this, "REGISTRO HECHO CON EXITO");
                    PanelEmpleado panel = new PanelEmpleado();
                    MenuPrincipal.cargarPanel(panel);
                }else{
                    JOptionPane.showMessageDialog(this, "Error al realizar el registro");
                }
            }catch(Exception ex){
                System.out.println("Se produjo un error al verificar el exito del registro");
            }

            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error al realizar el registro");
        }

        conection_data_base.Consulta.mensajesEmergentes = true;
    }//GEN-LAST:event_btnRegistrarCompraActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // Agregamos el subpedido al arrayList
        RegistroDatos rd = new RegistroDatos();
        String[] cantidadYPrecio;

        //Los datos devueltos por la funcion son
        //pos 0: Cantidad del producto
        //pos 1: Precio del producto
        if(txtCantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese la cantidad");
        }else{
            cantidadYPrecio = rd.obtenerDatos("Producto", "cantidad, precio", " WHERE codigo_producto = '"+String.valueOf(boxCodProducto.getSelectedItem())+
                "' AND codigo_tienda = '"+String.valueOf(boxCodTienda.getSelectedItem())+"'");
            try{
                if(Integer.parseInt(txtCantidad.getText()) > Integer.parseInt(cantidadYPrecio[0])){
                    JOptionPane.showMessageDialog(this, "La cantidad ingresada es superior a la cantidad existente: "+cantidadYPrecio[0]);
                }else{
                    double subtotal = Integer.valueOf(txtCantidad.getText()) * Double.parseDouble(cantidadYPrecio[1]);
                    //subtotal = cantidad * precio
                    JOptionPane.showMessageDialog(this, "El precio unitario del producto es de: "+cantidadYPrecio[1]+
                        "\nLa cantidad ingresada es de "+txtCantidad.getText()+
                        "\nEl subtotal es de "+subtotal);
                    Subpedido auxsp = new Subpedido(txtCantidad.getText(), String.valueOf(subtotal), codigoPedidoGenerado, String.valueOf(boxCodProducto.getSelectedItem()));
                    subpedidos.add(auxsp);//Agregamos la entidad creada al arrayList
                    double aux = Double.parseDouble(lblPrecio.getText()) + subtotal;
                    lblPrecio.setText(String.valueOf(aux));
                }
                //una vez se agregue un producto ya no se pueden cambiar las tiendas
                //boxCodTiendaOrigen.setEnabled(false);
                //boxCodTiendaDestino.setEnabled(false);
            }catch(Exception ex){
                System.out.println("no se pudo completar la accion");
            }

        }

    }//GEN-LAST:event_btnAgregarProductoActionPerformed
    
    /**
     * Cargamos los codigos de las tiendas existentes a los 2 comboBox
     */
    private void cargarCodigosTiendas(){
        ComboBoxCargarDato cargarDato = new ComboBoxCargarDato();
        JComboBox cboxAux = new JComboBox();
        cboxAux = cargarDato.cargar("codigo_tienda", "Tienda");//mandamos le nombre del atributo y nombre de la tabla
        //Pasamos el contenido de un cbo auxiliar al que nos interesa
        for (int i = 0; i < cboxAux.getItemCount(); i++) 
        {
            boxCodTienda.addItem(String.valueOf(cboxAux.getItemAt(i)));
        }
    }
    
    /**
     * Cargamos los codigos de las tiendas existentes a los 2 comboBox
     */
    private void cargarClientes(){
        ComboBoxCargarDato cargarDato = new ComboBoxCargarDato();
        JComboBox cboxAux = new JComboBox();
        cboxAux = cargarDato.cargar("nit", "Cliente");//mandamos le nombre del atributo y nombre de la tabla
        //Pasamos el contenido de un cbo auxiliar al que nos interesa
        for (int i = 0; i < cboxAux.getItemCount(); i++) 
        {
            txtNIT.addItem(String.valueOf(cboxAux.getItemAt(i)));
        }
    }
    
    
    /**
     * Cargamos los productos de la tienda de origen
     */
    private void cargarProductosTienda(){
        boxCodProducto.removeAllItems();
        ComboBoxCargarDato cargarDato = new ComboBoxCargarDato();
        JComboBox cboxAux = new JComboBox();
        cboxAux = cargarDato.cargar("codigo_producto", "Producto", "codigo_tienda", String.valueOf(boxCodTienda.getSelectedItem()));//mandamos le nombre del atributo y nombre de la tabla
        //Pasamos el contenido de un cbo auxiliar al que nos interesa
        for (int i = 0; i < cboxAux.getItemCount(); i++) 
        {
            boxCodProducto.addItem(String.valueOf(cboxAux.getItemAt(i)));
        }
        if(boxCodProducto.getItemCount() == 0){
            JOptionPane.showMessageDialog(this, "Seleccione otra tienda de origen, la actual no tiene productos");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCodProducto;
    private javax.swing.JComboBox<String> boxCodTienda;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnRegistrarCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTituloNuevaTienda;
    private javax.swing.JLabel lblTituloNuevaTienda1;
    private javax.swing.JButton txtCancelar;
    private javax.swing.JFormattedTextField txtCantidad;
    private javax.swing.JFormattedTextField txtCreditoAUsar;
    private javax.swing.JComboBox<String> txtNIT;
    // End of variables declaration//GEN-END:variables
}