import java.util.Scanner;
public class SGMG {
	public static void main(String[] args) {
		Student a = new Student();
		input(a);
		calc(a);
		output(a);
}
	static void input(Student a){
		Scanner scan = new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է����ּ��� : ");
		a.setName(scan.nextLine());
		System.out.print("�л��� ������� �Է����ּ��� : ");
		a.setKor(scan.nextInt());
		System.out.print("�л��� ������� �Է����ּ��� : ");
		a.setEng(scan.nextInt());
		System.out.print("�л��� ���м����� �Է����ּ��� : ");
		a.setMat(scan.nextInt());
	}
	static void calc(Student a){
		a.setSum(a.getKor()+a.getEng()+a.getMat());
		a.setAvg(a.getSum()/3);
	}
	static void output(Student a){
		System.out.println("�̸� : " + a.getName());
		System.out.println("���� : " + a.getKor());
		System.out.println("���� : " + a.getEng());
		System.out.println("���� : " + a.getMat());
		System.out.println("���� : " + a.getSum());
		System.out.println("��� : " + a.getAvg());
	}
}
