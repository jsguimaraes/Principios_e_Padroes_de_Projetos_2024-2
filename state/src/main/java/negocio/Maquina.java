package negocio;

public class Maquina {
    
    private String marca;
    private String modelo;

    private MaquinaState estado;
    private int contMoedas;
    private int contGomas;

    public Maquina(String marca, String modelo, int contGomas){
        this.marca = marca;
        this.modelo = modelo;
        this.contGomas = contGomas;
        this.contMoedas = 0;
        this.estado = new MaquinaSemMoeda(this);

    }

    public void inserirMoeda(){
        this.estado = this.estado.comMoeda();
    }
    public void ejetarMoeda(){
        this.estado = this.estado.semMoeda();
    }
    public void acionarAlavanca(){
       this.estado = this.estado.comGoma();
    }
    public void entregarGoma(){
        this.estado = this.estado.semGoma();
    }
    public void setEstado(MaquinaState estado) {
        this.estado = estado;
    }
    public int getContGomas() {
        return contGomas;
    }

    public int getContMoedas() {
        return contMoedas;
    }

    public void adicionarMoeda() {
        this.contMoedas++;
    }
    public void liberarGoma() {
        if (contGomas != 0) {
            contGomas--;
            System.out.println("Uma goma está saindo...");
        } else {
            System.out.println("Ops, acabaram as gomas!");
            estado = new MaquinaSemGoma(this);
        }
    }
    public void recarregar(int numeroGomas) {
        contGomas += numeroGomas;
        System.out.println("Máquina recarregada; gomas disponíveis: " + contGomas);
        estado = new MaquinaSemMoeda(this); // Reseta para o estado inicial se tiver gomas
    }

}
