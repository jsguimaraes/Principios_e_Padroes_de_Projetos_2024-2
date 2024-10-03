package negocio;

import java.util.List;

public class ExportaHTML extends ExportadorDeDados {

    @Override
    protected String precessarDados(List<String[]> dados) {
        StringBuilder s = new StringBuilder();
        s.append("<html><body><table border='1'>\n");
        for(String[] linha : dados){
            s.append("<tr>");
            for(String campo : linha){
                s.append("<td>").append(campo).append("</td>");
            }
            s.append("</tr\n>");
        }
        s.append("</table></body></html>");
        return s.toString();
    }

    
}
