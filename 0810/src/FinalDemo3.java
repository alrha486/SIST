
public class FinalDemo3 {
	public static void main(String[] args) {
		Parent p = new Child();
		
	}
}
class Parent{
	void display() {
		System.out.println("나는 부모의 메소드");
	}
	void print() {
		System.out.println("나는 부모의 메소드");
	}
}

class Child extends Parent{
	void display() {
		System.out.println("나는 부모의 메소드");
	}
}
