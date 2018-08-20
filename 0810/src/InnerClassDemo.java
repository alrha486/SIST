//	OUter 클래스의 멤버변수와 멤버메소드에는 접근불가 
//

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.inner oi = new Outer.inner();
		System.out.println(Outer.inner.d);
		oi.display();
	}
}
class Outer{
	int a = 5;	// 바깥쪽 클래스의 멤버변수
	static int b = 10; // 바깥쪽 클래스의 스태틱변수
	
	static class inner{		
		int c = 500; // 안쪽 클래스의 멤버변수
		static int d = 1000; // 안쪽클래스의 스태틱변수\
		static public void display() { // 안쪽 클래스의 멤버메소드
			System.out.println("서정은 바보");
			System.out.println();
		}
	}
}
