/*
 * Entidad Pedido
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Pedido {
   private int codigo_pedido;
   private int total;
   private String estado;
   private String fecha;
   private int anticipo;
   private int codigo_tienda_origen;
   private int codigo_tienda_destino;
   private String nit_cliente;

    public Pedido(int codigo_pedido, int total, String estado, String fecha, int anticipo, int codigo_tienda_origen, int codigo_tienda_destino, String nit_cliente) {
        this.codigo_pedido = codigo_pedido;
        this.total = total;
        this.estado = estado;
        this.fecha = fecha;
        this.anticipo = anticipo;
        this.codigo_tienda_origen = codigo_tienda_origen;
        this.codigo_tienda_destino = codigo_tienda_destino;
        this.nit_cliente = nit_cliente;
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
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

    public int getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(int anticipo) {
        this.anticipo = anticipo;
    }

    public int getCodigo_tienda_origen() {
        return codigo_tienda_origen;
    }

    public void setCodigo_tienda_origen(int codigo_tienda_origen) {
        this.codigo_tienda_origen = codigo_tienda_origen;
    }

    public int getCodigo_tienda_destino() {
        return codigo_tienda_destino;
    }

    public void setCodigo_tienda_destino(int codigo_tienda_destino) {
        this.codigo_tienda_destino = codigo_tienda_destino;
    }

    public String getNit_cliente() {
        return nit_cliente;
    }

    public void setNit_cliente(String nit_cliente) {
        this.nit_cliente = nit_cliente;
    }

   
}
