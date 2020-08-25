/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grifiun
 */
public class RegistroPedido extends RegistroDatos{
    /**
     * Se registran los pedidos
     */
    public RegistroPedido() {
        setSubOrden("Pedido (codigo_pedido, codigo_tienda_1, codigo_tienda_2, fecha, nit_cliente, anticipo, codigo_tienda_destino)");        
    }
    
    /**
     * Se registran los pedidos
     */
    public RegistroPedido(String suborden) {
        setSubOrden(suborden);        
    }
    
    /**
     * Funcion de tipo booleano
     * Si es verdadero entonces ya existe un Pedido con ese codigo
     * Si es falso entonces aun no existe un Pedido con ese codigo
     * @param codigo_pedido
     * @return
     * @throws SQLException 
     */
    public boolean revisarExistenciaPedido(String codigo_pedido) throws SQLException{
        String orden = "SELECT codigo_pedido FROM Pedido WHERE codigo_pedido=?";//Creamos la orden
        ArrayList<String> datos = new ArrayList();//creamos un ArrayList de tipo String
       
        datos.add(codigo_pedido);//Agregamos "codigo_pedido" al ArrayList datos
        boolean aux = false;//creamos un booleano auxiliar con valor negativo
        
        //Creamos el ResultSet dentro del Try para que se cierre automaticamente
        try (ResultSet rsPrueba = consultaOrden(datos, orden)) {
            while(rsPrueba.next()){//si el tiempo     
                aux = true;//el booleano es verdadero                
                System.out.println("COD_PEDIDO: "+codigo_pedido);
                return aux;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR ANTES DE CERRAR EL RS ");
        }
        return aux;//retornamos el booleano
    }
}
