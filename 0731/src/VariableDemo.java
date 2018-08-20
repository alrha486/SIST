
public class VariableDemo {
public static void main(String [] args) {
	byte age; // 선언
	age = 24; // 할당
	
	double height = 175.8; // 초기화
	
	//System.out.print("나이는 " + age + "살 입니다."); 
	//System.out.print("키는 " + height + "cm 입니다.");
	 
	//System.out.println("나이는 " + age + "살 입니다.");
	//System.out.println("키는 " + height + "cm 입니다.");
	
	System.out.printf("age = %d 입니다.\n", age);
	System.out.printf("height = %.1f cm 입니다.", height);

	
}
}
