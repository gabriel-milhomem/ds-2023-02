import java.util.Comparator;

/**
 * Implementa comparador de estudade por idade.
 */
public class IdadeComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante e1, Estudante e2) {
        return Integer.compare(e1.getIdade(), e2.getIdade());
    }
}