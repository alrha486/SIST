import java.util.Scanner;


public class VariableDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); /* 표준입력 : System.in */
											   /* 표준출력 : System.out*/
		
		System.out.print("당신의 이름를 입력해주세요 : ");
		String name = scan.next(); /* 입력과 동시에 초기화*/
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		
	}
}
