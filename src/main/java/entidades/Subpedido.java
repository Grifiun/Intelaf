/*
 * Entidad subpedido
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Subpedido {
    private String codigo_subpedido;
    private String cantidad;
    private String subtotal;
    private String codigo_pedido;
    private String codigo_producto;

    public Subpedido(String cantidad, String subtotal, String codigo_pedido, String codigo_producto) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.codigo_pedido = codigo_pedido;
        this.codigo_producto = codigo_producto;
    }

    public String getCodigo_subpedido() {
        return codigo_subpedido;
    }

    public void setCodigo_subpedido(String codigo_subpedido) {
        this.codigo_subpedido = codigo_subpedido;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(String codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    
    
}
