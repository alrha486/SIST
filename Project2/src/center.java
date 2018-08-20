
public class center {
public static void main(String[] args) {
	PhoneFee [] pf = new PhoneFee[100];
		
	Input input = new Input(pf);
	int count = input.input();	
	
	Calc calc = new Calc(pf,count);
	calc.calc();

//		System.out.println(pf[0].getName());

	
//	input.input();
}
}
