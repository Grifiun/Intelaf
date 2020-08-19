/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import conection_data_base.Consulta;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public boolean verificarExistenciaRegisgtroTienda(java.sql.Connection conexion) throws SQLException{
        return verificarExistenciaRegisgtro(conexion, "Tienda");
    }
    
}
