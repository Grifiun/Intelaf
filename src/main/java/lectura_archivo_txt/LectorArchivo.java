/*
 * Esta clase tiene como finalidad leer la informacion
 * dentro de un archivo de texto y después guardarlos
 * en la DB
 */
package lectura_archivo_txt;
import conection_data_base.Consulta;
import funciones.IsDate;
import funciones.IsNum;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import registros.RegistroCliente;
import registros.RegistroDatos;
import registros.RegistroEmpleado;
import registros.RegistroPedidoYSubPedido;
import registros.RegistroProducto;
import registros.RegistroTiempo;
import registros.RegistroTienda;
/**
 *
 * @author grifiun
 */
public class LectorArchivo {
    public static final String NOMBRE = "nombre "; 
    public static final String NINGUNO = "ninguno";
    public static final String DIRECCION = "direccion ";
    public static final String FABRICANTE = "fabricante ";
    public static final String ENTERO = "num";
    public static final String DECIMAL = "decimal";
    public static final String FECHA = "fecha";
    public static final String TIENDA = "TIENDA";
    public static final String TIEMPO = "TIEMPO";
    public static final String PRODUCTO = "PRODUCTO";
    public static final String EMPLEADO = "EMPLEADO";
    public static final String CLIENTE = "CLIENTE";
    public static final String PEDIDO = "PEDIDO";
    
    public static final String ERROR_ENTRADA_DATOS = "Error en la entrada de datos";
    public static final String ERROR_TIPO_DATOS = "Error en el tipo de datos";
   
    /**
     * En esta funcion se cargara el archivo de texto
     * recibe como parametro el archivo seleccionado
     */
    public void leerArchivo(File archivo){
        //desactivamos los mensajes de los ingresos de cada registro
        Consulta.mensajesEmergentes = false;
        try{//se agrega un capturador de errores 
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String aux = "";
            
            //Leemos y analizamos todaas las lineas de texto del archivo (linea por linea)
            while(aux != null){
                aux = br.readLine();
                if(aux == null){
                    break;
                }
                analizarTipoDato(aux);
            }
            //Mostramos el mensaje         
            RegistroTienda rt = new RegistroTienda();
            if(rt.verificarExistenciaRegisgtroTienda()){
                JOptionPane.showMessageDialog(null, "Archivo leido y almacenado, reinicie el programa");
            }else{
                JOptionPane.showMessageDialog(null, "Archivo leido pero hay un error en la entrada");
            }
            
            
            
        }catch(Exception e){
            System.out.println("Hubo un error en la carga de archivo");
            JOptionPane.showMessageDialog(null, "Error en la carga leido");
            
        }   
    }
   
