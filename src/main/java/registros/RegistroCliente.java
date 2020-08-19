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
 *
 * @author grifiun
 */
public class RegistroCliente extends RegistroDatos{
    /**
     * Se registran los datos cargados del archivo de texto
     */
    public RegistroCliente(){
        setSubOrden("Cliente (nombre_cliente, nit, telefono_cliente, credito)");
    }
    
    
    /**
     * Se revisa la existencia del cliente con el nit enviado
     */
    public boolean verificarExistenciaCliente(String nit){
        boolean existe = false;
        String orden = "SELECT nit FROM Cliente WHERE nit = ?";
        ArrayList<String> datos = new ArrayList();
        datos.add(nit);
        
        try {
            existe = verificarExistenciaRegisgtro(conection_data_base.EnlaceJDBC.EnlaceJDBC(), orden, datos);//se retorna si existe el cliente o no
            return existe;
        } catch (SQLException ex) {
            Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(RegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(RegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return existe;
    }
}
