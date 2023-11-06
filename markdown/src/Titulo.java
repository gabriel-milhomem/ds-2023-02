public class Titulo extends ElementoMarkdown {
	public Titulo(Markdown markdown) {
		super(markdown);
	}

	@Override
	public String exibe() {
		return "\n# ".concat(markdown.exibe()).concat("\n");
	}
}