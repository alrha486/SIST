
public class FinalDemo3 {
	public static void main(String[] args) {
		Parent p = new Child();
		
	}
}
class Parent{
	void display() {
		System.out.println("���� �θ��� �޼ҵ�");
	}
	void print() {
		System.out.println("���� �θ��� �޼ҵ�");
	}
}

class Child extends Parent{
	void display() {
		System.out.println("���� �θ��� �޼ҵ�");
	}
}
