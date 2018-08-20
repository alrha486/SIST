
public interface Dateable {
	// 1. public static final 이 생략된 상수만 가능
	int SUN=0, MON=1,TUE=2,WED=3,THU=4,FRI=5,SAT=6;
	// 2. public abstract 가 생략된 메소드만 사용가
	public abstract void display();
	
	public abstract int get();
	public abstract void set(int w);
	
}
