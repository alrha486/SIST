import java.util.Scanner;
public class MoneyCount {
public static void main(String[] args) {

	String answer;
	
	
	do {	
		Scanner scan = new Scanner(System.in);
		System.out.print("�ܾ��� �Է����ּ��� :");
		int money = scan.nextInt();
		Scanner a = new Scanner(System.in);
	int [] array = new int[] { 50000,10000,5000,1000,500,100,50,10,5,1};

	for(int i =0; i<array.length ; i++) {
		System.out.printf("%d ���� : %d�� \n", array[i], money/array[i]);		
		money = money % array[i];
	}
	System.out.println("�ٽ� �����Ͻðڽ��ϱ�? (y/n) : ");
	answer = a.nextLine();

	if(answer.equals("n")) {
		break;
	}
	
	}
	while(answer.equals("y"));		
}
}