    /**
     * Esta funcion tendra como finalidad agregar las restricciones
     * de cada dato/cadena segun el tipo de registro
     * recibe como parametro el conjunto de datos de una linea en un bloc de texto
     * @param linea 
     */
    public void analizarTipoDato(String linea) throws ClassNotFoundException{
        boolean validacionTipo = true;//Dato que nos servira para validar la primera cadena de caracteres
        String[] auxCadenas;   // contendra el conjunto de datos
        String restricciones = "";//contendra las distintas restricciones de cada tipo
        auxCadenas = linea.split(",");  
        RegistroDatos registrar = null;//Instanciamos la clase padre de los registros        
            switch(auxCadenas[0]){
                case TIENDA:
                    //DATOS: Nombre(String), Direccion(String), Codigo(String), Telefono(String)                    
                    restricciones = NOMBRE+"-"+DIRECCION+"-"+NINGUNO+"-"+ENTERO;
                    registrar = new RegistroTienda();
                    break;
                case TIEMPO:
                    //DATOS: Tienda1(String), Tienda2(String), Tiempo(int)
                    restricciones = NINGUNO+"-"+NINGUNO+"-"+ENTERO;
                    registrar = new RegistroTiempo();
                    break;
                case PRODUCTO:
                    //DATOS: Nombre(String), Fabricante(String), Codigo(String), Cantidad(int), Precio(Decimal), Tienda(String)
                    restricciones = NOMBRE+"-"+FABRICANTE+"-"+NINGUNO+"-"+ENTERO+"-"+DECIMAL+"-"+NINGUNO;
                    registrar = new RegistroProducto();
                    break;
                case EMPLEADO:
                    //DATOS: Nombre(String), CodigoEmpleado(int), Telefono(int), DPI(int)
                    restricciones = NOMBRE+"-"+ENTERO+"-"+ENTERO+"-"+ENTERO;
                    registrar = new RegistroEmpleado();
                    break;
                case CLIENTE:
                    //DATOS: Nombre(String), NIT(String), Telefono(int), Credito(Decimal)
                    restricciones = NOMBRE+"-"+NINGUNO+"-"+ENTERO+"-"+DECIMAL;
                    registrar = new RegistroCliente();
                    break;
                case PEDIDO:
                    //Codigo(int), Tienda1(String), Tienda2(String), Fecha(Fecha), Cliente(String), -Articulo(String), -Cantidad(int), -Total(Decimal), Anticipo(Decimal)
                    restricciones = ENTERO+"-"+NINGUNO+"-"+NINGUNO+"-"+FECHA+"-"+NINGUNO+"-"+NINGUNO+"-"+ENTERO+"-"+DECIMAL+"-"+DECIMAL;                    
                    break;
                default:
                    validacionTipo = false;
                    System.out.println(ERROR_ENTRADA_DATOS);
                    break;
            }
            if(validacionTipo == true){    
                boolean er = analizarRestricciones(auxCadenas, restricciones.split("-"));
                if(er == true)
                    System.out.println("ERROR EN LA LINEA: "+linea);
                else{                    
                    ArrayList<String> arrayListAux;                            
                    arrayListAux = new ArrayList<String>(Arrays.asList(auxCadenas));//Agregamos los datos del String[] a un arrayList
                    arrayListAux.remove(0);//REMOVEMOS EL IDENTIFICADOR                           
                    
                    if(auxCadenas[0].equalsIgnoreCase(PEDIDO) == false){//Si no es del tipo PEdido se registra de forma general
                        registrar.registrarDatos(arrayListAux);//registramos los datos en la db     
                    }
                    else{//Si es del tipo pedido se asigna de forma especial
                        RegistroPedidoYSubPedido regPdSp = new RegistroPedidoYSubPedido(arrayListAux);
                        regPdSp.registrarPedidoYSubPedido();
                    } 
                }      
            }
            
    }    
    
    
    /**
     * Funcion que nos permitira remover partes de
     * la cadena de caracteres que no nos sean útiles
     * 
     * Recibe de parametro la cadena completa y el sub_conjunto de datos a buscar
     * Ej: 
     * Cadena principal: "Nombre A"
     * sub_conjunto: "Nombre "
     * resultado: "A"
     * @param cad
     * @param subCad
     * @return 
     */
    private String removerSubCadena(String cad, String subCad){
        String resultado = "";
        if(cad.toLowerCase().startsWith(subCad)){//Verifica si la cadena comienza con la subcadena (ignorando si son mayus o minus)
            resultado = cad.substring(subCad.length());//Remueve la parte de la subcadena de la cadena
        }
        //cad.replaceFirst(subCad, "");
        return resultado;
    }
    
    /**
     * Dentro de esta funcion se iran a analizar todas las restricciones de los datos
     * se retorna false si no hay errores
     * se retorna true si hay errores
     * @param cadenas
     * @param restricciones 
     */
    private boolean analizarRestricciones(String[] cadenas, String[] restricciones){
        boolean existenciaErrores = false;
        if((cadenas.length - 1) == restricciones.length){//Comparamos si son tienen la misma cantidad de cadenas ignorando el tipo de registro
            for(int i = 0; i < restricciones.length; i++){
                //En este apartado removemos los indicativos de que tipo de dato son
                if(restricciones[i].equalsIgnoreCase(NOMBRE) || restricciones[i].equalsIgnoreCase(PRODUCTO)|| restricciones[i].equalsIgnoreCase(FABRICANTE)){//Si tiene la restriccion nombre
                    cadenas[i + 1] = removerSubCadena(cadenas[i + 1], restricciones[i]);//Se remueve el texto innecesario
                }else if(restricciones[i].equalsIgnoreCase(ENTERO)){//si la restrccion es de que sea un numero entero
                    //si son numeros enteros hay que verificar su validez
                    IsNum in = new IsNum();//instanciamos
                    if(in.isNum(cadenas[i + 1], ENTERO) == 0){
                        System.out.println(cadenas[i+1]);
                        System.out.println("ERROR ENTERO");
                        existenciaErrores = true;//Si retorna 0 es porque no es un entero, por lo que hay error
                    }
                }else if(restricciones[i].equalsIgnoreCase(DECIMAL)){
                    //Si es decimal removemos el primer "." encontrado, y luego miramos si son numeros
                    IsNum in = new IsNum();//instanciamos
                    if(in.isNum(cadenas[i + 1], DECIMAL) == 0){//Removemos el primer "." para que sea un numero normal
                        System.out.println(ERROR_TIPO_DATOS);
                        existenciaErrores = true;
                    }
                }else if(restricciones[i].equalsIgnoreCase(FECHA)){
                    //instanciamos
                    IsDate isd = new IsDate();
                    //Aca revisamos si fueron ingresados de forma correcta
                    existenciaErrores = isd.isDate(cadenas[i + 1]);              
                }
            }       
        }else{
            existenciaErrores = true;
        }
        return existenciaErrores;
    }   
    
}
