import java.util.Scanner;

public class ContinueDemo {
public static void main(String[] args) {
	String pw = "ABCD";
	Scanner scan = new Scanner(System.in);
	System.out.print("pw�� �Է����ּ��� : ");
	String pw1 = scan.nextLine();
	int i;
	for(i=0; i<4; i++) {
		if(pw.charAt(i) == pw1.charAt(i)) continue;
		else break;
	}
	if(i == 4) {
		System.out.println("�α��� �Ǽ̽��ϴ�. ");
	}
	else {
		System.out.println("�α��� ���� �н����带 Ȯ�����ּ���");
	}
	
}
}
