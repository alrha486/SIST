
public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램시작");
		Student [] student = new Student[100];
		
		Input input = new Input(student);
		int count = input.input();
		
		Calc calc = new Calc(student, count);
		calc.Calc();
	
		Sort sort = new Sort(student, count);
		sort.BubbleSort();
		
		Output output = new Output(student,count);
		output.output();
		
		
		System.out.println("프로그램끝");
	}
}
