public class ConstructorDemo {
public static void main(String[] args) {
	Point p = new Point(500,200,"이진웅");
//	p.display();
	Point p1 = new Point();
	
}
}

class Point{
	private int x, y;
	private String name;
	
	Point(){
		x = 100;
		y = 200;
		System.out.println("디폴트 생성자입니다.");
		System.out.println(x + "  " + y);
	}
	
	
	Point(int x, int y, String name){
		System.out.println("방금 객체가 생성되었습니다.");
		this.x = x;
		this.y = y;
		this.name = name;
		System.out.println(x + "  " + y + "  " + name);
	}
	
	
	public void set(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
	public void display() {
		System.out.println(x + "  " + y + "  " + name);
	}
}

