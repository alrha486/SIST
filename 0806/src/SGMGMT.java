import java.util.Scanner;
public class SGMGMT {
	public static void main(String[] args) {
		
		Student [] s = new Student[2]; // 2���� �迭 �� ����
		
		Input i = new Input();
		i.input(s);		
		
		Calc c = new Calc();
		c.calc(s);
		
		Output o = new Output();
		o.output(s);
}	
}
