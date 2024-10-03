package negocio;

public class ComMachado implements FormaDeLuta {

    private final int dano = 10;

    @Override
    public void lutar() {
        System.out.println("Lutando com Machado");
    }
    
     @Override
    public int getDano() {
        return dano;
    }
        
}
