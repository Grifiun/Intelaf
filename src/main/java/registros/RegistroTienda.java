/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import conection_data_base.Consulta;
import java.util.ArrayList;

/**
 *
 * @author grifiun
 */
public class RegistroTienda {
    public static void registrarTienda(java.sql.Connection conexion, ArrayList<String> datos) {
        //creamos la orde a enviar
       String orden = "INSERT INTO Tienda (correo, nombre_tienda, direccion_tienda, codigo_tienda, telefono_1)"
               + "VALUES (?,?,?,?,?)";
        Consulta.registrarOrden(conexion, datos, orden);    //Enviamos la conexion de la DB, los datos a registrar y la orden a seguir  
        
    }
}
