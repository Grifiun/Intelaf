/*
 * Entidad Tiempo_envio
 */
package entidades;

/**
 *
 * @author grifiun
 */
public class Tiempo_envio {
    private String tienda_1;
    private String tienda_2;
    private String tiempo;

    public Tiempo_envio(String tienda_1, String tienda_2, String tiempo) {
        this.tienda_1 = tienda_1;
        this.tienda_2 = tienda_2;
        this.tiempo = tiempo;
    }

    public String getTienda_1() {
        return tienda_1;
    }

    public void setTienda_1(String tienda_1) {
        this.tienda_1 = tienda_1;
    }

    public String getTienda_2() {
        return tienda_2;
    }

    public void setTienda_2(String tienda_2) {
        this.tienda_2 = tienda_2;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
    
}
