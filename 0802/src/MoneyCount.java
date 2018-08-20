import java.util.Scanner;
public class MoneyCount {
public static void main(String[] args) {

	String answer;
	
	
	do {	
		Scanner scan = new Scanner(System.in);
		System.out.print("잔액을 입력해주세요 :");
		int money = scan.nextInt();
		Scanner a = new Scanner(System.in);
	int [] array = new int[] { 50000,10000,5000,1000,500,100,50,10,5,1};

	for(int i =0; i<array.length ; i++) {
		System.out.printf("%d 원권 : %d개 \n", array[i], money/array[i]);		
		money = money % array[i];
	}
	System.out.println("다시 시작하시겠습니까? (y/n) : ");
	answer = a.nextLine();

	if(answer.equals("n")) {
		break;
	}
	
	}
	while(answer.equals("y"));		
}
}
