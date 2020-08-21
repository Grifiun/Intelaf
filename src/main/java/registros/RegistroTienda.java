/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.sql.SQLException;

/**
 *
 * @author grifiun
 */
public class RegistroTienda extends  RegistroDatos{
    /**
     * Registro para la carga de datos del archivo de texto
     */
    public RegistroTienda() {
        setSubOrden("Tienda (nombre_tienda, direccion_tienda, codigo_tienda, telefono_1)");
    }
    
    /**
     * Verifica si existen registro en la tabla Tienda
     * @param conexion
     * @return
     * @throws SQLException 
     */
    public boolean verificarExistenciaRegisgtroTienda() throws SQLException{
        return verificarExistenciaRegisgtro("Tienda");
    }
    
}
