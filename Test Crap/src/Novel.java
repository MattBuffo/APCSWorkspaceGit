
public class Novel extends Book {

	private int chapters;
	public Novel(int pages, int numOfChapters) {
		super(pages);
		chapters = numOfChapters;
	}
	public int getChapters() {
		return chapters;
	}
	public String toString() {
		return chapters +"Chapters" + super.getPages() + "Pages";
	}
}
