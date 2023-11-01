abstract class Operacao implements Expressao {
	protected Expressao esquerda;
	protected Expressao direita;

	protected Operacao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
}