import java.util.Scanner;

public class IfDemo {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.print("어느 계절을 좋아하세요? : ");
	String result = scan.nextLine();
	
	
	
	if (result.equals("봄"))
		System.out.println("저도 봄을 좋아합니다.");
	
	else if (result.equals("여름")) 
		System.out.println("저도 여름을 좋아합니다.");

	else if (result.equals("가을"))
		System.out.println("저도 가을을 좋아합니다.");

	else if (result.equals("겨울")) 		
		System.out.println("저도 겨울을 좋아합니다.");
	else 
		System.out.println("제대로 입력해주세요");
}
}


