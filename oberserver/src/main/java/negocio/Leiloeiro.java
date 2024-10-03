package negocio;

import java.util.ArrayList;
import java.util.List;

public class Leiloeiro implements Subject {
    
    private List<Observer> observers = new ArrayList<>();
    private boolean lanceValido;
    private float lanceMaximo;
    private String nomeParticipante;
    private String status;
    private boolean iniciar;
    private Participante participanteMaiorLanceAtualizado;
    private Participante participanteMaiorLance;

    
    public Leiloeiro() {
        this.lanceMaximo = 0f;
        this.nomeParticipante = "";
        this.status = "";
        this.lanceValido = false;
        this.iniciar = false;
    }

    

    public List<Observer> getObservers() {
        return observers;
    }



    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }



    public boolean isLanceValido() {
        return lanceValido;
    }



    public void setLanceValido(boolean lanceValido) {
        this.lanceValido = lanceValido;
    }



    public float getLanceMaximo() {
        return lanceMaximo;
    }



    public void setLanceMaximo(float lanceMaximo) {
        this.lanceMaximo = lanceMaximo;
    }



    public String getNomeParticipante() {
        return nomeParticipante;
    }



    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }



    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        this.status = status;
    }



    public boolean isIniciar() {
        return iniciar;
    }



    public void setIniciar(boolean iniciar) {
        this.iniciar = iniciar;
    }



    public Participante getParticipanteMaiorLanceAtualizado() {
        return participanteMaiorLanceAtualizado;
    }



    public void setParticipanteMaiorLanceAtualizado(Participante participanteMaiorLanceAtualizado) {
        this.participanteMaiorLanceAtualizado = participanteMaiorLanceAtualizado;
    }



    public Participante getParticipanteMaiorLance() {
        return participanteMaiorLance;
    }



    public void setParticipanteMaiorLance(Participante participanteMaiorLance) {
        this.participanteMaiorLance = participanteMaiorLance;
    }



    @Override
    public void addSubscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String notificacao) {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(notificacao);
        }
    }

    @Override
    public void changeState(Object object) {
        Participante participanteLeilao = (Participante) object;
        this.nomeParticipante = participanteLeilao.getNome();
        if(participanteLeilao.getLance() > this.lanceMaximo){
            this.lanceValido = true;
            if(this.participanteMaiorLance != null){
                if(!this.participanteMaiorLance.equals(participanteLeilao)){
                    this.participanteMaiorLance = this.participanteMaiorLanceAtualizado;
                }
            }
            this.lanceMaximo = participanteLeilao.getLance();
            this.participanteMaiorLanceAtualizado = participanteLeilao;
            this.status = "Lance do(a) " + this.nomeParticipante + " Valor R$" + participanteLeilao.getLance();
            notifyObservers(this.status);
        } else{
            this.lanceValido = false;
            this.status = "Lance do(a) " + this.nomeParticipante + " Valor R$" + participanteLeilao.getLance() + " Foi menor";
            notifyObservers(this.status);
        }
        
    }

    public void iniciaLeilao(){
        if(observers.size() > 1 && !this.iniciar){
            System.out.println("Iniciado o Leilão");
            iniciar = true;
        } else if(this.iniciar){
            System.out.println("O Leilão Ja começou");
        } else{
            System.out.println("Impossivel começar Leilão com 1 participante");
        }

    }

    public void terminaLeilao(){
        if(this.iniciar && this.participanteMaiorLanceAtualizado != null){
            System.out.println("Leilão Finalizado");
            this.iniciar = false;
            this.status = "Leilão Finalizado. " + this.participanteMaiorLanceAtualizado.getNome() + " Foi o comprador.";
        } else if(this.iniciar && this.participanteMaiorLanceAtualizado == null){
            this.iniciar = false;
            this.status = "Nenhum Comprador apareceu";
        }
        notifyObservers(this.status);
    }
    
}
