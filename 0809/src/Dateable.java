
public interface Dateable {
	// 1. public static final �� ������ ����� ����
	int SUN=0, MON=1,TUE=2,WED=3,THU=4,FRI=5,SAT=6;
	// 2. public abstract �� ������ �޼ҵ常 ��밡
	public abstract void display();
	
	public abstract int get();
	public abstract void set(int w);
	
}
