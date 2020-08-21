/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import graficos.MenuPrincipal;
import java.sql.SQLException;
import paneles.PanelEmpleado;

/**
 * Clase encargada del login 
 * tambien redirige a los paneles de Empleado o cliente
 * @author grifiun
 */
public class RegistroLogin extends RegistroDatos{
    /**
     * Se verifica el tipo de rol que tiene el cliente con el codigo de usuario
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
            //instanaciamos el panel empleado
            PanelEmpleado panelEmpleado = new PanelEmpleado();
            MenuPrincipal.cargarPanel(panelEmpleado);//mostramaos en el contenedor de paneles
            
            rolUser = "Empleado";
        }else if(regCliente.verificarExistenciaCliente(codigoUsuario)){//Si existe en la tabla de Cliente retornamos cliente
            rolUser = "Cliente";
        }
        
        return rolUser;
    }
}
