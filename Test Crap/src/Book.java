
public abstract class Book {
	int pages;
	public Book(String name, int numPages) {
		pages = numPages;
	}
	public int getPages() {
		return pages;
	}
	public boolean equals(Book b) {
		if(this.toString().equals(b.toString())) {
			return true;
		}
		else return false;
	}
	public abstract String toString();
	
}
