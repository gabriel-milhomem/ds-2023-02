import static org.junit.Assert.*;
import org.junit.Test;

public class PlanilhaTest {

    @Test
    public void testObservadorRecebeNotificacao() {
        Planilha planilha = new Planilha();
        Celula A1 = planilha.adicionarCelula("A1");
        Celula A2 = planilha.adicionarCelula("A2");
        planilha.adicionarCelula("A3");

        MeuObservador observadorA3 = new MeuObservador("A3");
        A1.addObserver(observadorA3);
        A2.addObserver(observadorA3);

        A1.setValor(7);
        A2.setValor(4);

        assertEquals("Reavaliar A3 por mudança ocorrida em A1\nReavaliar A3 por mudança ocorrida em A2\n", observadorA3.getLog());
    }

    @Test
    public void testObservadorNaoRecebeNotificacaoSeValorNaoMudar() {
        Planilha planilha = new Planilha();
        Celula A1 = planilha.adicionarCelula("A1");
        planilha.adicionarCelula("A3");

        MeuObservador observadorA3 = new MeuObservador("A3");
        A1.addObserver(observadorA3);

        A1.setValor(5);
        A1.setValor(5);

        assertEquals("Reavaliar A3 por mudança ocorrida em A1\n", observadorA3.getLog());
    }

    @Test
    public void testCelulaDependenteNaoRecebeNotificacoesSemObservadores() {
        Planilha planilha = new Planilha();
        Celula A1 = planilha.adicionarCelula("A1");
        planilha.adicionarCelula("A3");
        MeuObservador observadorA3 = new MeuObservador("A3");
        
        A1.setValor(5);

        assertEquals("", observadorA3.getLog());
    }
}