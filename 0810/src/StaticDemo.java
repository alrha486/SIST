
public class StaticDemo {
	public static void main(String[] args) {
		Demo [] d = new Demo[3];
		for(int i=0; i< d.length; i++) {
			d[i] = new Demo();
		}
		for(Demo f : d) {
			f.display();
		}
	}
}
class Demo{
	int a;
	static int b;
	
	public Demo() {
		b++;
		a= b;
		
	}
	public void display() {
		System.out.println(a + " " + b);
	}
}