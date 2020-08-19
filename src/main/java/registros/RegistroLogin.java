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
 * Clase encargada del login 
 * @author grifiun
 */
public class RegistroLogin extends RegistroDatos{
    /**
     * Se verifica el tipo de rol que tiene el cliente con el codigo de usuario
     * @param conexion
     * @param codigoUsuario
     * @return
     * @throws SQLException 
     */
    public String tipoUsuario(String codigoUsuario) throws SQLException{
        String rolUser = "";        
        //instanciamos
        RegistroEmpleado regEmp = new RegistroEmpleado();
        RegistroCliente regCliente = new RegistroCliente();
        
        if(regEmp.verificarExistenciaEmpleado(codigoUsuario)){//Si existe en la tabla de Empleado retornamos empleado
            rolUser = "Empleado";
        }else if(regCliente.verificarExistenciaCliente(codigoUsuario)){//Si existe en la tabla de Cliente retornamos cliente
            rolUser = "Cliente";
        }
        
        return rolUser;
    }
}
