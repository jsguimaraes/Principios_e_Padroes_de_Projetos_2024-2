package negocio;

public class JogoDeObstaculosCommand implements Command{
    
    private final JogoDeObstaculos jogoDeObstaculos;

    public JogoDeObstaculosCommand(JogoDeObstaculos jogoDeObstaculos) {
        this.jogoDeObstaculos = jogoDeObstaculos;
    }

    @Override
    public void botaoA() {
        this.jogoDeObstaculos.pular();
    }

    @Override
    public void botaoB() {
        this.jogoDeObstaculos.baixar();
    }
}
