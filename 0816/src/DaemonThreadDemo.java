
public class DaemonThreadDemo {
	public static void main(String[] args)throws InterruptedException  {
		Thread t = new Thread("������������") {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				System.out.println("���󾲷��� ��");
			}
		};
		t.setDaemon(true); // ������ t�� ���󽺷���� ���� // ��׶��彺����
		t.start(); // ���󽺷��� ����
		Thread.sleep(10000); // 10�ʰ� ���
		System.out.println("���α׷� ��");
	}
}
