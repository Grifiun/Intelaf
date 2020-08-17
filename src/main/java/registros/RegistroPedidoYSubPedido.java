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
        datosPedido.add(aux);//agregamos el codigo de la tienda de destino
            
        
        if(verificarDireccionEnvio(datosPedido.get(1), datosPedido.get(2)) == false){//Si no existe el tiempod envio de la tienda 1 a la 2 se invierte su posicion
            String aux2, aux1;
            aux2 = datosPedido.get(1);
            aux1 = datosPedido.get(2);
            
            datosPedido.set(1, aux1);
            datosPedido.set(2, aux2);            
        }
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
            tiempo = regT.revisarTiempo(conection_data_base.EnlaceJDBC.EnlaceJDBC(), tienda1, tienda2);
            System.out.println(tiempo);
            if(tiempo > 0){
                System.out.println("TRUE");
                return true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroPedidoYSubPedido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(RegistroPedidoYSubPedido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(RegistroPedidoYSubPedido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
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
                try {
                    if(regP.revisarExistenciaPedido(conection_data_base.EnlaceJDBC.EnlaceJDBC(), datosPedido.get(0)) == true){
                        System.out.println("Ya esta registrado ese pedido, por lo tanto solo seran agregado el subpedido");
                    }else{                
                        regP.registrarDatos(conection_data_base.EnlaceJDBC.EnlaceJDBC(), datosPedido);
                    }
                } catch (SQLException ex) {
                    System.out.println("ERROR SQL");
                }
                
            } catch (ClassNotFoundException ex) {
                System.out.println("CLASSNOTFOUND");
            } catch (InstantiationException ex) {
                System.out.println("INSTANCIA");
            } catch (IllegalAccessException ex) {
                System.out.println("ACCESO ILEGAL");
            }
            
            /**
             * Registramos el subpedido
             */
            try {
                try {
                    if(regP.revisarExistenciaPedido(conection_data_base.EnlaceJDBC.EnlaceJDBC(), datosPedido.get(0)) == true){
                        regSP.registrarDatos(conection_data_base.EnlaceJDBC.EnlaceJDBC(), subDatos);
                    }                
                } catch (SQLException ex) {
                    System.out.println("ERROR EN EL INGRESO DEL SUBPEDIDO");
                }
                
            } catch (ClassNotFoundException ex) {
                System.out.println("NOT FOUND EX");
            } catch (InstantiationException ex) {
                System.out.println("INSTANCIA");
            } catch (IllegalAccessException ex) {
                System.out.println("ACCESO ILEGAL");
            }
    }
    
}
