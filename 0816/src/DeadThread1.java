
public class DeadThread1 {
	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();  // runnable을 상속받은 클래스 인스턴스 생성
		Thread t = new Thread(mt); // runnable을 상속받으면 start를 바로 할 수 없으므로 Thread 생성할 때 매개변수로 넣어 인스턴스 생성
		t.start(); // 스레드 실행
		
		try {
		Thread.sleep(3000); // 3초동안 자다가
		}catch(InterruptedException ex) {
			
		}
		t.interrupt(); // 인터럽트 시키기
		
		}
}
class MyThread3 implements Runnable {

	@Override // run() 재정의
	public void run() { //OS가 해야할 일 , run() 재정의
		try {
		while(true) { 
			Thread.sleep(1000);
			System.out.println("스레드 살아있음");
			}}catch(InterruptedException ex) {}
			finally {
				System.out.println("스레드 죽음");
			}
		}
		
	}

