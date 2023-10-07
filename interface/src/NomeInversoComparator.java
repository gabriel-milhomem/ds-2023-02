import java.util.Comparator;

/**
 * Implementa comparador de estudade por nome em ordem inversa
 */
public class NomeInversoComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante e1, Estudante e2) {
        return e2.getNome().compareTo(e1.getNome());
    }
}