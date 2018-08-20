
public class FinalDemo2 {
	public static void main(String[] args) {
		Bumo bumo = new Jasik();
		bumo.display();
	}
}

class Bumo{
	final void display() {
		System.out.println("나는 부모의 메소드");
	}
}

class Jasik extends Bumo{
	void display(int a) {
		System.out.println("나는 자식의 메소드");
	}
}