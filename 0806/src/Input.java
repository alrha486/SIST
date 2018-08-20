import java.util.Scanner;

public class Input {
	public void input(Student [] s){
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<s.length ; i++) {
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		System.out.print("국어점수을 입력해주세요 : ");
		int kor = scan.nextInt();
		System.out.print("영어점수을 입력해주세요 : ");
		int eng = scan.nextInt();
		System.out.print("수학점수을 입력해주세요 : ");
		int mat = scan.nextInt();
		
		Student student = new Student(name,kor,eng,mat); // 입력 받은 내용을 생성자 호출로 초기화
		s[i] = student;
		}
		
	}
}
