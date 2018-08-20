// 1. 생성방법 : 자기가 속해있는 메소드가 호출되어야 한다. 그리고 메소드 안에서는 절차적이기 떄문에
//				클래스 선언 이후에 생성되어야한다.
// 2. 제한사항 : 모든 access modifier 사용불가, static, abstract 사용불가, final만 가능
// 3. 지역변수처럼 바로 사용하고 바로 소멸시키기 위해
//
public class InnerClassDemo2 {
	public static void main(String[] args) {
		new Outer2().display();
	}
}
class Outer2{
	int a= 5;
	static int b = 10;
	public void display() {
		int c = 500;
		class Inner2{
			public void print() {
				System.out.println(c);
			}
		}
		Inner2 in = new Inner2();
	}
}