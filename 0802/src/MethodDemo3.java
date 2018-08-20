public class MethodDemo3 {
	
public static void main(String[] args) {
	MethodDemo3 md = new MethodDemo3();
	int a =5, b=9;
	System.out.println("변경 전 ");
	System.out.println(a + "\t" + b);
	md.swap(a,b);
	System.out.println("변경 후 ");
	System.out.println(a + "\t" + b);
}

void swap(int a, int b) {
	int tmp;
	
	tmp = a;
	a = b;
	b = tmp;
}

}
