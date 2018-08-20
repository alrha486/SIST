import java.util.Scanner;
public class Money {
	public static void main(String[] args) {
		
		do {
		Scanner scan = new Scanner(System.in);
		int money;
		System.out.println("잔액을 입력해주세요 : ");
		money = scan.nextInt();
		int[] array = new int[11];
				array[0] = money/50000;
				array[1] = (money - array[0])/10000;
				array[2] = array[1]/5000;
				array[3] = array[2] /1000;
				array[4] = array[3] /500;
				array[5] = array[4] /100;
				array[6] = array[5] /50;
				array[7] = array[6] /10;
				array[8] = array[7] /5;
				array[9] = array[8] /1;
				
	System.out.println("입력하신 잔액("+ money + ")의 거스름은" );
	System.out.println("10000원권 : " + array[1]);
	System.out.println("50000원권 : " + array[0]);
	System.out.println("5000원권 : "+ array[2]);
	System.out.println("1000원권 : "+ array[3]);
	System.out.println("500원권 : "+ array[4]);
	System.out.println("100원권 : "+ array[5]);
	System.out.println("50원권 : "+ array[6]);
	System.out.println("10원권 : "+ array[7]);
	System.out.println("5원권 : "+ array[8]);
	System.out.println("1원권 : "+ array[9]);
	String answer;
	System.out.println("다시 시작하시겠습니까 ? (y/n): ");
	answer = scan.nextLine();
	if(answer.equals("n")) {
		break;
	}
		}while(true); 
		
		
	}
}
