
public class FinalDemo2 {
	public static void main(String[] args) {
		Bumo bumo = new Jasik();
		bumo.display();
	}
}

class Bumo{
	final void display() {
		System.out.println("���� �θ��� �޼ҵ�");
	}
}

class Jasik extends Bumo{
	void display(int a) {
		System.out.println("���� �ڽ��� �޼ҵ�");
	}
}