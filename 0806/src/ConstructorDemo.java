public class ConstructorDemo {
public static void main(String[] args) {
	Point p = new Point(500,200,"������");
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
		System.out.println("����Ʈ �������Դϴ�.");
		System.out.println(x + "  " + y);
	}
	
	
	Point(int x, int y, String name){
		System.out.println("��� ��ü�� �����Ǿ����ϴ�.");
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

