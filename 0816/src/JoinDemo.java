
public class JoinDemo {
	public static void main(String[] args)throws InterruptedException  {
		Thread t = new Thread("������������") {
			@Override
			public void run() {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
				}
				System.out.println("������ ��");
			}
		};
		t.start(); // ���󽺷��� ����
		t.join(); // join�� ����� ��� t�� ���������� main�� ���
		Thread.sleep(3000); // 10�ʰ� ���
		System.out.println("���α׷� ��");
	}
}
