/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import graficos.MenuPrincipal;
import static graficos.MenuPrincipal.contenedorPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
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
import funciones.EditarDatos;

/**
 *
 * @author grifiun
 */
public class PanelEnlistarRegistro extends javax.swing.JPanel {
    private final String[] nombreTablas = {"Tienda", "Empleado", "Cliente", "Producto",  "Tiempo_envio", "Compra", "Pedido"};
    private final String[][] nombreColumnas = { "Cod. Tienda,Nombre,Direccion,Telefono,Telefono 2,Horario,Correo".split(","),
        "Cod. Empleado,Nombre,DPI,Correo,Direccion,NIT,Telefono,Trabaja en".split(","),
        "NIT,Nombre,Telefono,Correo,Direccion,DPI,Credito".split(","),
        "Cod. Producto,Cantidad,Precio,Nombre,Fabricante,Descripcion,Garantia,Se encuentra en".split(","),
        "Cod. Tienda 1,Cod. Tienda 2,Tiempo entre tiendas".split(","),
        "Cod. Compra,Efectivo usado,Credito usado,Precio Total,Cod. Tienda de compra,NIT Cliente,Cod. Pedido".split(","),
        "Cod. Pedido,Estado,Fecha de pedido,Anticipo,Cod. Tienda 1,Cod. Tienda2,Cod. Tienda Destino,NIT Cliente".split(",")};
    
    private final String[][] nombreAtributosTablas = { "codigo_tienda,nombre_tienda,direccion_tienda,telefono_1,telefono_2,horario,correo".split(","),
        "codigo_empleado,nombre_empleado,dpi,correo_empleado,direccion_empleado,nit_empleado,telefono_empleado,codigo_tienda".split(","),
        "nit,nombre_cliente,telefono_cliente,correo_cliente,dirreccion_cliente,dpi,credito".split(","),
        "codigo_producto,cantidad,precio,nombre_producto,fabricante,descripcion,garantia,codigo_tienda".split(","), 
        "Cod. Tienda 1,Cod. Tienda 2,Tiempo entre tiendas".split(",")};
    
    private final int[][] editable = {{0,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,1,1,1,1,1,1},{0,1,1,1,1,1,1,0},{0,0,1}};
    
    private JPanel panelParaTabla;    
    private JTable tablaAux;  
    private TableRowSorter<TableModel> buscador;
    /**
     * Creates new form PanelEnlistarRegistro
     */
    public PanelEnlistarRegistro() {
        initComponents();
        prepararPanelTabla();
                
        prepararTabla(nombreTablas[0], nombreColumnas[0]);
    }

    /**
     * Funcion que actualizara la tabla con la informacion
     * de la tabla elegida
     * @param nombreTabla 
     */
    public void prepararTabla(String nombreTabla, String[] tituloColumnas){ 
        RegistroDatos regD = new RegistroDatos();
        TableModel model = new DefaultTableModel(regD.obtenerDatos(nombreTabla), tituloColumnas)//creamos un modelo para agregar especificaciones
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        comboBoxTabla = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        comboBoxCampoAEditar = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("LISTADOS");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        comboBoxTabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tienda", "Empleado", "Cliente", "Producto", "Tiempo entre tiendas", "Compra", "Pedido" }));
        comboBoxTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTablaActionPerformed(evt);
            }
        });

        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar:");

        comboBoxCampoAEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tiempo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCampoAEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(425, 425, 425))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 479, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(comboBoxTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel2)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxCampoAEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        PanelEmpleado panelEmpleado = new PanelEmpleado();
        MenuPrincipal.cargarPanel(panelEmpleado);
    }//GEN-LAST:event_btnRegresarActionPerformed
    /**
     * Boton que activa la modifacion de los datos
     * @param evt 
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //System.out.println(tablaAux.Colu);        
        int x = tablaAux.getSelectedRow(), y = tablaAux.getSelectedColumn();   //Obtenemos la posicion de la seleccion de las columnas y las filas
        
        if(x != -1 ){//Si hay filas seleccionadas            
            if(y != -1){//Verifica si hay columnas seleccionadas
                isEditable(x, y);
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    /**
     * Cuando se elija otra tabla en el comboBox de tablas la tabla se actualiza
     * @param evt 
     */
    private void comboBoxTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTablaActionPerformed
       actualizarInfoTabla();
    }//GEN-LAST:event_comboBoxTablaActionPerformed
    
    private void actualizarInfoTabla(){
       panelParaTabla.removeAll();
       prepararTabla(nombreTablas[comboBoxTabla.getSelectedIndex()], nombreColumnas[comboBoxTabla.getSelectedIndex()]);
       panelParaTabla.updateUI();//refrescamos el panel
    }
    /**
     * Si el dato es editable se procede a realizar el cambio
     * @param x
     * @param y 
     */
    private void isEditable(int x, int y){
        
        if(comboBoxTabla.getSelectedIndex() > 4)
            JOptionPane.showMessageDialog(this, "Esta tabla no se puede editar");
        else{
            if(editable[comboBoxTabla.getSelectedIndex()][y] == 1){
                editarDatos(x, y);
            }else{
                JOptionPane.showMessageDialog(this, "Este atributo no se puede editar");
            }
        }
    }
    
    public void editarDatos(int x, int y){
        EditarDatos ed = new EditarDatos();
        ed.setNombreTabla(String.valueOf(comboBoxTabla.getSelectedItem()));//Nombre que se muestra de la tabla en la aplicacion  
        ed.setTablaRegistro(nombreTablas[comboBoxTabla.getSelectedIndex()]);//nombre de la tabla en la db
        ed.setAtributo(nombreAtributosTablas[comboBoxTabla.getSelectedIndex()][y]);//nombre del atributo a cambiar
        ed.setNombreColumna(tablaAux.getColumnName(y));//El nombre de la columna en la tabla
        ed.setValorActual(String.valueOf(tablaAux.getValueAt(x, y)));//El valor seleccionado
        ed.setValorPK1(String.valueOf(tablaAux.getValueAt(x, 0)));//El valor de la primera PK
        ed.setValorPK2(String.valueOf(tablaAux.getValueAt(x, 1)));//El valor de la segunda PK (o segundo atributo)
        ed.setPk1(nombreAtributosTablas[comboBoxTabla.getSelectedIndex()][0]);//El nombre del atributo del primer PK
        ed.setPk2(nombreAtributosTablas[comboBoxTabla.getSelectedIndex()][1]);//El nombre del segundo atributo
        
        ed.editarDatos();        
        actualizarInfoTabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboBoxCampoAEditar;
    private javax.swing.JComboBox<String> comboBoxTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
