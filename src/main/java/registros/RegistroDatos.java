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
     * En esta funcion se verificará la existencia de un registro
     * returna true si existe
     * sino false
     * 
     * Recibe los siguientes parametros
     * @param conexion
     * @param orden
     * @param datos
     * @return
     * @throws SQLException 
     */
    public boolean verificarExistenciaRegisgtro(java.sql.Connection conexion, String orden, ArrayList<String> datos) throws SQLException{
         
        ResultSet rsPrueba = null;
        rsPrueba = consultaOrden(conexion, datos, orden);      //Realizamos el ResultSet  
        try {           
            while(rsPrueba.next()){//si existe el registro               
                return true;//returnamos true
            }   
        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR EL REGISTRO");
        }
            
        rsPrueba.close();//ceramos el ResultSet
        
        if(conexion.isClosed() == false)//si la conexion está abierta la cerramos
            conexion.close();            
        
        return false;
    }
    
    /**
     * En esta funcion se verificará la existencia de registros en alguna tabla
     * returna true si existen registros
     * sino false
     * 
     * Recibe los siguientes parametros
     * @param conexion
     * @param orden
     * @return
     * @throws SQLException 
     */
    public boolean verificarExistenciaRegisgtro(java.sql.Connection conexion, String tabla) throws SQLException{
        String orden = "SELECT * FROM "+tabla;//Creamos la orden, verifica la existencia de registros en la tabla seleccionada 
        
        ResultSet rsPrueba = null;
        rsPrueba = consultaOrden(conexion, orden);      //Realizamos el ResultSet  
        try {           
            while(rsPrueba.next()){//si existe el registro               
                return true;//returnamos true
            }   
        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR EL REGISTRO");
        }
            
        rsPrueba.close();//ceramos el ResultSet
        
        if(conexion.isClosed() == false)//si la conexion está abierta la cerramos
            conexion.close();            
        
        return false;
    }
    
    
    
    /**
     * Setter 
     * @param subOrden 
     */
    public void setSubOrden(String subOrden) {
        this.subOrden = subOrden;
    }
    
    
}
