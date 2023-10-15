import java.util.List;
import java.util.ArrayList;

public class Celula implements Subject {
  private String nome;
  private int valor;
  private List<Observer> observadores;

  public Celula(String nome) {
    this.nome = nome;
    this.valor = 0;
    this.observadores = new ArrayList<Observer>();
  }

  public String getNome() {
    return this.nome;
  }

  public int getValor() {
    return this.valor;
  }

  public void setValor(int novoValor) {
    if (valor != novoValor) {
      valor = novoValor;
      notifyObservers();
    }
  }

  @Override
  public void addObserver(Observer observador) {
    observadores.add(observador);
  }

  @Override
  public void removeObserver(Observer observador) {
    observadores.remove(observador);
  }

  @Override
  public void notifyObservers() {
    for (Observer observador : observadores) {
      observador.update(this);
    }
  }
}
