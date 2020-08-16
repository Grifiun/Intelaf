/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author grifiun
 */
public class IsNum {
    protected static final String ENTERO = "num";
    protected static final String DECIMAL = "decimal";
    /**
     * Funcion que nos permitira ver si una variable es un entero
     * @param palabra
     * 
     * recibe de parametro la cadena de caracteres a analizar
     * tipo:
     * 0: double
     * 1: integer
     * @return 
     */
    public static int isNum(String palabra, String tipo) {
        int resultado;//declaramos la variable a retornar
        try {
            if(tipo.equalsIgnoreCase(DECIMAL))
                Double.parseDouble(palabra);//convertimos la palabra a Integer
            else if(tipo.equalsIgnoreCase(ENTERO))
                Long.parseLong(palabra);//convertimos la palabra a Integer            
            resultado = 1;//Si no hay un error entonces es un numero y retornamos true
        } catch (NumberFormatException excepcion) {//de lo contrario es una palabra
            resultado = 0;
        }
        return resultado;//retornamos el valor
    }
}
