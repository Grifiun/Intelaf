/*
 * Entidad Producto
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Producto {
    private int codigo_producto;
    private int cantidad;
    private int precio;
    private String nombre_producto;
    private String fabricante;
    private String descripcion;
    private int garantia;
    private int codigo_tienda;

    public Producto(int codigo_producto, int cantidad, int precio, String nombre_producto, String fabricante, String descripcion, int garantia, int codigo_tienda) {
        this.codigo_producto = codigo_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre_producto = nombre_producto;
        this.fabricante = fabricante;
        this.descripcion = descripcion;
        this.garantia = garantia;
        this.codigo_tienda = codigo_tienda;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public int getCodigo_tienda() {
        return codigo_tienda;
    }

    public void setCodigo_tienda(int codigo_tienda) {
        this.codigo_tienda = codigo_tienda;
    }
    
    
}
