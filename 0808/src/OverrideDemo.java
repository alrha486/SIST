// �޼ҵ� �������̵�(������) ���� 3����
//  1. �޼ҵ��� �ñ״�ó(�̸�, �Ķ����, ����Ÿ��)�� ���ƾ��Ѵ�.
//  2. �޼ҵ��� ���� �����ڴ� �ڽ��� ���ų� �� �о�� �Ѵ�.  public > protected > default
//	3. �ڽ��� �޼ҵ�� �θ��� �޼ҵ��� Exception�� �� ���ų� ������ �۾ƾ��Ѵ�.
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
		System.out.println("���� �θ�");
	}
}
class Child extends Parent{
	@Override
	void display() { 
		System.out.println("���� �ڽ�");
	}
}
