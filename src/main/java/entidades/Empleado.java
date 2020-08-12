/*
 * Entidad Empleado
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Empleado {
    private int codigo_empleado;
    private String nombre_empleado;
    private String dpi;
    private String correo_empleado;
    private String dirreccion_empleado;
    private String nit_empleado;
    private String telefono_empleado;
    private int codigo_tienda;

    public Empleado(int codigo_empleado, String nombre_empleado, String dpi, String correo_empleado, String dirreccion_empleado, String nit_empleado, String telefono_empleado, int codigo_tienda) {
        this.codigo_empleado = codigo_empleado;
        this.nombre_empleado = nombre_empleado;
        this.dpi = dpi;
        this.correo_empleado = correo_empleado;
        this.dirreccion_empleado = dirreccion_empleado;
        this.nit_empleado = nit_empleado;
        this.telefono_empleado = telefono_empleado;
        this.codigo_tienda = codigo_tienda;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getCorreo_empleado() {
        return correo_empleado;
    }

    public void setCorreo_empleado(String correo_empleado) {
        this.correo_empleado = correo_empleado;
    }

    public String getDirreccion_empleado() {
        return dirreccion_empleado;
    }

    public void setDirreccion_empleado(String dirreccion_empleado) {
        this.dirreccion_empleado = dirreccion_empleado;
    }

    public String getNit_empleado() {
        return nit_empleado;
    }

    public void setNit_empleado(String nit_empleado) {
        this.nit_empleado = nit_empleado;
    }

    public String getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setTelefono_empleado(String telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }

    public int getCodigo_tienda() {
        return codigo_tienda;
    }

    public void setCodigo_tienda(int codigo_tienda) {
        this.codigo_tienda = codigo_tienda;
    }
    
    
}
