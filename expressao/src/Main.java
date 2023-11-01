class Main {
  public static void main(String[] args) throws Exception {
    Expressao expressao1 = new Soma(new Constante(5), new Multiplica(new Constante(2), new Constante(3)));

    Expressao expressao2 = new Subtrai(new Constante(20), new Divide(new Constante(10), new Constante(2)));

    System.out.println(expressao1.valor());
    System.out.println(expressao2.valor());
  }
}