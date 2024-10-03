
package negocio;

public interface Subject {

    public void addSubscribe(Observer observer);
    public void removeSubscribe(Observer observer);
    public void notifyObservers(String notificacao);
    public void changeState(Object object);

    
}
