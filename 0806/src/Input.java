import java.util.Scanner;

public class Input {
	public void input(Student [] s){
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<s.length ; i++) {
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = scan.next();
		System.out.print("���������� �Է����ּ��� : ");
		int kor = scan.nextInt();
		System.out.print("���������� �Է����ּ��� : ");
		int eng = scan.nextInt();
		System.out.print("���������� �Է����ּ��� : ");
		int mat = scan.nextInt();
		
		Student student = new Student(name,kor,eng,mat); // �Է� ���� ������ ������ ȣ��� �ʱ�ȭ
		s[i] = student;
		}
		
	}
}
