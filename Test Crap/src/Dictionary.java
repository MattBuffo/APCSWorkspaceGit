
public class Dictionary extends Book{
	private int definitions;
	public Dictionary(String name, int numPages, int numDefinitions) {
		super(name, numPages);
		definitions = numDefinitions;
	}
	public int getDefinitions() {
		return definitions;
	}
	public String toString() {
		return super.getPages() + " Pages " + definitions + " Definitions "; 
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
