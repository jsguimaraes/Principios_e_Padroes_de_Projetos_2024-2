package negocio;

import java.util.List;

public class ExportaXML extends ExportadorDeDados {

    @Override
    protected String precessarDados(List<String[]> dados) {
       StringBuilder s = new StringBuilder();
       s.append("<dados>\n");
        for(String[] linha : dados){
            s.append(" <linha>\n");
            for(int i = 0; i < linha.length; i++){
                s.append("  <campo").append(i + 1).append(">").append(linha[i]).append("</campo").append(i + 1).append(">\n");
            }
            s.append("  </linha>\n");
        }
        s.append("</dados>");
        return s.toString();
    }
    
}
