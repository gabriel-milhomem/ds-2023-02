public class Italico extends ElementoMarkdown {
	public Italico(Markdown markdown) {
		super(markdown);
	}

	public String exibe() {
		return "__".concat(markdown.exibe()).concat("__");
	}
}