import java.util.Comparator;

/**
 * Implementa comparador de estudade por media.
 */
public class MediaComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante e1, Estudante e2) {
        return Double.compare(e1.getMedia(), e2.getMedia());
    }
}