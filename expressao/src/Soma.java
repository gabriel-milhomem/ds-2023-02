public class Soma extends Operacao {
	public Soma(Expressao esquerda, Expressao direita) {
		super(esquerda, direita);
	}

	public float valor() {
		return esquerda.valor() + direita.valor();
	}
}