import java.util.Scanner;
public class PloyMophismDemo {
	public static void main(String[] args) {
		while(true) {
		showMenu();
		int select = selectMenu();
		if(select == 5) {
			break;
		}
		display(select);
		}
	}
	static void showMenu() {
		System.out.println("당신은 무슨종족 입니까?");
		System.out.println("1 : Dog");
		System.out.println("2 : Cat");
		System.out.println("3 : Korean");
		System.out.println("4 : American");
		System.out.println("5 : 프로그램끝");
	}
	static int selectMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" 당신의 종족을 선택해주세요.");
		int select = scan.nextInt();
		
		return select;
		}
	
	static void display(int select) {
		Mammal mammal = null;
		switch(select) {
			case 1: mammal = new Dog(); break;
			case 2: mammal = new Cat(); break;
			case 3: mammal = new Korean(); break;
			case 4: mammal = new American(); break;
			default : break;
		}
		mammal.saySomething();
		System.out.println("===========");
	}
}
