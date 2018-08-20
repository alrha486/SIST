public class ex {
	
public static void main(String[] args) {
	ex md = new ex();
	String a = "Hi!";
	String b = "Bye!";
	System.out.println("변경 전 ");
	System.out.println(a + "\t" + b);
	md.swap(a,b);
	System.out.println("변경 후 ");
	System.out.println(a + "\t" + b);
}

void swap(String a, String b) {
	String tmp;
	
	tmp = a;
	a = b;
	b = tmp;
}

}
