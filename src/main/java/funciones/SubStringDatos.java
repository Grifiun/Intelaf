/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.ArrayList;

/**
 *
 * @author grifiun
 */
public class SubStringDatos {
    private String subOrden;
    private ArrayList<String> datos = new ArrayList();
    
    public SubStringDatos(String prefijo){
        subOrden = prefijo;
    }
    /**
     * Se revisa si paLAux no está vacío, de estarlo no se agregan 
     * datos, de no estaralo se agrega al subString el nombre del atributo
     * y al ArrayList de datos el dato
     * @param palAux
     * @param nombreAtributo
     */
    public void agregarSubStringYDato(String palAux, String nombreAtributo){
        if(palAux.isEmpty() == false){
            subOrden = subOrden + nombreAtributo;
            datos.add(palAux);
        }
    }

    public String getSubOrden() {
        return subOrden+")";
    }

    public ArrayList<String> getDatos() {
        return datos;
    }
    
    
}
