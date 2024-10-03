package negocio;

import java.util.Objects;

public class Participante implements Observer {
    private String nome;
    private String status;
    private float lance;

    public Participante(String nome){
        this.nome = nome;
    }

    @Override
    public void update(String status) {
        this.status = status;
        System.out.println(this.nome + " foi notificado " + this.status);
    }

    public void darLance(float lance) {
        this.lance = lance;
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getLance() {
        return lance;
    }

    public void setLance(float lance) {
        this.lance = lance;
    }

    @Override
    public String toString() {
        return "Participante [nome=" + nome + ", status=" + status + ", lance=" + lance + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Participante other = (Participante) obj;
        if(lance == 0){
            if(other.lance != 0){
                return false;
            }
        } else if(lance != other.lance){
            return false;
        }

        if(nome == null){
            if(other.nome != null){
                return false;
            }
        } else if(!nome.equals(other.nome)){
            return false;
        }

        if(status == null){
            if(other.status != null){
                return false;
            }
        } else if(!status .equals(other.status)){
            return false;
        }
        return true;
    }
}
    
