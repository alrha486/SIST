public class MethodDemo4 {
	
public static void main(String[] args) {
	MethodDemo4 md = new MethodDemo4();
	int[] a = {5,9};
	System.out.println("변경 전 ");
	System.out.println(a[0] + "\t" + a[1]);
	md.swap(a);
	System.out.println("변경 후 ");
	System.out.println(a[0] + "\t" + a[1]);
}

void swap(int[] a) {
	int tmp;
	
	tmp = a[0];
	a[0] = a[1];
	a[1] = tmp;
}

}
