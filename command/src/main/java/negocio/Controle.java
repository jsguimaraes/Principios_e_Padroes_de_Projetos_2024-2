package negocio;

public class Controle {
    
    private final Command slots[];
    private int slotAtual;

    public Controle(){
        this.slots = new Command[4];
        for (int i = 0; i < this.slots.length; i++) {
           this.slots[i] = new NoCommand();           
       }
    }

    public void setSlot(int i, Command command){
        if (i >= 0 && i < this.slots.length) {
            this.slots[i] = command;
        } else {
            System.out.println("Slot inválido!");
        }
    }

    public void selecionarSlot(int i){
        if (i >= 0 && i < this.slots.length) {
            this.slotAtual = i;
            System.out.println("Slot " + i + " selecionado.");
        } else {
            System.out.println("Slot inválido!");
        }
    }

    public void botaoA(){
        this.slots[this.slotAtual].botaoA();
    }

    public void botaoB(){
        this.slots[this.slotAtual].botaoB();
    }

}
