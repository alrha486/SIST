
public class FinalDemo1 {
	private String name; // �������
	private final int SALARY; // ������

	public FinalDemo1(String name, int salary) { // �����ڴ� ����� �ʱ�ȭ ����
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
		FinalDemo1 fm = new FinalDemo1("������",2500000);
		
	}
}
