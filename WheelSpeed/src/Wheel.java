
public class Wheel {
	private double radius;
	private String name;
	
	public Wheel(double radius, String type) {
		this.radius= radius;
		name = type;
	}
	
	public double getRadius() {
		return radius;
	}
	public String toString() {
		return name + " " + radius;
	}
}
