
public class CreateThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread("������������");
		mt.start();
		System.out.println(Thread.currentThread());
	}
}

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() { // CPU�� �۵��Ǵ� �ڵ�
		System.out.println(Thread.currentThread());
	}
}