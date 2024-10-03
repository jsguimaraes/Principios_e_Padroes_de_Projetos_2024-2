package negocio;

public class Cavaleiro extends Personagem {

    public Cavaleiro(String apelido) {
        this.apelido = apelido;
        this.formaDeLuta = new ComMao();
    }

    
}
