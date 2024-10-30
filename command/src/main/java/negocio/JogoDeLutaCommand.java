package negocio;

public class JogoDeLutaCommand implements Command {

    private final JogoDeLuta jogoDeLuta;

    public JogoDeLutaCommand(JogoDeLuta jogoDeLuta) {
        this.jogoDeLuta = jogoDeLuta;
    }

    @Override
    public void botaoA() {
        this.jogoDeLuta.atacar();
    }

    @Override
    public void botaoB() {
        this.jogoDeLuta.defender();
    }
}
