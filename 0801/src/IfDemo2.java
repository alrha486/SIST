import java.util.Scanner;

public class IfDemo2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("이름을 입력해주세요 : ");
	String name = scan.nextLine();
	System.out.print("출생년도를 입력해주세요 :");
	int year = scan.nextInt();
	int year2 = (2018-year +1);
	
	if(year%12 ==0)
		System.out.println(name + "님은 "+ year2 + " 살이고 원숭이 띠 입니다."  );
	else if (year%12 ==1)
		System.out.println(name + "님은 "+ year2 + " 살이고 닭 띠 입니다."  );
	else if(year%12 ==2)
		System.out.println(name +  "님은 "+ year2 + " 살이고 띠 입니다."  );
	else if(year%12 ==3)
		System.out.println(name +  "님은 "+ year2 + " 살이고 띠 입니다."  );
	else if(year%12 ==4)
		System.out.println(name +  "님은 "+ year2 + " 살이고 띠 입니다."  );
	else if(year%12 ==5)
		System.out.println(name +  "님은 "+ year2 + " 살이고띠 입니다."  );
	else if(year%12 ==6)
		System.out.println(name +  "님은 "+ year2 + " 살이고 띠 입니다."  );
	else if(year%12 ==7)
		System.out.println(name +  "님은 "+ year2 + " 살이고 띠 입니다."  );
	else if(year%12 ==8)
		System.out.println(name +  "님은 "+ year2 + " 살이고 띠 입니다."  );
	else if(year%12 ==9)
		System.out.println(name +  "님은 "+ year2 + " 살이고 띠 입니다."  );
	else if(year%12 ==10)
		System.out.println(name +  "님은 "+ year2 + " 살이고 띠 입니다."  );
	else if(year%12 ==11)
		System.out.println(name +  "님은 "+ year2 + " 살이고 띠 입니다."  );
	


}
}
