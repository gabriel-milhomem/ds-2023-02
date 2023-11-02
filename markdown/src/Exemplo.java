public class Exemplo {
    public static void main(String[] args) throws Exception {
        Markdown titulo = new Titulo(new Texto("Título"));
        Markdown primeiraLinha = new Concatena(
            new Texto("Uma simples linha, com "), 
            new Negrito(new Texto("negrito")), 
            new Texto("e"),
            new Italico(new Texto("itálico")),
            new Texto(".")
        );
        Markdown segundaLinha = new Item(
            new Concatena(
                new Texto("Primeiro item da linha com "),
                new Italico(new Texto("itálico")),
                new Texto(".")
            )
        );

        Markdown textoCompleto = new Concatena(titulo, primeiraLinha, segundaLinha);

        System.out.println(textoCompleto.exibe());
    }
}
