
public class CreateThread1 {
	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1();
		Thread t = new Thread(mt1,"이진웅쓰레드");
		t.start();
	}
}
class MyThread1 implements Runnable{ // run() 메소드 하나 밖에 없는 인터페이스
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread());
	}
}