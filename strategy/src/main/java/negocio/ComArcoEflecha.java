package negocio;

public class ComArcoEflecha implements FormaDeLuta {

    private final int dano = 15;

    @Override
    public void lutar() {
        System.out.println("Lutando com Arco e Flecha");
    }
    

    @Override
    public int getDano() {
        return dano;
    }

    
    
}
