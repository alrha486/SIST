
public class CreateThread1 {
	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1();
		Thread t = new Thread(mt1,"������������");
		t.start();
	}
}
class MyThread1 implements Runnable{ // run() �޼ҵ� �ϳ� �ۿ� ���� �������̽�
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread());
	}
}