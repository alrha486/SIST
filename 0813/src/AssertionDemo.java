
public class AssertionDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for( i=0; i<11; i++) {
			sum += i;
		}
		assert i == 11 : "Not ok";
		System.out.println("Ok");
	}
}
