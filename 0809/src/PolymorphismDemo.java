
public class PolymorphismDemo {
	public static void main(String[] args) {
		Car [] array = {
				new Sonata("Silver Sonata"),
				new Carnival("White Carnival"),
				new Martiz("Pink Martiz")
		};
	
			
		for(Car z: array) {
			System.out.println(z.toString());
		}
	}
}
