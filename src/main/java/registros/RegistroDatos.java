/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import static conection_data_base.Consulta.consultaOrden;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
     * @param datos
     */
    public void registrarDatos(ArrayList<String> datos) {
        //creamos la orde a enviar
        String valores = "?";
        for(int i = 1; i < datos.size(); i++){
            valores = valores + ",?";
        }
        String orden = "INSERT INTO "+subOrden//Ingresamos en la tabla X, los valores Y (los valores son dados por la subOrden)
               + "VALUES ("+valores+")";
        registrarOrden(datos, orden);    //Enviamos la conexion de la DB, los datos a registrar y la orden a seguir  
    }
    
    /**
     * se actualiza la tabla en el atributo seleccioado donde
     * los datos sean pertenecientes a la pk
     * @param datos
     * @param tabla
     * @param atributo
     * @param pk 
     */
    public void actualizarDatos(ArrayList<String> datos, String tabla, String atributo, String pk) {
        //creamos la orden a enviar
        String orden = "UPDATE "+tabla+" SET "+atributo+ " = ? WHERE "+pk+" = ?";
        registrarOrden(datos, orden);    //Enviamos la conexion de la DB, los datos a registrar y la orden a seguir  
    }
    
    /**
     * Actualizamos datos para tablas con 2 primary keys
     * se actualiza la tabla en el atributo seleccioado donde
     * los datos sean pertenecientes a la pk
     * @param datos
     * @param tabla
     * @param atributo
     * @param pk
     * @param pk2 
     */
    public void actualizarDatos(ArrayList<String> datos, String tabla, String atributo, String pk, String pk2) {
        //creamos la orden a enviar
        String orden = "UPDATE "+tabla+" SET "+atributo+ " = ? WHERE "+pk+" = ? AND "+pk2+" = ?";
        registrarOrden(datos, orden);    //Enviamos la conexion de la DB, los datos a registrar y la orden a seguir  
    }
    
    
    /**
     * En esta funcion se verificará la existencia de un registro
     * returna true si existe
     * sino false
     * 
     * Recibe los siguientes parametros
     * @param orden
     * @param datos
     * @return
     * @throws SQLException 
     */
    public boolean verificarExistenciaRegisgtro(String orden, ArrayList<String> datos) throws SQLException{
         
        //creamos el ResultSet dentro del try catch para que se cierre automaticamente
        try (ResultSet rsPrueba = consultaOrden(datos, orden);){           
            while(rsPrueba.next()){//si existe el registro               
                return true;//returnamos true
            }   
        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR EL REGISTRO");
        }
        return false;
    }
    /**
     * Se obtiene un String[]
     * @param orden
     * @return 
     */
    
    public String[] obtenerDatos(String nombreTabla, String nombreColumna, String restricciones){
        String orden = "SELECT "+nombreColumna+" FROM "+nombreTabla+" "+restricciones;
        ArrayList<String> resultado = new ArrayList();
        //creamos el ResultSet dentro del try catch para que se cierre automaticamente
        try (ResultSet rsPrueba = consultaOrden(orden);){
            ResultSetMetaData rsmd = rsPrueba.getMetaData();//Obtenemos la metadata para las columnas    
            
            while(rsPrueba.next()){//si existe el siguiente registro obtenemos la informacion   
                //Creamos el Stirng[] auxiliar
                String aux = null;
                for(int i = 1; i <=  rsmd.getColumnCount(); i++){
                    aux = rsPrueba.getString(i);
                    resultado.add(aux);
                }
            } 

            return resultado.toArray(new String[0]);
        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR EL REGISTRO");
        }
        
        return null;
    }
    
    /**
     * Obtener datos de las tabla ingresada
     * @param nombreTabla
     * @return 
     */
    public String[][] obtenerDatos(String orden){       
        ArrayList<String[]> resultado = new ArrayList();
        //creamos el ResultSet dentro del try catch para que se cierre automaticamente
        try (ResultSet rsPrueba = consultaOrden(orden);){
            ResultSetMetaData rsmd = rsPrueba.getMetaData();//Obtenemos la metadata para las columnas    
            
            while(rsPrueba.next()){//si existe el siguiente registro obtenemos la informacion   
                //Creamos el Stirng[] auxiliar
                String[] aux = new String[rsmd.getColumnCount()];
                for(int i = 1; i <=  rsmd.getColumnCount(); i++){
                    aux[i - 1] = rsPrueba.getString(i);
                }
                resultado.add(aux);
            } 

            return resultado.toArray(new String[0][0]);
        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR EL REGISTRO");
        }
        
        return null;
    }
    
    /**
     * Obtener datos de las tabla ingresada
     * @param nombreTabla
     * @return 
     */
    public String[][] obtenerDatos(String orden, ArrayList<String> datos){       
        ArrayList<String[]> resultado = new ArrayList();
        //creamos el ResultSet dentro del try catch para que se cierre automaticamente
        try (ResultSet rsPrueba = consultaOrden(datos, orden);){
            ResultSetMetaData rsmd = rsPrueba.getMetaData();//Obtenemos la metadata para las columnas    
            
            while(rsPrueba.next()){//si existe el siguiente registro obtenemos la informacion   
                //Creamos el Stirng[] auxiliar
                String[] aux = new String[rsmd.getColumnCount()];
                for(int i = 1; i <=  rsmd.getColumnCount(); i++){
                    aux[i - 1] = rsPrueba.getString(i);
                }
                resultado.add(aux);
            } 

            return resultado.toArray(new String[0][0]);
        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR EL REGISTRO");
        }
        
        return null;
    }
    
    /**
     * En esta funcion se verificará la existencia de registros en alguna tabla
     * returna true si existen registros
     * sino false
     * 
     * Recibe los siguientes parametros
     * @param tabla
     * @return
     * @throws SQLException 
     */
    public boolean verificarExistenciaRegisgtro(String tabla) throws SQLException{
        String orden = "SELECT * FROM "+tabla;//Creamos la orden, verifica la existencia de registros en la tabla seleccionada 
        
        //Realizamos el ResultSet dentro del try catch
        try (ResultSet rsPrueba = consultaOrden(orden)){           
            while(rsPrueba.next()){//si existe el registro               
                return true;//returnamos true
            }   
        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR EL REGISTRO");
        }
        
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
