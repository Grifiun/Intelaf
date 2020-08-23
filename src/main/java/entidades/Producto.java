/*
 * Entidad Producto
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Producto {
    private String codigo_producto;
    private String cantidad;
    private String precio;
    private String nombre_producto;
    private String fabricante;
    private String descripcion;
    private String garantia;
    private String codigo_tienda;

    public Producto(String codigo_producto, String cantidad, String precio, String nombre_producto, String fabricante, String descripcion, String garantia, String codigo_tienda) {
        this.codigo_producto = codigo_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre_producto = nombre_producto;
        this.fabricante = fabricante;
        this.descripcion = descripcion;
        this.garantia = garantia;
        this.codigo_tienda = codigo_tienda;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
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

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getCodigo_tienda() {
        return codigo_tienda;
    }

    public void setCodigo_tienda(String codigo_tienda) {
        this.codigo_tienda = codigo_tienda;
    }
    
    
}
