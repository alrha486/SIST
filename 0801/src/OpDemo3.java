import java.util.Scanner;

public class OpDemo3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("��� ������ �Է����ּ��� : ");
	int a = scan.nextInt();
	String result = (a % 2 == 0) ? "¦��" : "Ȧ��";
	System.out.println(result);
	
	
	
}
}
