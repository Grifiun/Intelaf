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
public class RegistroEmpleado extends RegistroDatos{
    /**
     * Registro de los datos desde la carga de datos
     */
    public RegistroEmpleado() {
        setSubOrden("Empleado (nombre_empleado, codigo_empleado, telefono_empleado, dpi)");
    }
    
    /**
     * Se revisa la existencia del empleado con el codigo enviado
     */
    public boolean verificarExistenciaEmpleado(String codigo){
        boolean existe = false;
        String orden = "SELECT codigo_empleado FROM Empleado WHERE codigo_empleado = ?";
        ArrayList<String> datos = new ArrayList();
        datos.add(codigo);
        
        try {
            existe = verificarExistenciaRegisgtro(conection_data_base.EnlaceJDBC.EnlaceJDBC(), orden, datos);//se retorna si existe el empleado o no
            return existe;
        } catch (SQLException ex) {
            Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return existe;
    }
    
}
