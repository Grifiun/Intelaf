/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection_data_base;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author grifiun
 */
public class Consulta {
    public static boolean mensajesEmergentes = true;
    /**
     * Funcion encargada de realizar peticiones de tipo Update
     * Recibe los parametros de conexion, datos y orden
     * de tipo ArrayList<String> y String
     * @param datos
     * @param orden
     * @return 
     */
    public static void registrarOrden(ArrayList<String> datos, String orden){     
        
        try {           
           crearDeclaracionPreparada(datos, orden).executeUpdate(); //Ejecutamos la orden de tipo Query creada a partir de la orden y datos dados
            if(mensajesEmergentes){
                JOptionPane.showMessageDialog(null, "REGISTRO COMPLETO");
            }
        } catch (SQLException ex) {
            if(mensajesEmergentes){
                JOptionPane.showMessageDialog(null, "ERROR AL REALIZAR EL REGISTRO, REVISE LA ENTRADA DE DATOS ES POSIBLE\nQUE HAYA CONFLICTOS DE TIPOS DE DATOS");
            }
            System.out.println("\nNO SE HIZO EL REGISTRO, POSIBLES ERRORES: DUPLICACION DE PK"); //Imprimimos el error en consola en caso de fallar           
        }  
    } 
    /**
     * Funcion encargada de realizar un Query, devuelve un resultSet
     * @param datos
     * @param orden
     * @return 
     */
    public static ResultSet consultaOrden(ArrayList<String> datos, String orden){
        ResultSet rsPrueba = null;
        try {            
            rsPrueba = crearDeclaracionPreparada(datos, orden).executeQuery(); //realizamos la consulta de la orden dada            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rsPrueba;
    }
    
    /**
     * Funcion encargada de realizar un Query simple, devuelve un resultSet
     * a diferencia de la otra funcion, esta no recibe datos
     * @param orden
     * @return 
     */
    public static ResultSet consultaOrden(String orden){
         ResultSet rsPrueba = null;
        try {           
           rsPrueba = crearDeclaracionPreparada(orden).executeQuery(); //realizamos la consulta de la orden dada           
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
     * @param datos
     * @param orden
     * @return 
     */
    public static PreparedStatement crearDeclaracionPreparada(ArrayList<String> datos, String orden){
        try {
            PreparedStatement dp = null;
            dp = conection_data_base.EnlaceJDBC.getConexion().prepareStatement(orden); //asignamos el select que trae el String orden         
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
     * @param orden
     * @return 
     */
    public static PreparedStatement crearDeclaracionPreparada(String orden){
        PreparedStatement dp = null;
        try {
            dp = conection_data_base.EnlaceJDBC.getConexion().prepareStatement(orden);
            return dp;
        } catch (SQLException ex) {
            System.out.println("\nERROR AL CREAR EL DP SIMPLE");
        }
        return null;
    }
    
}
