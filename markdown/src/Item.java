public class Item extends ElementoMarkdown {
	public Item(Markdown markdown) {
		super(markdown);
	}

    @Override
	public String exibe() {
		return "\n-\t".concat(markdown.exibe());
	}
}