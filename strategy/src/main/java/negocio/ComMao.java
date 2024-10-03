package negocio;

public class ComMao implements FormaDeLuta {

    private final int dano = 1;

    @Override
    public void lutar() {
        System.out.println("Lutando com as Mãos");
    }

     @Override
    public int getDano() {
        return dano;
    }

}
