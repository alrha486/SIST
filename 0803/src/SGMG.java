import java.util.Scanner;
public class SGMG {
	public static void main(String[] args) {
		Student a = new Student();
		input(a);
		calc(a);
		output(a);
}
	static void input(Student a){
		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 이름을 입력해주세요 : ");
		a.setName(scan.nextLine());
		System.out.print("학생의 국어성적을 입력해주세요 : ");
		a.setKor(scan.nextInt());
		System.out.print("학생의 영어성적을 입력해주세요 : ");
		a.setEng(scan.nextInt());
		System.out.print("학생의 수학성적을 입력해주세요 : ");
		a.setMat(scan.nextInt());
	}
	static void calc(Student a){
		a.setSum(a.getKor()+a.getEng()+a.getMat());
		a.setAvg(a.getSum()/3);
	}
	static void output(Student a){
		System.out.println("이름 : " + a.getName());
		System.out.println("국어 : " + a.getKor());
		System.out.println("영어 : " + a.getEng());
		System.out.println("수학 : " + a.getMat());
		System.out.println("총합 : " + a.getSum());
		System.out.println("평균 : " + a.getAvg());
	}
}
