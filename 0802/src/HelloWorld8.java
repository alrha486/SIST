
public class HelloWorld8 {

	public static void main(String[] args) {
//	Product.display();
//	
	int a= 3;
	int b= 2; 
	int c;
	c = sum1(a,b);
	System.out.println(c);
}
	
	static int sum1(int a, int b) {
		int c;
		c = a + b ;
		return c;
	}
	
	
}

class Product{
	static void display() {
		System.out.println("HelloWorld!");
	}
	
	
	
}