
public class Cars {

	private String maker;
	private String name;
	private int price;
	private String bgcolor;
	public Cars(){
		System.out.println("��ü�� �����Ǿ����ϴ�.");
	}
	protected void finalize() {
		System.out.println("��� ��ü�� �Ҹ�Ǿ����ϴ�.");
	}
}
