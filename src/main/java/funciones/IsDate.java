/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import funciones.IsNum;

/**
 *
 * @author grifiun
 */
public class IsDate {
    /**
     * Funcion que se encargara de virificar si la entrada es una fecha adecuada
     * @param fecha
     * @return 
     */
    public boolean isDate(String fecha){
        boolean error = false;
        String[] datosFecha = fecha.split("-");
        //Condicion 0: si son 3 palabras las que surgieron de la separacion por el guion "-"
        //dividimos la fecha en 3 partes, que serian
        //condicion 1/datosFecha[0] - Anio: XXXX
        //condicion 2/Mes: XX
        //condicion 3/Dia: XX

        if(datosFecha.length != 3 || datosFecha[0].length() != 4 || datosFecha[1].length() != 2 || datosFecha[2].length() != 2){
            error = true;
        }
        //Verificamos si todas las palabras son numeros
        for(int j = 0; j < datosFecha.length; j++){
            IsNum in = new IsNum();
            if(in.isNum(datosFecha[j], lectura_archivo_txt.LectorArchivo.ENTERO) == 0){
                error = true;
            }
        }   
    
        return error;
    }
}
