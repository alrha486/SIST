
public class StaticDemo2 {
	private static int su = display();
	private final int num;
	private static double avg;
	private static final char grade;
	
	public StaticDemo2(int su,int num) {
		this.su = su;
		this.num = num;
	}
	static { // static �ʱ�ȭ ���
		avg = 3.14;
		grade = 'A';
		System.out.println("����������");
	}
	static int display() {
		System.out.println("��������");
		return 100;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticDemo2.avg + " " + StaticDemo2.grade);
	}
}
