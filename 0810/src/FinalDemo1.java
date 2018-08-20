
public class FinalDemo1 {
	private String name; // 멤버변수
	private final int SALARY; // 멤버상수

	public FinalDemo1(String name, int salary) { // 생성자는 상수도 초기화 가능
		this.name = name;
		this.SALARY = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSALARY() {
		return SALARY;
	}

	public static void main(String[] args) {
		FinalDemo1 fm = new FinalDemo1("이진웅",2500000);
		
	}
}
