// static : �ּҾ��� ȣ��
public class StaticDemo1 {
	static int a = getNum();
	static int getNum() {
		System.out.println("���� ����ƽ �޼ҵ�");
		return 100;
	}
	private static int su = 5;
	public static void display() {
		su = 10;
	}
	public void print() {
		this.su = 100;
	}
	
	public static void main(String[] args) {
		System.out.println("���� ���θ޼ҵ�");		
	}
}
