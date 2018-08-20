import java.util.Arrays;

public class VariableSrgDemo {
	public static void main(String[] args) {
		Product p = new Product();
		p.name = "¸ð³ªºñ";
		p.price = 3000;
		print(3,p, "Hello", 'p', false,5);
	
		
}
	static void print(Object ... a) {
//		System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
//		System.out.println(a[0] + a[5]);
	}
}
