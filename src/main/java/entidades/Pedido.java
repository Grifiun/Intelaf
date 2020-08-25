/*
 * Entidad Pedido
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Pedido {
   private String codigo_pedido;
   private String total;
   private String estado;
   private String fecha;
   private String anticipo;
   private String codigo_tienda_origen;
   private String codigo_tienda_destino;
   private String nit_cliente;
   private String credito_usado;

    public Pedido(String codigo_pedido, String total, String estado, String fecha, String anticipo, String codigo_tienda_origen, String codigo_tienda_destino, String nit_cliente, String credito_usado) {
        this.codigo_pedido = codigo_pedido;
        this.total = total;
        this.estado = estado;
        this.fecha = fecha;
        this.anticipo = anticipo;
        this.codigo_tienda_origen = codigo_tienda_origen;
        this.codigo_tienda_destino = codigo_tienda_destino;
        this.nit_cliente = nit_cliente;
        this.credito_usado = credito_usado;
    }

    public String getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(String codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(String anticipo) {
        this.anticipo = anticipo;
    }

    public String getCodigo_tienda_origen() {
        return codigo_tienda_origen;
    }

    public void setCodigo_tienda_origen(String codigo_tienda_origen) {
        this.codigo_tienda_origen = codigo_tienda_origen;
    }

    public String getCodigo_tienda_destino() {
        return codigo_tienda_destino;
    }

    public void setCodigo_tienda_destino(String codigo_tienda_destino) {
        this.codigo_tienda_destino = codigo_tienda_destino;
    }

    public String getNit_cliente() {
        return nit_cliente;
    }

    public void setNit_cliente(String nit_cliente) {
        this.nit_cliente = nit_cliente;
    }

    public String getCredito_usado() {
        return credito_usado;
    }

    public void setCredito_usado(String credito_usado) {
        this.credito_usado = credito_usado;
    }

   
}
