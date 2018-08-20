
public class RecursiveCallDemo {
	public static void main(String[] args) {
	
	System.out.println(fibo(10));
	}
	
//	void print(int a) {
//		System.out.print(a + ",");
//		if(a == 5) return;
//		else print(++a);
//	}
static int fibo(int n) {
	if(n <= 2) return 1;
	return fibo(n-1) + fibo(n-2);
}

}
