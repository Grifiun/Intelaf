/*
 * Entidad compra
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Compra {
    private String codigo_compra;
    private String efectivo;
    private String credito_usado;
    private String precio_total;
    private String codigo_tienda;
    private String nit_cliente;
    private String codigo_pedido;
    
    public Compra(String codigo_compra, String credito_usado, String precio_total, String codigo_tienda, String nit_cliente, String codigo_pedido) {
        this.codigo_compra = codigo_compra;
        System.out.println("Compra: "+this.codigo_compra);
        this.efectivo = String.valueOf(Double.parseDouble(precio_total) - Double.parseDouble(credito_usado));
        System.out.println("Efectivo: "+this.efectivo);
        this.credito_usado = credito_usado;
        System.out.println("Credito usado: "+this.credito_usado);
        this.precio_total = precio_total;
        this.codigo_tienda = codigo_tienda;
        this.nit_cliente = nit_cliente;
        this.codigo_pedido = codigo_pedido;
    }

    public String getCodigo_compra() {
        return codigo_compra;
    }

    public void setCodigo_compra(String codigo_compra) {
        this.codigo_compra = codigo_compra;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public String getCredito_usado() {
        return credito_usado;
    }

    public void setCredito_usado(String credito_usado) {
        this.credito_usado = credito_usado;
    }

    public String getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(String precio_total) {
        this.precio_total = precio_total;
    }

    public String getCodigo_tienda() {
        return codigo_tienda;
    }

    public void setCodigo_tienda(String codigo_tienda) {
        this.codigo_tienda = codigo_tienda;
    }

    public String getNit_cliente() {
        return nit_cliente;
    }

    public void setNit_cliente(String nit_cliente) {
        this.nit_cliente = nit_cliente;
    }

    public String getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(String codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }
    
    
}
