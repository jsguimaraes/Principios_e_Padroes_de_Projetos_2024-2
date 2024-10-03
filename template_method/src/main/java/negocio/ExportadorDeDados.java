package negocio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class ExportadorDeDados {

    public final void parseDataAndGenerateOutput(String caminhoArquivoEntrada, String caminhoArquivoSaida){
        List<String[]> dados = lerDados(caminhoArquivoEntrada);
        String dadosProcessados = precessarDados(dados);
        exportarDados(dadosProcessados, caminhoArquivoSaida);
    }

    private List<String[]> lerDados(String caminhoArquivo) {
        List<String[]> dados = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha;
            while((linha = br.readLine()) != null){
                String[] campos = linha.split(";");
                dados.add(campos);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return dados;
    }
    
    protected abstract String precessarDados(List<String[]> dados);
    
    
    private void exportarDados(String dadosProcessados, String caminhoArquivoSaida) {
        try(FileWriter saida = new FileWriter(caminhoArquivoSaida)){
            saida.write(dadosProcessados);
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
