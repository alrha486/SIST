import java.util.Scanner;

public class OpDemo3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("평균 점수를 입력해주세요 : ");
	int a = scan.nextInt();
	String result = (a % 2 == 0) ? "짝수" : "홀수";
	System.out.println(result);
	
	
	
}
}
