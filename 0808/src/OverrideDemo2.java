// 1)String type >> '==' : �� �� or �ּ� �� 
// 					'equals' : ������ �� ��
// 2)reference   >> '==', 'equals' : ��� �ּ� ��
// 3)��ü�� equals() ������
public class OverrideDemo2 {
	public static void main(String[] args) {
//		Test t = new Test();
//		t.su = 100;
//		Test t1 = new Test();
//		t1.su= 100;
//		
		
		Point p = new Point(100,200);
		Point target = new Point(100,200);

		if(p.equals(target)) {  //equals�� �׻� ����
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		
	}
}

class Test{
	int su;
}
