import java.util.Scanner;

public class ArrayDemo6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Student[] a = new Student[2];
	
	for(int i =0; i<a.length ; i++) {	
		a[i] = new Student();
		
		System.out.print("�л��� �̸��� �Է����ּ��� : ");
		a[i].name = scan.next();
		System.out.print("�л��� ���������� �Է����ּ��� : ");
		a[i].kor = scan.nextInt();
		System.out.print("�л��� ���������� �Է����ּ��� : ");
		a[i].eng = scan.nextInt();
		System.out.print("�л��� ���������� �Է����ּ��� : ");
		a[i].mat = scan.nextInt();
		a[i].sum = a[i].kor + a[i].eng + a[i].mat;
		a[i].avg = a[i].sum/3;
	}
	
	for(int j=1; j<a.length+1; j++) {
		System.out.println("<< " + j + "��° �л��� ���� >> ");
		System.out.println("�̸� : " + a[j-1].name);
		System.out.println("���� ���� : " + a[j-1].kor);
		System.out.println("���� ���� : " + a[j-1].eng);
		System.out.println("���� ���� : " + a[j-1].mat);
		System.out.println("���� ���� : " + a[j-1].sum);
		System.out.println("��� ���� : " + a[j-1].avg);
	}
	
	

	
	
	


	
	
	
//	array[0] = new Student();
//	array[0].name = "������";
//	array[0].age = 25;
//	array[0].add = "����";
//	
//	array[1] = new Student();
//	array[1].name = "��������";
//	array[1].age = 25;
//	array[1].add = "��õ";
//	
//	for(int i=0; i<array.length;i++) {
//		System.out.println("<< " +i + "��° �л��� ���� >>");
//		System.out.println(array[i].name + array[i].age + array[i].add);
//	}
//	
}
}
