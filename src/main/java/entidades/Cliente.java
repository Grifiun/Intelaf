/*
 * Entidad Cliente
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Cliente {
    private String nit;
    private String nombre_cliente;
    private String telefono_cliente;
    private String correo_cliente;
    private String dirreccion_cliente;
    private String dpi;
    private int credito;

    public Cliente(String nit, String nombre_cliente, String telefono_cliente, String correo_cliente, String dirreccion_cliente, String dpi, int credito) {
        this.nit = nit;
        this.nombre_cliente = nombre_cliente;
        this.telefono_cliente = telefono_cliente;
        this.correo_cliente = correo_cliente;
        this.dirreccion_cliente = dirreccion_cliente;
        this.dpi = dpi;
        this.credito = credito;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getDirreccion_cliente() {
        return dirreccion_cliente;
    }

    public void setDirreccion_cliente(String dirreccion_cliente) {
        this.dirreccion_cliente = dirreccion_cliente;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    
}
