/*
 * Entidad subpedido
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Subpedido {
    private int codigo_subpedido;
    private int cantidad;
    private int subtotal;
    private int codigo_pedido;
    private int codigo_producto;

    public Subpedido(int codigo_subpedido, int cantidad, int subtotal, int codigo_pedido, int codigo_producto) {
        this.codigo_subpedido = codigo_subpedido;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.codigo_pedido = codigo_pedido;
        this.codigo_producto = codigo_producto;
    }

    public int getCodigo_subpedido() {
        return codigo_subpedido;
    }

    public void setCodigo_subpedido(int codigo_subpedido) {
        this.codigo_subpedido = codigo_subpedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }
    
    
}
