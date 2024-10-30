package negocio;

public class JogoDeCorridaCommand implements  Command{

    private final JogoDeCorrida jogoDeCorrida;

    public JogoDeCorridaCommand(JogoDeCorrida jogoDeCorrida) {
        this.jogoDeCorrida = jogoDeCorrida;
    }

    @Override
    public void botaoA() {
        this.jogoDeCorrida.acelerar();
    }

    @Override
    public void botaoB() {
        this.jogoDeCorrida.frear();
    }
    

}
