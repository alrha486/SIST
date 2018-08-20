public class SangSokDemo1 {
	public static void main(String[] args) {
		Child child = new Child();// 부모 먼저 생성
		child.display();
	}	
}

class Parent{
	 String name = "이진웅";
	 
	 void display() {
		 System.out.println("나는 부모");
	 }
}
class Child extends Parent{
	 String name = "김민웅";
	 void display() {
		 System.out.println("나는 자식");
	 }
}