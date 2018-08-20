import java.util.Scanner;
public class WhileDemo1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//System.out.print("입력하실 단을 입력해주세요 : ");
	//int a = scan.nextInt();
	
//	for(int i=0; i<10; i++) {
//		System.out.println(a + "*" + i + "= " + a*i);		
//	}
	

	while (true) {
		System.out.print("메시지를 입력해주세요 : " );
		String a = scan.nextLine();
		if(a.equals("exit") || a.length()==0) {
		System.out.print("프로그램을 종료합니다.");
		break;
		}
		else
			System.out.print("입력하신 메시지 : " + a);
		}
	}
	
}

