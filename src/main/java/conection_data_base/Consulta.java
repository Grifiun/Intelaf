/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection_data_base;

import funciones.IsNum;
import static funciones.IsNum.isNum;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grifiun
 */
public class Consulta {     
   /**
     * Funcion encargada de realizar peticiones de tipo Update
     * Recibe los parametros de conexion, datos y orden
     * de tipo java.sql.Connection, ArrayList<String> y String
     * @param conexion
     * @param datos
     * @param orden
     * @return 
     */
    public static void registrarOrden(java.sql.Connection conexion, ArrayList<String> datos, String orden){
        try {           
           crearDeclaracionPreparada(conexion, datos, orden).executeUpdate(); //Ejecutamos la orden de tipo Query creada a partir de la orden y datos dados
           if(conexion.isClosed() == false)//si la conexion está abierta la cerramos
                conexion.close();
        } catch (SQLException ex) {
            System.out.println("\nNO SE HIZO EL REGISTRO, POSIBLES ERRORES: DUPLICACION DE PK"); //Imprimimos el error en consola en caso de fallar           
        }  
    } 
    /**
     * Funcion encargada de realizar un Query, devuelve un resultSet
     * @param conexion
     * @param datos
     * @param orden
     * @return 
     */
    public static ResultSet consultaOrden(java.sql.Connection conexion, ArrayList<String> datos, String orden){
         ResultSet rsPrueba = null;
        try {           
           rsPrueba = crearDeclaracionPreparada(conexion, datos, orden).executeQuery(); //realizamos la consulta de la orden dada           
        } catch (SQLException ex) {
            System.out.println("\nERROR EN LA CONSULTA "+ex); //Imprimimos el error en consola en caso de fallar           
        }         
        return rsPrueba;
    }

    /**
     * Funcion encargada de crear y retornar una declaracion preparada con la
     * orden "orden" de tipo String, con los datos dados en el arrayList
     * de tipo ArrayList<String> y en la conexion "conexion" de tipo 
     * java.sql.Connection
     * @param conexion
     * @param datos
     * @param orden
     * @return 
     */
    public static PreparedStatement crearDeclaracionPreparada(java.sql.Connection conexion, ArrayList<String> datos, String orden){
        try {
            PreparedStatement dp = null;
            dp = conexion.prepareStatement(orden); //asignamos el select que trae el String orden         
            //int esUnEntero, esUnDecimal;
            for(int i = 1; i <= datos.size(); i++){//asignamos los valores del arrayList datos en cada campo del select
                String aux = null;                   
                aux = datos.get(i - 1);
                dp.setString(i, aux);                          
            }
            return dp;
        } catch (SQLException ex) {
            System.out.println("\nERROR AL CREAR EL DP"); //Imprimimos el error en consola en caso de fallar           
        } 
        return null;
    }
    /**
     * Funcion encargada de realizar una consulta simple
     * recibe la conexion de java.sql.Connection además
     * de la orden para retornar el PreparedStatement
     * @param conexion
     * @param orden
     * @return 
     */
    public static PreparedStatement crearDeclaracionPreparadaSimple(java.sql.Connection conexion, String orden){
        PreparedStatement dp = null;
        try {
            dp = conexion.prepareStatement(orden);
            return dp;
        } catch (SQLException ex) {
            System.out.println("\nERROR AL CREAR EL DP SIMPLE");
        }
        return null;
    }
    
}
