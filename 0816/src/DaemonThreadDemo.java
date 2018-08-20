
public class DaemonThreadDemo {
	public static void main(String[] args)throws InterruptedException  {
		Thread t = new Thread("이진웅쓰레드") {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				System.out.println("데몬쓰레드 끝");
			}
		};
		t.setDaemon(true); // 스레드 t를 데몬스레드로 설정 // 백그라운드스레드
		t.start(); // 데몬스레드 실행
		Thread.sleep(10000); // 10초간 대기
		System.out.println("프로그램 끝");
	}
}
