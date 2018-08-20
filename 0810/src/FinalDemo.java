
public class FinalDemo {
	int kor; // 멤머변수
	final int eng = 100; // 멤버상수 
	static int price = 25000000; // static 변수
	static final String name = "Sally"; // static 상수
	
	public static void main(String[] args) {
		int su = 5; // 지역변수
		final int num = 10; // 지역상수
		
		FinalDemo a = new FinalDemo();
		FinalDemo.price = 100;
		
	}
}
