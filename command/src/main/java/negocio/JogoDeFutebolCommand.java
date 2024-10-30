package negocio;

public class JogoDeFutebolCommand implements Command {
    
    private final JogoDeFutebol jogoDeFutebol;

    public JogoDeFutebolCommand(JogoDeFutebol jogoDeFutebol) {
        this.jogoDeFutebol = jogoDeFutebol;
    }

    @Override
    public void botaoA() {
       this.jogoDeFutebol.correr(); 
    }

    @Override
    public void botaoB() {
        this.jogoDeFutebol.parar();
    }


}
