
public class SangsokDemo3 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.name);
		System.out.println(sub.price);
		System.out.println(Super.price);
	}
}
class Super{
	String name = "¸ð³ª¹ÌµüÇ®";
	static int price = 1000;
}
class Sub extends Super{
	
}