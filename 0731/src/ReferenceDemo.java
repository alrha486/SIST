import java.util.Scanner;

public class ReferenceDemo {
public static void main(String[] args) {
	/*String name = "������";*/
	
	Scanner scan = new Scanner(System.in);
	String name = null;
	System.out.print("����� �̸��� �����Դϱ�? : ");
	name = scan.nextLine();
	System.out.println("����� �̸��� " + name + "�Դϴ�.");
}
}
