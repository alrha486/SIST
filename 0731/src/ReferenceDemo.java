import java.util.Scanner;

public class ReferenceDemo {
public static void main(String[] args) {
	/*String name = "이진웅";*/
	
	Scanner scan = new Scanner(System.in);
	String name = null;
	System.out.print("당신의 이름은 무엇입니까? : ");
	name = scan.nextLine();
	System.out.println("당신의 이름은 " + name + "입니다.");
}
}
