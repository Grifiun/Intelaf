/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import funciones.ComboBoxCargarDato;
import funciones.EditarDatos;
import graficos.MenuPrincipal;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import registros.RegistroDatos;
import registros.RegistroPedidoYSubPedido;
import registros.RegistroTiempo;
import exportado_de_tabla.ExportarTabla;

/**
 *
 * @author grifiun
 */
public class PanelListaPedidos extends javax.swing.JPanel {
    private final String[] nombreColumnas = "Cod. Pedido,Estado,Fecha de pedido,Anticipo,Cod. Tienda 1,Cod. Tienda2,NIT Cliente,Credito Usado".split(",");
    private boolean inicio = true, cliente = true;
    private JPanel panelParaTabla;    
    private JTable tablaAux;  
    private TableRowSorter<TableModel> buscador;
    
    /**
     * Creates new form PanelListaPedidos
     */
    public PanelListaPedidos() {
        initComponents();        
        
        cargarTiendas();        
        cargarClientes();
        prepararPanelTabla();                
        prepararTabla();
        inicio = false;
    }
    /**
     * Creates new form PanelListaPedidos
     */
    public PanelListaPedidos(String NIT) {
        initComponents();        
        cliente = false;
        cargarTiendas();        
        cargarClientes();
        prepararPanelTabla();                
        prepararTabla();
        inicio = false;
        boxCliente.setSelectedItem(NIT);
        boxEstado.setSelectedIndex(5);
        boxEstado.setVisible(false);
        boxCliente.setVisible(false);
        jLabel1.setText("RASTREO PEDIDO");
        jLabel10.setVisible(false);
        jLabel3.setVisible(false);
        btnExportar.setVisible(false);
        btnEditar.setVisible(false);
        txtTienda.setVisible(false);
        jLabel9.setVisible(false);
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
        btnEditar = new javax.swing.JButton();
        boxEstado = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTienda = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        boxCliente = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("LISTA DE PEDIDOS");

        btnEditar.setText("Recibir p.");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4.1 Todos los pedidos por llegar", "4.2 Pedidos por verificar ingreso", "4.3 Pedidos  con retraso", "4.4 Pedidos salientes en tránsito", "Pedidos por recoger", "4.6 Pedidos en curso de un cliente" }));
        boxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstadoActionPerformed(evt);
            }
        });

        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar:");

        jLabel3.setText("Tipo:");

        txtTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiendaActionPerformed(evt);
            }
        });

        jLabel9.setText("Tienda:");

        btnExportar.setText("Exp. HTML");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        boxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxClienteActionPerformed(evt);
            }
        });

        jLabel10.setText("Nit Cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnRegresar)
                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(boxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btnExportar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //System.out.println(tablaAux.Colu);        
        int x = tablaAux.getSelectedRow(); //Obtenemos la posicion de la seleccion de las filas
        
        if(x != -1 ){//Si hay filas seleccionadas
            int reply = JOptionPane.showConfirmDialog(null, "Desea recibir este paquete?", "Recibir paquete", JOptionPane.YES_NO_OPTION);//mostramos menu de confirmacion
            if (reply == JOptionPane.YES_OPTION) {//si acepta modifcamos el dato
                editarDatos(x);
            } else {
                JOptionPane.showMessageDialog(null, "ok");//si no acepta no pasa nada
            }    
        }else{
            JOptionPane.showMessageDialog(this, "Selecciona una fila primero");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    public void editarDatos(int x){
        RegistroDatos rd = new RegistroDatos();
        ArrayList<String> datos = new ArrayList();
        if(boxEstado.getSelectedIndex() == 1){
            datos.add("RECIBIDO");//agregamos el nuevo estado
        }else if(boxEstado.getSelectedIndex() == 2){
            datos.add("RETRASADO");//agregamos el nuevo estado
        }
        
        datos.add(String.valueOf(tablaAux.getValueAt(x, 0)));//Agregamos el valor del codigo del pedido
        rd.actualizarDatos(datos, "Pedido", "estado", "codigo_pedido");    
        actualizarInfoTabla();
    }           
    
    private void boxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstadoActionPerformed
        if(inicio == false){
             actualizarInfoTabla();
        }
        if(boxEstado.getSelectedIndex()== 1 || boxEstado.getSelectedIndex()== 2){
            btnEditar.setEnabled(true);
        }else{
            btnEditar.setEnabled(false);
        }
    }//GEN-LAST:event_boxEstadoActionPerformed
    /**
     * Actualiza la tabla
     */
    private void actualizarInfoTabla(){
       panelParaTabla.removeAll();
       prepararTabla();
       panelParaTabla.updateUI();//refrescamos el panel
    }
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        if(cliente){
             PanelPedidos panel = new PanelPedidos();
             MenuPrincipal.cargarPanel(panel);
        }else{
            PanelUsuario panel = new PanelUsuario();
            MenuPrincipal.cargarPanel(panel);
        }
       
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiendaActionPerformed
        // TODO add your handling code here:
        if(inicio == false){
             actualizarInfoTabla();
        }
       
    }//GEN-LAST:event_txtTiendaActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        //instanciamos el exportador de datos
        String encabezado = "REPORTE - "+String.valueOf(boxEstado.getSelectedItem())+" - ";
        if(boxEstado.getSelectedIndex() == 5){
            encabezado = encabezado + " Del Cliente con NIT "+String.valueOf(boxCliente.getSelectedItem());
        }else{
            encabezado = encabezado + " De la tienda con codigo "+String.valueOf(txtTienda.getSelectedItem());
        }
        ExportarTabla exportar = new ExportarTabla(tablaAux, nombreColumnas, String.valueOf(boxEstado.getSelectedItem()), encabezado);
        //exportamos
        exportar.exportar();
    }//GEN-LAST:event_btnExportarActionPerformed

    private void boxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxClienteActionPerformed
        if(inicio == false){
            actualizarInfoTabla();
        }
    }//GEN-LAST:event_boxClienteActionPerformed
    /**
     * Funcion que actualizara la tabla con la informacion
     * de la tabla elegida
     * @param nombreTabla 
     */
    public void prepararTabla(){ 
        RegistroDatos regD = new RegistroDatos();
        ArrayList<String> datos = new ArrayList();
        if(boxEstado.getSelectedIndex() >= 0 &&  boxEstado.getSelectedIndex() <= 3){            
            datos.add(String.valueOf(txtTienda.getSelectedItem()));//agregamos el codigo de la tienda            
            datos.add(String.valueOf(MenuPrincipal.getFecha()));//agregamos la fecha
            System.out.println(datos.size());
        }else if(boxEstado.getSelectedIndex() == 4){
            datos.add(String.valueOf(txtTienda.getSelectedItem()));//agregamos el codigo de la tienda   
            System.out.println(datos.size());
        }else if(boxEstado.getSelectedIndex() == 5){            
            datos.add(String.valueOf(boxCliente.getSelectedItem()));//agregamos el nit del cliente
            System.out.println(datos.size());
        }
        
        
        String[] condicion = new String[6];
        condicion[0] = "SELECT * FROM Pedido WHERE (estado = 'EN TRANSITO') AND (codigo_tienda_2 = ?) AND (DATEDIFF(?, fecha) < (SELECT tiempo FROM Tiempo_envio t WHERE (t.tienda_1 = codigo_tienda_1 AND tienda_2 = codigo_tienda_2) OR (t.tienda_2 = codigo_tienda_1 AND tienda_1 = codigo_tienda_2)))";
        condicion[1] = "SELECT * FROM Pedido WHERE (estado = 'EN TRANSITO') AND (codigo_tienda_2 = ?) AND (DATEDIFF(?, fecha) = (SELECT tiempo FROM Tiempo_envio t WHERE (t.tienda_1 = codigo_tienda_1 AND tienda_2 = codigo_tienda_2) OR (t.tienda_2 = codigo_tienda_1 AND tienda_1 = codigo_tienda_2)))";
        condicion[2] = "SELECT * FROM Pedido WHERE (estado = 'EN TRANSITO') AND (codigo_tienda_2 = ?) AND (DATEDIFF(?, fecha) > (SELECT tiempo FROM Tiempo_envio t WHERE (t.tienda_1 = codigo_tienda_1 AND tienda_2 = codigo_tienda_2) OR (t.tienda_2 = codigo_tienda_1 AND tienda_1 = codigo_tienda_2)))";
        condicion[3] = "SELECT * FROM Pedido WHERE (estado = 'EN TRANSITO' OR estado = 'ATRASADO') AND (codigo_tienda_1 = ?) AND (DATEDIFF(?, fecha) < (SELECT tiempo FROM Tiempo_envio t WHERE (t.tienda_1 = codigo_tienda_1 AND tienda_2 = codigo_tienda_2) OR (t.tienda_2 = codigo_tienda_1 AND tienda_1 = codigo_tienda_2)))";
        condicion[4] = "SELECT * FROM Pedido WHERE (estado = 'RECIBIDO') AND (codigo_tienda_2 = ?)";
        condicion[5] = "SELECT * FROM Pedido WHERE (estado = 'EN TRANSITO' OR estado = 'RETRASADO' OR estado = 'RECIBIDO') AND (nit_cliente = ?)";
        TableModel model = new DefaultTableModel(regD.obtenerDatos(condicion[boxEstado.getSelectedIndex()], datos), nombreColumnas)//creamos un modelo para agregar especificaciones
            {
              public boolean isCellEditable(int row, int column)
              {
                return false;//dehabilitamos la edicion
              }
            };
            
        tablaAux = new JTable(model);  
        tablaAux.setLayout(null);
        tablaAux.setBounds(0, 0, 960, 465);
        
        tablaAux.setAutoCreateRowSorter(true); //Agregamos el ordenamiento por columnas
        //AGREGAMOS BUSQUEDAS
        buscador = new TableRowSorter<>(tablaAux.getModel());//creamos el buscador
        tablaAux.setRowSorter(buscador);//Agregamos el filtro buscador a la tabla            
        
        txtFiltro.getDocument().addDocumentListener(new DocumentListener(){//Le agregamos el getDocument al JTextField
            @Override
            public void insertUpdate(DocumentEvent e) {//Cuando se digitan letras al jtextField
                prepararFiltro();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {//Cuando se remueven letras al jtextField
                prepararFiltro();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Sin funcion de momento"); //Cambios extras
            }
        });
        
        panelParaTabla.setLayout(new BorderLayout());
        panelParaTabla.add(tablaAux.getTableHeader(), BorderLayout.PAGE_START);//Generamos los titulos de las columnas
        panelParaTabla.add(tablaAux, BorderLayout.CENTER);        
    }
    
    /**
     * Panel que contiene a la tabla
     */
    public void prepararPanelTabla(){
        panelParaTabla = new JPanel();
        panelParaTabla.setLayout(null);
        panelParaTabla.setBounds(30, 38, 960, 465);
        this.add(panelParaTabla);       
       
    }
    
    /**
     * Funcion encargada de realizar los cambios en la insercion o borrado de letras en el buscador
     */
    public void prepararFiltro(){
        String aux = txtFiltro.getText();//Creamos una variable auxiliar de tipo String
        if (aux.trim().length() == 0) {//Ingnormaos los espacios en blanco
            buscador.setRowFilter(null);//Le agregamos un filtro nulo, es decir sin filtro
        } else {
            buscador.setRowFilter(RowFilter.regexFilter("(?i)" + aux));//Retornamos el mismo filtro
        }
    }
    
     /**
     * Agregamos al comboBox las tiendas existentes
     */
    private void cargarTiendas() {
        ComboBoxCargarDato cargarDato = new ComboBoxCargarDato();
        JComboBox cboxAux = new JComboBox();
        cboxAux = cargarDato.cargar("codigo_tienda", "Tienda");//mandamos le nombre del atributo y nombre de la tabla
        //Pasamos el contenido de un cbo auxiliar al que nos interesa
        for (int i = 0; i < cboxAux.getItemCount(); i++) 
        {
            txtTienda.addItem(String.valueOf(cboxAux.getItemAt(i)));
        }

    }
    private void cargarClientes(){
        ComboBoxCargarDato cargarDato = new ComboBoxCargarDato();
        JComboBox cboxAux = new JComboBox();
        cboxAux = cargarDato.cargar("nit", "Cliente");//mandamos le nombre del atributo y nombre de la tabla
        //Pasamos el contenido de un cbo auxiliar al que nos interesa
        for (int i = 0; i < cboxAux.getItemCount(); i++) 
        {
            boxCliente.addItem(String.valueOf(cboxAux.getItemAt(i)));
        }
    }
    
    public int obtenerTiempoEnvio(String tienda1, String tienda2){   
        int tiempo;
        try {
            RegistroTiempo regT = new RegistroTiempo();
            tiempo = regT.revisarTiempo(tienda1, tienda2);//revisamos la existencia del tiempo entre las tiendas, de existir            
            if(tiempo >= 0){
                return tiempo;
            }
        }catch (SQLException ex) {
            Logger.getLogger(RegistroPedidoYSubPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCliente;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JComboBox<String> txtTienda;
    // End of variables declaration//GEN-END:variables
}
