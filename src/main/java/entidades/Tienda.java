/*
 *Entidad tienda
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Tienda {
    private String codigo_tienda;
    private String nombre_tienda;
    private String direccion_tienda;
    private String telefono_1;
    private String telefono_2;
    private String horario;
    private String correo; 

    public Tienda(String codigo_tienda, String nombre_tienda, String direccion_tienda, String telefono_1, String telefono_2, String horario, String correo) {
        this.codigo_tienda = codigo_tienda;
        this.nombre_tienda = nombre_tienda;
        this.direccion_tienda = direccion_tienda;
        this.telefono_1 = telefono_1;
        this.telefono_2 = telefono_2;
        this.horario = horario;
        this.correo = correo;
    }

    public String getCodigo_tienda() {
        return codigo_tienda;
    }

    public void setCodigo_tienda(String codigo_tienda) {
        this.codigo_tienda = codigo_tienda;
    }

    public String getNombre_tienda() {
        return nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
    }

    public String getDireccion_tienda() {
        return direccion_tienda;
    }

    public void setDireccion_tienda(String direccion_tienda) {
        this.direccion_tienda = direccion_tienda;
    }

    public String getTelefono_1() {
        return telefono_1;
    }

    public void setTelefono_1(String telefono_1) {
        this.telefono_1 = telefono_1;
    }

    public String getTelefono_2() {
        return telefono_2;
    }

    public void setTelefono_2(String telefono_2) {
        this.telefono_2 = telefono_2;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
