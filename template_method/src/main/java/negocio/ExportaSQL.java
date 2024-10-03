package negocio;

import java.util.List;

public class ExportaSQL extends ExportadorDeDados {

    @Override
    protected String precessarDados(List<String[]> dados) {
        StringBuilder s = new StringBuilder();
        s.append("DROP DATABASE IF EXISTS cadastro;\n\n")
        .append("CREATE DATABASE cadastro;")
        .append("\\c cadastro;\n")
        .append("CREATE TABLE pessoa(cpf CHARACTER VARYING(11), nome CHARACTER VARYING(100), idade INT);\n\n");
        for (String[] linha : dados) {
            s.append("INSERT INTO pessoa (cpf, nome, idade) VALUES ('")
            .append(linha[0]).append("', '")
            .append(linha[1]).append("', ")
            .append(linha[2]).append(");\n");
        }
        return s.toString();
    }
        
}
