
package negocio;

public class ComFaca  implements FormaDeLuta {

    private final int dano = 5;

    @Override
    public void lutar() {
        System.out.println("Lutando com Faca");
    }

     @Override
    public int getDano() {
        return dano;
    }

    
}
