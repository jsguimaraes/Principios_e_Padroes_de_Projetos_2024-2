package negocio;

import java.util.List;

public class ExportaTXT extends ExportadorDeDados {

    @Override
    protected String precessarDados(List<String[]> dados) {
        StringBuilder s = new StringBuilder();
        for(String[] linha : dados){
            s.append(String.join(", ", linha)).append("\n");
        }
        return s.toString();
    }
    
    
}
