import java.util.Scanner;
public class Bmi {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("�̸��� �Է����ּ��� :");
	String name = scan.nextLine();
	System.out.print("Ű���� �Է����ּ��� :");
	double tall = scan.nextDouble();
	System.out.print("�������� �Է����ּ��� :");
	double weight = scan.nextDouble();
	
	// ������ / Ű�� ����
	
	int bmi = (int)((weight/(tall*tall))*10000);
	
	if(bmi >= 35 ) 
		System.out.println(name +"���� �����Դϴ�.");
	else if(29.9 >= bmi && bmi >= 25)
		System.out.println(name +"���� ���Դϴ�.");
	else if(24.9 >= bmi && bmi> 23)
		System.out.println(name +"���� ��ü���Դϴ�.");
	else if(22.9 >= bmi && bmi> 18.5)
		System.out.println(name +"���� ����ü���Դϴ�.");
	else if(bmi > 18.5)
		System.out.println("�����Դϴ�.");
	
}
}
