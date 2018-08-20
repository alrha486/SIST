
public class EnumDemo {
	public static void main(String[] args) {
		Week w = Week.FRI;
		Week [] array = w.values();
		for(Week w1 : array) {
			System.out.println(w1.display() + "  " +w1 + " " + w1.ordinal());
		} 
	}
}
