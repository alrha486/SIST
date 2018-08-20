
public class SleepDemo implements Runnable{
	public static void main(String[] args) {
		SleepDemo sd = new SleepDemo();
		SleepDemo sd1 = new SleepDemo();
		Thread t = new Thread(sd,"이진웅쓰레드");
		Thread t1 = new Thread(sd1,"서정은쓰레드");
		t.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		t.start();
		t1.start();
	}
	public void run() {
		for(int i=0; i<21; i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {}
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " --->" + i);
		}
	}

}
