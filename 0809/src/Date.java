//	3. 인터페이스는 클래스가 상속받을 떄 extends가아니라 implements를 쓴다.
//	4. 인터페이스의 추상메소드를 재정의 할 떄 반드시 public이어야 한다.
public class Date implements Dateable{
	private int w;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int get() {
		// TODO Auto-generated method stub
		return w;
	}

	@Override
	public void set(int w) {
		this.w = w;
		// TODO Auto-generated method stub
	}


	
}
