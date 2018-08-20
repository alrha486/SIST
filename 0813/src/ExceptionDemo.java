import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
		try{
			System.out.print(" 첫번째 숫자를 입력해주세요 :");
			int a = scan.nextInt();
			System.out.print(" 두번째 숫자를 입력해주세요 :");
			int b = scan.nextInt();
			System.out.println(a/b);
			}catch(ArithmeticException e){
				System.out.println("분모를 제대로 입력해주세요");
				break;
			}catch(InputMismatchException e) {
				System.out.println("정수를 입력해주세요");
				break;
			}
	}
		System.out.println("프로그램 종료");
		}
}

