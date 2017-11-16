
public abstract class Book {
	int pages;
	public Book(int numPages) {
		pages = numPages;
	}
	public int getPages() {
		return pages;
	}
	
	public abstract String toString();
	
}
