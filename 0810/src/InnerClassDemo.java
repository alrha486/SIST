//	OUter Ŭ������ ��������� ����޼ҵ忡�� ���ٺҰ� 
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
	int a = 5;	// �ٱ��� Ŭ������ �������
	static int b = 10; // �ٱ��� Ŭ������ ����ƽ����
	
	static class inner{		
		int c = 500; // ���� Ŭ������ �������
		static int d = 1000; // ����Ŭ������ ����ƽ����\
		static public void display() { // ���� Ŭ������ ����޼ҵ�
			System.out.println("������ �ٺ�");
			System.out.println();
		}
	}
}
