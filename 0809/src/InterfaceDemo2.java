
public class InterfaceDemo2 implements Mother, Father{
	
	public void grandFather() {		
	System.out.println("�Ҿƹ���");
	}
	public void grandmother() {				
		System.out.println("�ҾƸӴ�");
	}
	public void father() {
		System.out.println("�ƹ���");
	}	
	public void mother() {				
		System.out.println("��Ӵ�");
	}
	public void display() {
		System.out.println("�� �ڽ�");
	}
	public static void main(String[] args) {
		GrandFather gf = new InterfaceDemo2();
		gf.grandFather(); // 7. �� �������̽��� ���������� ������ �������̽����� ����� �޼ҵ常 ���� ����
		InterfaceDemo2 id = new InterfaceDemo2();
		GrandMother gm = id; // �ڱ� �ڽŸ� ���� ����
		gm.grandmother();
		Father f = id; // �Ҿƹ��� �ҸӴ� �ڱ��ڽ� ���ٰ���
		//f.display(); // �θ��� ���������� �ڽ��� ��� �޼ҵ� ������ �ƴ϶� ������ �� �޼ҵ常 ���� ����
		Mother [] m = new Mother[3];
		m[0] = id;
		m[1] = new InterfaceDemo2();
		// �������̽��� �迭 ���� ����
System.out.println(Mother.NAME);
System.out.println(Father.NAME);
		
	}
}
