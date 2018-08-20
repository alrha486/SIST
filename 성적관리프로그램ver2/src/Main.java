import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램시작");
		
		Vector <Student> vector = new Vector<Student>(1,1); // 배열을 이용했을 떄보다 편리
			
		Input input = new Input(vector);
		input.input();
		
		Calc calc = new Calc(vector);
		calc.Calc();
	
		Sort sort = new Sort(vector);
		sort.BubbleSort();
		
		Output output = new Output(vector);
		output.output();
		
		System.out.println("프로그램끝");
	}
}
