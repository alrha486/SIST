import java.util.Scanner;
public class WhileDemo1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//System.out.print("�Է��Ͻ� ���� �Է����ּ��� : ");
	//int a = scan.nextInt();
	
//	for(int i=0; i<10; i++) {
//		System.out.println(a + "*" + i + "= " + a*i);		
//	}
	

	while (true) {
		System.out.print("�޽����� �Է����ּ��� : " );
		String a = scan.nextLine();
		if(a.equals("exit") || a.length()==0) {
		System.out.print("���α׷��� �����մϴ�.");
		break;
		}
		else
			System.out.print("�Է��Ͻ� �޽��� : " + a);
		}
	}
	
}

