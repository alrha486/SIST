public class SangSokDemo1 {
	public static void main(String[] args) {
		Child child = new Child();// �θ� ���� ����
		child.display();
	}	
}

class Parent{
	 String name = "������";
	 
	 void display() {
		 System.out.println("���� �θ�");
	 }
}
class Child extends Parent{
	 String name = "��ο�";
	 void display() {
		 System.out.println("���� �ڽ�");
	 }
}