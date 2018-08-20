
public class StringDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");
		long start =System.currentTimeMillis();
//		for(int i=0; i<100000000;i++) {
//			sb = sb.append("A");
//		}
		long end = System.currentTimeMillis();
//		System.out.println((end-start) + "ms");
		double a = 3.5;
		System.out.println(Math.ceil(a));
//		String str = "Hello";
//		StringBuffer sb = new StringBuffer("Hello");
//		change(str,sb);
//		System.out.println(str);
//		System.out.println(sb.toString());
	}
//	static void change(String a , StringBuffer b) {
//		a.concat("World");
//		b.append("World");
//	}
}
