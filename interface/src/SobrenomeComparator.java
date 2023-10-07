import java.util.Comparator;

/**
 * Implementa comparador de estudade por sobrenome.
 */
public class SobrenomeComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante e1, Estudante e2) {
        return e1.getSobrenome().compareTo(e2.getSobrenome());
    }
}