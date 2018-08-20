
public class StaticDemo2 {
	private static int su = display();
	private final int num;
	private static double avg;
	private static final char grade;
	
	public StaticDemo2(int su,int num) {
		this.su = su;
		this.num = num;
	}
	static { // static 초기화 블록
		avg = 3.14;
		grade = 'A';
		System.out.println("ㅎㅎㅎㅎㅎ");
	}
	static int display() {
		System.out.println("ㅎㅇㅎㅇ");
		return 100;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticDemo2.avg + " " + StaticDemo2.grade);
	}
}
