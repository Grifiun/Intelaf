/*
 * Entidad compra
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Compra {
    private int codigo_compra;
    private int efectivo;
    private int credito_usado;
    private int precio_total;
    private int codigo_tienda;
    private String nit_cliente;
    private int codigo_pedido;

    public Compra(int codigo_compra, int efectivo, int credito_usado, int precio_total, int codigo_tienda, String nit_cliente, int codigo_pedido) {
        this.codigo_compra = codigo_compra;
        this.efectivo = efectivo;
        this.credito_usado = credito_usado;
        this.precio_total = precio_total;
        this.codigo_tienda = codigo_tienda;
        this.nit_cliente = nit_cliente;
        this.codigo_pedido = codigo_pedido;
    }

    public int getCodigo_compra() {
        return codigo_compra;
    }

    public void setCodigo_compra(int codigo_compra) {
        this.codigo_compra = codigo_compra;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public int getCredito_usado() {
        return credito_usado;
    }

    public void setCredito_usado(int credito_usado) {
        this.credito_usado = credito_usado;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }

    public int getCodigo_tienda() {
        return codigo_tienda;
    }

    public void setCodigo_tienda(int codigo_tienda) {
        this.codigo_tienda = codigo_tienda;
    }

    public String getNit_cliente() {
        return nit_cliente;
    }

    public void setNit_cliente(String nit_cliente) {
        this.nit_cliente = nit_cliente;
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }
    
    
}
