package negocio;

public abstract class Personagem {
    
    protected String apelido;
    protected int vida = 100;
    protected FormaDeLuta formaDeLuta;
    
    
    public void atacar(Personagem alvo){
        formaDeLuta.lutar();
        int dano = formaDeLuta.getDano();
        alvo.receberDano(dano);
    }

    public void receberDano(int dano){
        this.vida -= dano;
        if(this.vida < 0){
            this.vida = 0;
        }
        System.out.println("Vida atual do Oponente " + vida);
    }

    public void setFormaDeLuta(FormaDeLuta formaDeLuta) {
        this.formaDeLuta = formaDeLuta;
    }

    @Override
    public String toString() {
        return apelido + " com " + formaDeLuta.getClass().getSimpleName() + " -vida: " + vida;
    }
    

}
