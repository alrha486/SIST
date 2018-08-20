// 5. 인터페이스는 추상클래스처럼 객체를 만들 수 없다.
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Dateable date = new Date();
		date.set(Dateable.THU);
		System.out.println("오늘은 : " + date.get());
	}
}
