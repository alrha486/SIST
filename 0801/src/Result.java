import java.util.Scanner;


public class Result {
public static void main(String[] args) {

	
	Scanner scan = new Scanner(System.in);
	System.out.print("�̸��� �Է����ּ��� : ");
	String name = scan.nextLine();
	System.out.print("���������� �Է����ּ���: ");
	int kor = scan.nextInt();
	System.out.print("���������� �Է����ּ���: ");
	int eng = scan.nextInt();
	System.out.print("���м����� �Է����ּ��� : ");
	int mat = scan.nextInt();
	
	double sum = (kor + eng + mat)/3; 

//	if(sum > 90 ) {
//		System.out.println(name + "���� ������ A�Դϴ�.");
//	}
//	else if(sum > 80 ) {
//		System.out.println(name + "���� ������ B�Դϴ�.");
//	}
//	else if(sum > 80 ) {
//		System.out.println(name + "���� ������ C�Դϴ�.");
//	}
//	else {
//		System.out.println(name + "���� ������ D�Դϴ�.");
//	}
	
	char result = (sum <= 100 && sum > 90) ? 'A':
		(sum >= 89 && sum > 80) ? 'B':
			(sum >= 79 && sum > 70) ? 'C':
				(sum >= 69 && sum > 60) ? 'D':
					(sum >= 59 && sum > 50) ? 'E' : 'F';
		System.out.println(name + "���� ���� ������ " + result + "���� �Դϴ�.");
		

		
}
}
