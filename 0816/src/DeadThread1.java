
public class DeadThread1 {
	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();  // runnable�� ��ӹ��� Ŭ���� �ν��Ͻ� ����
		Thread t = new Thread(mt); // runnable�� ��ӹ����� start�� �ٷ� �� �� �����Ƿ� Thread ������ �� �Ű������� �־� �ν��Ͻ� ����
		t.start(); // ������ ����
		
		try {
		Thread.sleep(3000); // 3�ʵ��� �ڴٰ�
		}catch(InterruptedException ex) {
			
		}
		t.interrupt(); // ���ͷ�Ʈ ��Ű��
		
		}
}
class MyThread3 implements Runnable {

	@Override // run() ������
	public void run() { //OS�� �ؾ��� �� , run() ������
		try {
		while(true) { 
			Thread.sleep(1000);
			System.out.println("������ �������");
			}}catch(InterruptedException ex) {}
			finally {
				System.out.println("������ ����");
			}
		}
		
	}

