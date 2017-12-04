
public class RX7_FD extends Sport{

	public RX7_FD(String location, int mileage, int topSpeed, int horsePower) {
		super("Mazda", location, mileage, topSpeed, horsePower);
	}
	public String inspect(){
		String temp = "";
		temp += super.inspect();
		temp += "Triangles. Triangles? Triangles! \n";
		return temp;
	}
}
