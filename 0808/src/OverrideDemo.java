// 메소드 오버라이드(재정의) 조건 3가지
//  1. 메소드의 시그니처(이름, 파라미터, 리턴타입)가 같아야한다.
//  2. 메소드의 접근 제한자는 자식이 같거나 더 넓어야 한다.  public > protected > default
//	3. 자식의 메소드는 부모의 메소드의 Exception이 더 적거나 범위가 작아야한다.
 public class OverrideDemo {
	 public static void main(String[] args) {
		 Parent p = new Parent();
		 p.display();
		 
		 Child c = new Child();
		 c.display();
	}
}
class Parent{
	void display() {
		System.out.println("나는 부모");
	}
}
class Child extends Parent{
	@Override
	void display() { 
		System.out.println("나는 자식");
	}
}
