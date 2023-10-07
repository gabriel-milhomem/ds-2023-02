import java.util.Comparator;

/**
 * Implementa comparador de estudade por nome em ordem alfabetica
 */
public class NomeComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante e1, Estudante e2) {
        return e1.getNome().compareTo(e2.getNome());
    }
}