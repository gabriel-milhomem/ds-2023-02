public class Negrito extends ElementoMarkdown {
	public Negrito(Markdown markdown) {
		super(markdown);
	}

    @Override
	public String exibe() {
		return "**".concat(markdown.exibe()).concat("**");
	}
}