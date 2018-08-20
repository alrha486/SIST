
public class Central {
	public static void main(String[] args) {
	PhoneFee [] pf = new PhoneFee[100];
	
	
	Input input = new Input(pf); //Input클래스 인스턴스 생성(Input클래스 가보면 알겠지만 파일 입력)
	int count = input.input(); // 메소드 호출 count값을 리턴하므로 변수에 저장 
	
	
//	Calc calc = new Calc(pf, count); // 값이 들어있는 배열과 count를 매개변수로 생성자로 보내기
//	calc.calc();
//	
//	Output output = new Output();
//	output.output(pf);
	
}
}
