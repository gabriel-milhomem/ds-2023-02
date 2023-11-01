public class Multiplica extends Operacao {
	public Multiplica(Expressao esquerda, Expressao direita) {
		super(esquerda, direita);
	}

	public float valor() {
		return esquerda.valor() * direita.valor();
	}
}