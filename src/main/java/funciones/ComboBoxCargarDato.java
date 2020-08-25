/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import conection_data_base.Consulta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import paneles.PanelCreacionEmpleado;

/**
 *
 * @author grifiun
 */
public class ComboBoxCargarDato{
    /**     * 
     * Funcion principal, recibe el nombre del campo a obtener
     * y el nombre de la tabla a obtener
     * @param nombreCampo
     * @param nombreTabla
     * @return 
     */
    public JComboBox cargar(String nombreCampo, String nombreTabla) {
        JComboBox cbox = new JComboBox();
        try(ResultSet rs = Consulta.consultaOrden("SELECT "+nombreCampo+" FROM "+nombreTabla)){
            //Agregamos los codigos del atributo al comboBox
            while(rs.next()){
                cbox.addItem(rs.getString(nombreCampo));
            }
            return cbox;
        } catch (SQLException ex) {
            Logger.getLogger(PanelCreacionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    /**
     * Similar al anterior, en esta funcion lo unico que cambia es que 
     * esta carga los datos del campo dado en la tabla dada, sin embargo solo
     * donde el campo2 tenga un valor equivalente al valor dado
     * @param nombreCampo
     * @param nombreTabla
     * @param nombreCampo2
     * @param valorCampo2
     * @return 
     */
    public JComboBox cargar(String nombreCampo, String nombreTabla, String nombreCampo2, String valorCampo2) {
        JComboBox cbox = new JComboBox();
        ArrayList<String> datos = new ArrayList();
        datos.add(valorCampo2);//agregamos el valor del campo dado
        try(ResultSet rs = Consulta.consultaOrden(datos, "SELECT "+nombreCampo+" FROM "+nombreTabla+" WHERE "+nombreCampo2+" = ?")){
            //Agregamos los codigos del atributo al comboBox
            while(rs.next()){
                cbox.addItem(rs.getString(nombreCampo));
            }
            return cbox;
        } catch (SQLException ex) {
            Logger.getLogger(PanelCreacionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
