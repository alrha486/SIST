
public class WrapDemo {
	public static void main(String[] args) {
		int su = 5;
		Integer in = new Integer(su); // Wrapping or Boxing
		int num = in.intValue();	  // unWrapping
		System.out.println(in.intValue());
		Integer a = su + 100;
		int n = in - 4;
		System.out.println(in-4);
	}
}
