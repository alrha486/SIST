
public class DeadThread {
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		Thread t = new Thread(mt);
		t.start();
		try {
		Thread.sleep(3000);
		}catch(InterruptedException ex) {
			
		}
		mt.stop();
		
		}
}
class MyThread2 implements Runnable {
	private boolean flag = true; 
	public void stop() {
		this.flag = false;
	}
	@Override
	public void run() { //OS�� �ؾ��� ��
		while(flag) {
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ex) {}
			System.out.println("������ �������");
		}
		System.out.println("������ ����");
	}
}
