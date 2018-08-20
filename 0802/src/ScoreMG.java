import java.util.Scanner;
public class ScoreMG {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String name ;
	int[] array = new int[4];
	System.out.println("이름을 입력해주세요 :");
	name = scan.nextLine();
	System.out.println("국어성적을 입력해주세요 :");
	array[0] = scan.nextInt();
	System.out.println("영어성적을 입력해주세요 :");
	array[1] = scan.nextInt();
	System.out.println("수학성적을 입력해주세요 :");
	array[2] = scan.nextInt();
	
	int sum = (int)(array[0] + array[1] + array[2])/3;
	array[3] = sum;
	System.out.println(name + "님의 최종평균은" 
	+ array[3] + "점 입니다.");	
}
}
