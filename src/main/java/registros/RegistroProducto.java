/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

/**
 *
 * @author grifiun
 */
public class RegistroProducto extends RegistroDatos{
    /**
     * Constructor de la carga de archivos de Producto
     */
    public RegistroProducto() {
        setSubOrden("Producto (nombre_producto, fabricante, codigo_producto, cantidad, precio, codigo_tienda)");
    }
    /**
     * establecemos la suborden
     */
    public RegistroProducto(String suborden) {
        setSubOrden(suborden);
    }
    
}
