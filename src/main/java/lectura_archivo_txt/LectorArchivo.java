/*
 * Esta clase tiene como finalidad leer la informacion
 * dentro de un archivo de texto y después guardarlos
 * en la DB
 */
package lectura_archivo_txt;
import java.io.*;
/**
 *
 * @author grifiun
 */
public class LectorArchivo {
    /**
     * En esta funcion se cargara el archivo de texto
     * recibe como parametro el archivo seleccionado
     */
   public void leerArchivo(File archivo){
        try{//se agrega un capturador de errores 
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            System.out.println(br.readLine()); 
            String aux = "";
            
            //Leemos y analizamos todaas las lineas de texto del archivo (linea por linea)
            while(aux != null){
                aux = br.readLine();
                if(aux == null)
                    break;
                System.out.println(aux);
            }
        }catch(Exception e){
            System.out.println("Hubo un error en la carga de archivo");
        }   
   }
}
