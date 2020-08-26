/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exportado_de_tabla;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author grifiun
 */
public class ExportarTabla {
    private JTable tabla;
    private String[] tituloColumnas;
    private String tituloRegistro;
    private String encabezado;
    private String style = "<style>\n" +
                            "html {\n" +
                            "  font-family: sans-serif;\n" +
                            "  line-height: 1.15;\n" +
                            "  -webkit-text-size-adjust: 100%;\n" +
                            "  -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\n" +
                            "}\n" +
                            "\n" +
                            "article, aside, figcaption, figure, footer, header, hgroup, main, nav, section {\n" +
                            "  display: block;\n" +
                            "}\n" +
                            "\n" +
                            "body {\n" +
                            "  margin: 0;\n" +
                            "  font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, \"Noto Sans\", sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\", \"Segoe UI Symbol\", \"Noto Color Emoji\";\n" +
                            "  font-size: 1rem;\n" +
                            "  font-weight: 400;\n" +
                            "  line-height: 1.5;\n" +
                            "  color: #212529;\n" +
                            "  text-align: left;\n" +
                            "  background-color: #fff;\n" +
                            "}"+
                            "td{\n" +
                            "  align=\"center\"    \n" +
                            "}"+
                            "table {\n" +
                            "  border-collapse: collapse;\n" +
                            "}\n" +
                            "\n" +
                            ".table {\n" +
                            "  width: 100%;\n" +
                            "  margin-bottom: 1rem;\n" +
                            "  color: #212529;\n" +
                            "}\n" +
                            "\n" +
                            ".table th,\n" +
                            ".table td {\n" +
                            "  padding: 0.75rem;\n" +
                            "  vertical-align: top;\n" +
                            "  border-top: 1px solid #dee2e6;\n" +
                            "}\n" +
                            ".table thead th {\n" +
                            "  vertical-align: bottom;\n" +
                            "  border-bottom: 2px solid #dee2e6;\n" +
                            "}\n" +
                            "\n" +
                            ".table tbody + tbody {\n" +
                            "  border-top: 2px solid #dee2e6;\n" +
                            "}\n" +
                            "\n" +
                            ".table-sm th,\n" +
                            ".table-sm td {\n" +
                            "  padding: 0.3rem;\n" +
                            "}\n" +
                            ".table .thead-dark th {\n" +
                            "  color: #fff;\n" +
                            "  background-color: #343a40;\n" +
                            "  border-color: #454d55;\n" +
                            "}"+
                            ".table-light,\n" +
                            ".table-light > th,\n" +
                            ".table-light > td {\n" +
                            "  background-color: #fdfdfe;\n" +
                            "}\n" +
                            "\n" +
                            ".table-light th,\n" +
                            ".table-light td,\n" +
                            ".table-light thead th,\n" +
                            ".table-light tbody + tbody {\n" +
                            "  border-color: #fbfcfc;\n" +
                            "}"
                            +"</style>";
    public ExportarTabla(JTable tabla, String[] tituloColumnas, String tituloRegistro, String encabezado) {
        this.tabla = tabla;
        this.tituloColumnas = tituloColumnas;
        this.tituloRegistro = tituloRegistro;
        this.encabezado = encabezado;
    }
        
    public void exportar() {
        String codigoHTML;
        try {
            FileOutputStream fos = new FileOutputStream(tituloRegistro+".html");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Agregamos el codigo HTML a un String
           
            codigoHTML = "<!DOCTYPE html>"
                        +"<html>"
                            +"\n<head>\n"
                                +"\n<title>\n"
                                    +tituloRegistro
                                +"\n</title>"
                                +"\n<header align=\"center\">\n"
                                    +"\n<h2>\n"
                                    +encabezado
                                    +"\n</h2>"
                                +"\n</header>"
                                +style
                                +"<meta charset=\"UTF-8\">"
                            +"\n</head>"
                            +"\n<body>\n"
                                +generarTabla()
                            +"\n</body>"
                        +"\n</html>";
                    
            oos.writeUTF(codigoHTML);

            oos.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "se exporto de forma exitosa su tabla en html");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo exportar su tabla en html");
        }

    }
    /**
     * Generamos la tala
     * con etiquetas de html
     * recibimos el JTable de donde sacaremos todos los datos
     * y lo introduciremos a un String 
     * @param tabla
     * @return 
     */
    private String generarTabla() {
        String tablaHTML;
        tablaHTML = "\n<table class=\"table\" >"//inicamos la reacion de la tabla
                +"<thead class=\"thead-dark\">"
                +"\n<tr>";//agregamos la primera fila, que correspondera a los encabezados
        for(int i = 0; i < tituloColumnas.length; i++){//agregamos los encabezados            
            tablaHTML = tablaHTML + "\n<th>"+tituloColumnas[i]+"</th>";
        }
        tablaHTML = tablaHTML + "\n</tr>"//cerramos la primera fila
            +"</thead>"
            +"<tbody>";
        for(int i = 0; i < tabla.getRowCount(); i++){
            tablaHTML = tablaHTML + "\n<tr align=\"center\">";//nueva fila i
            for(int j = 0; j < tabla.getColumnCount(); j++){
                tablaHTML = tablaHTML + "\n<td >"+String.valueOf(tabla.getValueAt(i, j))+"</td>";//nueva casilla en una fila
            } 
            tablaHTML = tablaHTML + "\n</tr>";//cerramos la fila i
        }
        tablaHTML = tablaHTML + "</tbody>\n</table>";//cerramos la tabla
        
        return tablaHTML;//retornamos la tabla
    }
}