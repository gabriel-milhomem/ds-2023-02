import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class EstudanteTest {
    private Estudante[] estudantes;

    @Before
    public void setUp() {
        estudantes = new Estudante[] {
            new Estudante("Alice", "Silva", 20, new double[] {85, 90, 78}),
            new Estudante("Bob", "Santos", 22, new double[] {75, 88, 92}),
            new Estudante("Carol", "Oliveira", 19, new double[] {92, 85, 88}),
            new Estudante("David", "Pereira", 21, new double[] {80, 85, 90})
        };
    }

    @Test
    public void testOrdenacaoPorNome() {
        Arrays.sort(estudantes, new NomeComparator());
        
        assertEquals("Alice Silva (Idade: 20, Média: 84.33333333333333)", estudantes[0].toString());
        assertEquals("Bob Santos (Idade: 22, Média: 85.0)", estudantes[1].toString());
        assertEquals("Carol Oliveira (Idade: 19, Média: 88.33333333333333)", estudantes[2].toString());
        assertEquals("David Pereira (Idade: 21, Média: 85.0)", estudantes[3].toString());
    }

    @Test
    public void testOrdenacaoPorNomeInverso() {
        Arrays.sort(estudantes, new NomeInversoComparator());
        
        assertEquals("David Pereira (Idade: 21, Média: 85.0)", estudantes[0].toString());
        assertEquals("Carol Oliveira (Idade: 19, Média: 88.33333333333333)", estudantes[1].toString());
        assertEquals("Bob Santos (Idade: 22, Média: 85.0)", estudantes[2].toString());
        assertEquals("Alice Silva (Idade: 20, Média: 84.33333333333333)", estudantes[3].toString());
    }

    @Test
    public void testOrdenacaoPorSobrenome() {
        Arrays.sort(estudantes, new SobrenomeComparator());
        
        assertEquals("Carol Oliveira (Idade: 19, Média: 88.33333333333333)", estudantes[0].toString());
        assertEquals("David Pereira (Idade: 21, Média: 85.0)", estudantes[1].toString());
        assertEquals("Bob Santos (Idade: 22, Média: 85.0)", estudantes[2].toString());
        assertEquals("Alice Silva (Idade: 20, Média: 84.33333333333333)", estudantes[3].toString());
    }

    @Test
    public void testOrdenacaoPorIdade() {
        Arrays.sort(estudantes, new IdadeComparator());

        assertEquals("Carol Oliveira (Idade: 19, Média: 88.33333333333333)", estudantes[0].toString());
        assertEquals("Alice Silva (Idade: 20, Média: 84.33333333333333)", estudantes[1].toString());
        assertEquals("David Pereira (Idade: 21, Média: 85.0)", estudantes[2].toString());
        assertEquals("Bob Santos (Idade: 22, Média: 85.0)", estudantes[3].toString());
    }

    @Test
    public void testOrdenacaoPorMedia() {
        Arrays.sort(estudantes, new MediaComparator());

        assertEquals("Alice Silva (Idade: 20, Média: 84.33333333333333)", estudantes[0].toString());
        assertEquals("Bob Santos (Idade: 22, Média: 85.0)", estudantes[1].toString());
        assertEquals("David Pereira (Idade: 21, Média: 85.0)", estudantes[2].toString());
        assertEquals("Carol Oliveira (Idade: 19, Média: 88.33333333333333)", estudantes[3].toString());
    }
}
