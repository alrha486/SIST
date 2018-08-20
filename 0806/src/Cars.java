
public class Cars {

	private String maker;
	private String name;
	private int price;
	private String bgcolor;
	public Cars(){
		System.out.println("객체가 생성되었습니다.");
	}
	protected void finalize() {
		System.out.println("방금 객체가 소멸되었습니다.");
	}
}
