import java.util.Scanner;


public class Result {
public static void main(String[] args) {

	
	Scanner scan = new Scanner(System.in);
	System.out.print("이름을 입력해주세요 : ");
	String name = scan.nextLine();
	System.out.print("국어점수를 입력해주세요: ");
	int kor = scan.nextInt();
	System.out.print("영어점수를 입력해주세요: ");
	int eng = scan.nextInt();
	System.out.print("수학성적을 입력해주세요 : ");
	int mat = scan.nextInt();
	
	double sum = (kor + eng + mat)/3; 

//	if(sum > 90 ) {
//		System.out.println(name + "님의 학점은 A입니다.");
//	}
//	else if(sum > 80 ) {
//		System.out.println(name + "님의 학점은 B입니다.");
//	}
//	else if(sum > 80 ) {
//		System.out.println(name + "님의 학점은 C입니다.");
//	}
//	else {
//		System.out.println(name + "님의 학점은 D입니다.");
//	}
	
	char result = (sum <= 100 && sum > 90) ? 'A':
		(sum >= 89 && sum > 80) ? 'B':
			(sum >= 79 && sum > 70) ? 'C':
				(sum >= 69 && sum > 60) ? 'D':
					(sum >= 59 && sum > 50) ? 'E' : 'F';
		System.out.println(name + "님의 최종 성적은 " + result + "헉점 입니다.");
		

		
}
}
