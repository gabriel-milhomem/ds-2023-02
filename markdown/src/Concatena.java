
public class Concatena implements Markdown {
    private String textoExibido = "";

    public Concatena(Markdown... lista) {
        for(Markdown markdown : lista) {
            this.textoExibido.concat(markdown.exibe());
        }
    }

    @Override
    public String exibe() {
        return textoExibido;
    }
}
