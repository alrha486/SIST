// 1. ������� : �ڱⰡ �����ִ� �޼ҵ尡 ȣ��Ǿ�� �Ѵ�. �׸��� �޼ҵ� �ȿ����� �������̱� ������
//				Ŭ���� ���� ���Ŀ� �����Ǿ���Ѵ�.
// 2. ���ѻ��� : ��� access modifier ���Ұ�, static, abstract ���Ұ�, final�� ����
// 3. ��������ó�� �ٷ� ����ϰ� �ٷ� �Ҹ��Ű�� ����
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