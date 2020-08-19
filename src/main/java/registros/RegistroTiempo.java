/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import static conection_data_base.Consulta.consultaOrden;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author grifiun
 */
public class RegistroTiempo extends RegistroDatos{
    /**
     * Registro para el Tiempo_envio
     */
    public RegistroTiempo() {
        setSubOrden("Tiempo_envio (tienda_1, tienda_2, tiempo)");
    }
    /**
     * Retorna el tiempo de la tienda 1 hacia la tienda 2
     * retorna 0 si no existe ese registro
     * retorna el tiempo si existe
     * @param conexion
     * @param tienda1
     * @param tienda2
     * @return
     * @throws SQLException 
     */
    public int revisarTiempo(java.sql.Connection conexion, String tienda1, String tienda2) throws SQLException{
        String orden = "SELECT tiempo FROM Tiempo_envio WHERE tienda_1= ? AND tienda_2 = ?";//Creamos la orden
        ArrayList<String> datos = new ArrayList();//creamos un ArrayList de tipo String
       
        datos.add(tienda1);//Agregamos "tienda1" al ArrayList datos
        datos.add(tienda2);//Agregamos "tienda2" al ArrayList datos
        int aux = 0;//creamos un booleano auxiliar con valor negativo
        ResultSet rsPrueba = null;
        rsPrueba = consultaOrden(conexion, datos, orden);        
        try {           
            while(rsPrueba.next()){//si el tiempo               
                aux = rsPrueba.getInt("tiempo");//el booleano es verdadero  
                
            }   
        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR EL TIEMPO");
        }
            
        rsPrueba.close();
        
            if(conexion.isClosed() == false)//si la conexion está abierta la cerramos
                conexion.close();            
        
        return aux;//retornamos el tiempo
    }
}
