import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
		try{
			System.out.print(" ù��° ���ڸ� �Է����ּ��� :");
			int a = scan.nextInt();
			System.out.print(" �ι�° ���ڸ� �Է����ּ��� :");
			int b = scan.nextInt();
			System.out.println(a/b);
			}catch(ArithmeticException e){
				System.out.println("�и� ����� �Է����ּ���");
				break;
			}catch(InputMismatchException e) {
				System.out.println("������ �Է����ּ���");
				break;
			}
	}
		System.out.println("���α׷� ����");
		}
}

