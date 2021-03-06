/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase utilizada para registrar tanto pedidos como subpedidos
 * @author grifiun
 */
public class RegistroPedidoYSubPedido {
    private ArrayList<String> datosPedido = new ArrayList();
    private ArrayList<String> subDatos = new ArrayList();//Seran los datos de los subpedidos
    public RegistroPedidoYSubPedido(ArrayList<String> datosPedido) {
        subDatos.add(datosPedido.get(0));//Agregamos el codigo del pedido
        subDatos.add(datosPedido.get(5));//Agregamos el codigo del articulo
        datosPedido.remove(5);//removemos el codigo del articulo de los datos 
        subDatos.add(datosPedido.get(5));//Agregamos la cantidad del articulo
        datosPedido.remove(5);//removemos la cantidad del articulo
        subDatos.add(datosPedido.get(5));//Agregamos el subtotal o total por producto
        datosPedido.remove(5);//removemos el subtotal   
        String aux = datosPedido.get(2);            
        
        this.datosPedido = datosPedido;        
        
    }
    /**
     * Se verifica la direccion en la cual se envia el pedido
     * @param tienda1
     * @param tienda2
     * @return 
     */
    public boolean verificarDireccionEnvio(String tienda1, String tienda2){   
        int tiempo;
        try {
            RegistroTiempo regT = new RegistroTiempo();
            tiempo = regT.revisarTiempo(tienda1, tienda2);//revisamos la existencia del tiempo entre las tiendas, de existir            
            if(tiempo >= 0){
                return true;
            }
        }catch (SQLException ex) {
            Logger.getLogger(RegistroPedidoYSubPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    } 
    
    /**
     * Realizamos los respectivos registros
     */
    public void registrarPedidoYSubPedido(){        
            RegistroPedido regP = new RegistroPedido();
            RegistroSubPedido regSP = new RegistroSubPedido();  
                        
            /**
             * Registramos el pedido
             */
            try {
                if(regP.revisarExistenciaPedido(datosPedido.get(0)) == true){//Revisamos la existencia del registro del pedido
                    System.out.println("Ya esta registrado ese pedido, por lo tanto solo seran agregado el subpedido");//si ya esta registrado no dubpplicamos el registro
                }else{                
                    regP.registrarDatos(datosPedido);//si no hay registro se crea uno nuevo
                }    
            } catch (SQLException ex) {
                Logger.getLogger(RegistroPedidoYSubPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            /**
             * Registramos el subpedido
             */
            try {            
                if(regP.revisarExistenciaPedido(datosPedido.get(0)) == true){//Si hay existencia del pedido
                    regSP.registrarDatos(subDatos);//se hace registro del subpedido
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegistroPedidoYSubPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
    
}
