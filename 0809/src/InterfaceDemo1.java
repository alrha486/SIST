// 5. �������̽��� �߻�Ŭ����ó�� ��ü�� ���� �� ����.
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Dateable date = new Date();
		date.set(Dateable.THU);
		System.out.println("������ : " + date.get());
	}
}
