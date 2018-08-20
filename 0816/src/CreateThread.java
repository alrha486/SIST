
public class CreateThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread("이진웅쓰레드");
		mt.start();
		System.out.println(Thread.currentThread());
	}
}

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() { // CPU가 작동되는 코드
		System.out.println(Thread.currentThread());
	}
}