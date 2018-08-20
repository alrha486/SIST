
public class CallbyRefDemo1 {
	public static void main(String[] args) {
		int [] a = {3,4};
		String str = "Hello";
		double pi = 3.14;
		change(a,str,pi);
		System.out.println(a[0]);
		System.out.println(str);
		System.out.println(pi);
}
	static void change(int [] a, String b, double c) {

		a[0] = 100; 
		b = "¾È³ç";
		c= 4.14;
		
	}
}
