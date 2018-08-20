import java.util.Scanner;

public class ArrayDemo6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Student[] a = new Student[2];
	
	for(int i =0; i<a.length ; i++) {	
		a[i] = new Student();
		
		System.out.print("학생의 이름를 입력해주세요 : ");
		a[i].name = scan.next();
		System.out.print("학생의 국어점수를 입력해주세요 : ");
		a[i].kor = scan.nextInt();
		System.out.print("학생의 영어점수를 입력해주세요 : ");
		a[i].eng = scan.nextInt();
		System.out.print("학생의 수학점수를 입력해주세요 : ");
		a[i].mat = scan.nextInt();
		a[i].sum = a[i].kor + a[i].eng + a[i].mat;
		a[i].avg = a[i].sum/3;
	}
	
	for(int j=1; j<a.length+1; j++) {
		System.out.println("<< " + j + "번째 학생의 정보 >> ");
		System.out.println("이름 : " + a[j-1].name);
		System.out.println("국어 점수 : " + a[j-1].kor);
		System.out.println("영어 점수 : " + a[j-1].eng);
		System.out.println("수학 점수 : " + a[j-1].mat);
		System.out.println("총합 점수 : " + a[j-1].sum);
		System.out.println("평균 점수 : " + a[j-1].avg);
	}
	
	

	
	
	


	
	
	
//	array[0] = new Student();
//	array[0].name = "이진웅";
//	array[0].age = 25;
//	array[0].add = "서울";
//	
//	array[1] = new Student();
//	array[1].name = "서정은♥";
//	array[1].age = 25;
//	array[1].add = "부천";
//	
//	for(int i=0; i<array.length;i++) {
//		System.out.println("<< " +i + "번째 학생의 정보 >>");
//		System.out.println(array[i].name + array[i].age + array[i].add);
//	}
//	
}
}
