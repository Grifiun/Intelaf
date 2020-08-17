/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.util.ArrayList;

/**
 *
 * @author grifiun
 */
public class RegistroDatos extends conection_data_base.Consulta{
    private String subOrden = "";
    /**
     * Registra los datos sen una tabla especificada en subOrden
     * @param conexion
     * @param datos
     * @param subOrden 
     */
    public void registrarDatos(java.sql.Connection conexion, ArrayList<String> datos) {
        //creamos la orde a enviar
        String valores = "?";
        for(int i = 1; i < datos.size(); i++){
            valores = valores + ",?";
        }
        String orden = "INSERT INTO "+subOrden//Ingresamos en la tabla X, los valores Y (los valores son dados por la subOrden)
               + "VALUES ("+valores+")";
        registrarOrden(conexion, datos, orden);    //Enviamos la conexion de la DB, los datos a registrar y la orden a seguir  
    }
    /**
     * Setter 
     * @param subOrden 
     */
    public void setSubOrden(String subOrden) {
        this.subOrden = subOrden;
    }
    
    
}
