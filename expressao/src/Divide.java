public class Divide extends Operacao {
	public Divide(Expressao esquerda, Expressao direita) {
		super(esquerda, direita);
	}

	@Override
	public float valor() {
			if (direita.valor() != 0) {
					return esquerda.valor() / direita.valor();
			} else {
					throw new ArithmeticException("Divisão por zero");
			}
	}
}