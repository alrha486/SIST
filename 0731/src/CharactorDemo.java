public class CharactorDemo {
public static void main(String[] args) {
	char grade = 'B';
	int a = 65;
	
	System.out.println("당신의 학점은 : " + grade + "학점 입니다.");

	System.out.printf("당신의 학점은 : %d학점 입니다.\n", (int)grade );
	System.out.printf("당신의 학점은 : %c+학점 입니다.", (char)a );
}
}
