abstract class ElementoMarkdown implements Markdown {
	protected Markdown markdown;

	protected ElementoMarkdown(Markdown markdown) {
		this.markdown = markdown;
	}
}