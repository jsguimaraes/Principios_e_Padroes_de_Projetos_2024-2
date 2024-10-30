package apresentacao;

import negocio.Controle;
import negocio.JogoDeCorrida;
import negocio.JogoDeCorridaCommand;
import negocio.JogoDeFutebol;
import negocio.JogoDeFutebolCommand;
import negocio.JogoDeLuta;
import negocio.JogoDeLutaCommand;
import negocio.JogoDeObstaculos;
import negocio.JogoDeObstaculosCommand;

public class Main {
    public static void main(String[] args) {
        
        JogoDeCorrida jogoDeCorrida = new JogoDeCorrida();
        JogoDeFutebol jogoDeFutebol = new JogoDeFutebol();
        JogoDeLuta jogoDeLuta = new JogoDeLuta();
        JogoDeObstaculos jogoDeObstaculos = new JogoDeObstaculos();
        
        JogoDeCorridaCommand corridaCommand = new JogoDeCorridaCommand(jogoDeCorrida);
        JogoDeFutebolCommand futebolCommand = new JogoDeFutebolCommand(jogoDeFutebol);
        JogoDeLutaCommand lutaCommand = new JogoDeLutaCommand(jogoDeLuta);
        JogoDeObstaculosCommand obstaculosCommand = new JogoDeObstaculosCommand(jogoDeObstaculos);
        
        Controle controle = new Controle();
        controle.setSlot(0, corridaCommand);
        controle.setSlot(1, futebolCommand);
        controle.setSlot(2, lutaCommand);
        controle.setSlot(3, obstaculosCommand);
        
        controle.selecionarSlot(0); 
        controle.botaoA();
        controle.botaoB();
        
        controle.selecionarSlot(1); 
        controle.botaoA();
        controle.botaoB();
        
        controle.selecionarSlot(2); 
        controle.botaoA();
        controle.botaoB();
        
        controle.selecionarSlot(3); 
        controle.botaoA();
        controle.botaoB();
    }
}