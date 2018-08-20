
public class MultiThread extends Thread{
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName());
		MultiThread mt = new MultiThread();
		mt.start();
		
		for(int i=0;i<100;i++) {
			System.out.println(i+1 + " main()");
		}
	}
	public void run() {
		for(int i =0; i<100;i++) {
			System.out.println(i+1 + " run()");
		}
	}
}
