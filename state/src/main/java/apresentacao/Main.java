package apresentacao;

import negocio.Maquina;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Maquina maquina = new Maquina("MarcaX", "ModeloY", 5);
        
        maquina.inserirMoeda();
        maquina.acionarAlavanca();
        
        maquina.inserirMoeda();
        maquina.ejetarMoeda();
        
        maquina.inserirMoeda();
        maquina.acionarAlavanca();
        maquina.acionarAlavanca(); // Tenta acionar sem inserir moeda
    }
}