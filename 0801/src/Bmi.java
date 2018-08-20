import java.util.Scanner;
public class Bmi {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("이름을 입력해주세요 :");
	String name = scan.nextLine();
	System.out.print("키를을 입력해주세요 :");
	double tall = scan.nextDouble();
	System.out.print("몸무게을 입력해주세요 :");
	double weight = scan.nextDouble();
	
	// 몸무게 / 키의 제곱
	
	int bmi = (int)((weight/(tall*tall))*10000);
	
	if(bmi >= 35 ) 
		System.out.println(name +"님은 고도비만입니다.");
	else if(29.9 >= bmi && bmi >= 25)
		System.out.println(name +"님은 비만입니다.");
	else if(24.9 >= bmi && bmi> 23)
		System.out.println(name +"님은 과체중입니다.");
	else if(22.9 >= bmi && bmi> 18.5)
		System.out.println(name +"님은 정상체중입니다.");
	else if(bmi > 18.5)
		System.out.println("정상입니다.");
	
}
}
