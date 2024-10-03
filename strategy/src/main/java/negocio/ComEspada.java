
package negocio;

public class ComEspada implements FormaDeLuta {

    private final int dano = 20;

    @Override
    public void lutar() {
        System.out.println("Lutando com Espada");
    }
    
     @Override
    public int getDano() {
        return dano;
    }
}
