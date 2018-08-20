import java.util.Scanner;

public class ContinueDemo {
public static void main(String[] args) {
	String pw = "ABCD";
	Scanner scan = new Scanner(System.in);
	System.out.print("pw를 입력해주세요 : ");
	String pw1 = scan.nextLine();
	int i;
	for(i=0; i<4; i++) {
		if(pw.charAt(i) == pw1.charAt(i)) continue;
		else break;
	}
	if(i == 4) {
		System.out.println("로그인 되셨습니다. ");
	}
	else {
		System.out.println("로그인 실패 패스워드를 확인해주세요");
	}
	
}
}
