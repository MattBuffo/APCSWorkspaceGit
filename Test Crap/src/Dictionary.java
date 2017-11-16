
public class Dictionary extends Book{
	private int definitions;
	public Dictionary(int numPages, int numDefinitions) {
		super(numPages);
		definitions = numDefinitions;
	}
	public int getDefinitions() {
		return definitions;
	}
	public String toString() {
		return super.getPages() + " " + definitions + " definitions"; 
	}
	public boolean equals(Dictionary d) {
		if(pages == d.getPages() && definitions == d.getDefinitions()) {
			return true;
		}
		else {
			return false;
		}
	}
}
