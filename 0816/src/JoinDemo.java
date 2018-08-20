
public class JoinDemo {
	public static void main(String[] args)throws InterruptedException  {
		Thread t = new Thread("이진웅쓰레드") {
			@Override
			public void run() {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
				}
				System.out.println("쓰레드 끝");
			}
		};
		t.start(); // 데몬스레드 실행
		t.join(); // join을 사용할 경우 t가 죽을떄까지 main이 대기
		Thread.sleep(3000); // 10초간 대기
		System.out.println("프로그램 끝");
	}
}
