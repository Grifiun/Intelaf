/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import entidades.Tienda;
import java.sql.SQLException;
import java.util.Random;

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
     * Registro de la tienda con una subOrden establecida por fuera
     * @param subOrdenAux 
     */
    public RegistroTienda(String subOrdenAux){
        setSubOrden(subOrdenAux);
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
    
    /**
     * Generamos un nuevo codigo
     * @return 
     */
    public String generarCodigoTienda(){
        
        Random r = new Random();
        String codigo = "";
        int valorDado;
        
        for(int i = 0; i < 5; i++){
            if(i == 3){
                codigo = codigo+"-";//Agregamos el guion
            }else if(i == 4){
                valorDado = r.nextInt(100)+1;//generamos un numero aleatorio correspondiente al final del codigo
                codigo = codigo+String.valueOf(valorDado);    
            }else{
                valorDado = r.nextInt(26)+1+64;//generamos un numero aleatorio correspondiente a una letra en mayuscula
                codigo = codigo+String.valueOf((char)valorDado);            
            }            
        }          
        return codigo;
    }
}
