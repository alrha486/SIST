import java.util.Scanner;

public class IfDemo2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("�̸��� �Է����ּ��� : ");
	String name = scan.nextLine();
	System.out.print("����⵵�� �Է����ּ��� :");
	int year = scan.nextInt();
	int year2 = (2018-year +1);
	
	if(year%12 ==0)
		System.out.println(name + "���� "+ year2 + " ���̰� ������ �� �Դϴ�."  );
	else if (year%12 ==1)
		System.out.println(name + "���� "+ year2 + " ���̰� �� �� �Դϴ�."  );
	else if(year%12 ==2)
		System.out.println(name +  "���� "+ year2 + " ���̰� �� �Դϴ�."  );
	else if(year%12 ==3)
		System.out.println(name +  "���� "+ year2 + " ���̰� �� �Դϴ�."  );
	else if(year%12 ==4)
		System.out.println(name +  "���� "+ year2 + " ���̰� �� �Դϴ�."  );
	else if(year%12 ==5)
		System.out.println(name +  "���� "+ year2 + " ���̰�� �Դϴ�."  );
	else if(year%12 ==6)
		System.out.println(name +  "���� "+ year2 + " ���̰� �� �Դϴ�."  );
	else if(year%12 ==7)
		System.out.println(name +  "���� "+ year2 + " ���̰� �� �Դϴ�."  );
	else if(year%12 ==8)
		System.out.println(name +  "���� "+ year2 + " ���̰� �� �Դϴ�."  );
	else if(year%12 ==9)
		System.out.println(name +  "���� "+ year2 + " ���̰� �� �Դϴ�."  );
	else if(year%12 ==10)
		System.out.println(name +  "���� "+ year2 + " ���̰� �� �Դϴ�."  );
	else if(year%12 ==11)
		System.out.println(name +  "���� "+ year2 + " ���̰� �� �Դϴ�."  );
	


}
}
