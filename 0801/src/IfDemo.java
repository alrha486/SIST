import java.util.Scanner;

public class IfDemo {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.print("��� ������ �����ϼ���? : ");
	String result = scan.nextLine();
	
	
	
	if (result.equals("��"))
		System.out.println("���� ���� �����մϴ�.");
	
	else if (result.equals("����")) 
		System.out.println("���� ������ �����մϴ�.");

	else if (result.equals("����"))
		System.out.println("���� ������ �����մϴ�.");

	else if (result.equals("�ܿ�")) 		
		System.out.println("���� �ܿ��� �����մϴ�.");
	else 
		System.out.println("����� �Է����ּ���");
}
}


