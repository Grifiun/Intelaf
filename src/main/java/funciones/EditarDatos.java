/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import registros.RegistroDatos;

/**
 *
 * @author grifiun
 */
public class EditarDatos {
    private String pk1;
    private String pk2 = null;
    private String atributo;
    private String nuevoValor;
    private String valorActual;
    private String valorPK1;
    private String valorPK2;
    private String tablaRegistro;
    private String nombreTabla;
    private String nombreColumna;
   /**
   * Dentro de esta funcion se pedira informacion nueva
   * para reemplzar el dato de la anterior tabla
   */
    public void editarDatos(){
        ArrayList<String> auxArray = new ArrayList();
        nuevoValor = JOptionPane.showInputDialog(null, "Tabla a modificar: "+nombreTabla+//Muestra un JOption pane
                "\nAtributo a modificar: "+nombreColumna+//Obtiene el nombre de la columa seleccionada
                "\nValor actual: "+valorActual+
                "\nIngrese el nuevo valor: ");   
        auxArray.add(nuevoValor);
        auxArray.add(valorPK1);//agregamos el primer valor de la primera columa, corresponde a la PK
        RegistroDatos rd = new RegistroDatos();
        if(pk2 != null){
            auxArray.add(valorPK2);//si es el tiempo de envio se agrega una segunda PK
            //agregamos los siguientes datos:
            //Datos
            //Nombre de la tabla a modificar
            //nombre atributo a modificar
            //PK1
            //PK2
            rd.actualizarDatos(auxArray, tablaRegistro, atributo, pk1, pk2);
        }else{                
            //agregamos los siguientes datos:
            //Datos
            //Nombre de la tabla a modificar
            //nombre atributo a modificar
            //PK1
            rd.actualizarDatos(auxArray, tablaRegistro, atributo, pk1);
        }
    }

    public void setPk1(String pk1) {
        this.pk1 = pk1;
    }

    public void setPk2(String pk2) {
        this.pk2 = pk2;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public void setValorActual(String valorActual) {
        this.valorActual = valorActual;
    }

    public void setValorPK1(String valorPK1) {
        this.valorPK1 = valorPK1;
    }

    public void setValorPK2(String valorPK2) {
        this.valorPK2 = valorPK2;
    }

    public void setNombreColumna(String nombreColumna) {
        this.nombreColumna = nombreColumna;
    }

    public void setTablaRegistro(String tablaRegistro) {
        this.tablaRegistro = tablaRegistro;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    
    
}
