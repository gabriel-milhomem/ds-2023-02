public class Subtrai extends Operacao {
	public Subtrai(Expressao esquerda, Expressao direita) {
		super(esquerda, direita);
	}

	public float valor() {
		return esquerda.valor() - direita.valor();
	}
}