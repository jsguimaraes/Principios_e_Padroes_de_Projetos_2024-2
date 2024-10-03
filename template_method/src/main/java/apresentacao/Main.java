package apresentacao;



import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import negocio.ExportaHTML;
import negocio.ExportaSQL;
import negocio.ExportaTXT;
import negocio.ExportaXML;
import negocio.ExportadorDeDados;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        URL resource = Main.class.getClassLoader().getResource("entrada.csv");
        if (resource == null) {
            System.err.println("Arquivo entrada.csv não encontrado!");
            return;
        }
        
        String caminho = null;
        try {
            caminho = new File(resource.toURI()).getPath();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return;
        }

        ExportadorDeDados exportaTXT = new ExportaTXT();
        exportaTXT.parseDataAndGenerateOutput(caminho, "saida.txt");
        
        ExportadorDeDados exportaHTML = new ExportaHTML();
        exportaHTML.parseDataAndGenerateOutput(caminho, "saida.html");
        
        ExportadorDeDados exportaXML = new ExportaXML();
        exportaXML.parseDataAndGenerateOutput(caminho, "saida.xml");
        
        ExportadorDeDados exportaSQL = new ExportaSQL();
        exportaSQL.parseDataAndGenerateOutput(caminho, "saida.sql");
    }
}




