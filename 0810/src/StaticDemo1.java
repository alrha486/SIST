// static : 주소없이 호출
public class StaticDemo1 {
	static int a = getNum();
	static int getNum() {
		System.out.println("나는 스태틱 메소드");
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
		System.out.println("나는 메인메소드");		
	}
}
