import java.util.Scanner;
public class ScoreMG {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String name ;
	int[] array = new int[4];
	System.out.println("�̸��� �Է����ּ��� :");
	name = scan.nextLine();
	System.out.println("������� �Է����ּ��� :");
	array[0] = scan.nextInt();
	System.out.println("������� �Է����ּ��� :");
	array[1] = scan.nextInt();
	System.out.println("���м����� �Է����ּ��� :");
	array[2] = scan.nextInt();
	
	int sum = (int)(array[0] + array[1] + array[2])/3;
	array[3] = sum;
	System.out.println(name + "���� ���������" 
	+ array[3] + "�� �Դϴ�.");	
}
}
