import java.util.List;
import java.util.ArrayList;

class Planilha {
  private List<Celula> celulas = new ArrayList<Celula>();

  public Celula adicionarCelula(String nome) {
    Celula celula = new Celula(nome);
    celulas.add(celula);
    return celula;
  }
}