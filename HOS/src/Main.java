import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Hospital [] hos;
		HosInput input;
		HosClac calc;
		HosOutput output;
		HosSort sort;
		
		int count;
		
		
		hos = new Hospital[100];
		input = new HosInput(hos);
		count = input.input();
		calc = new HosClac(hos, count);
		calc.hosCalc();
		sort = new HosSort(hos, count);
		sort.bubbleSort();
		output = new HosOutput(hos, count);
		output.output();

	}
}