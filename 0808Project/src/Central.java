public class Central {
public static void main(String[] args) {
	
	Product [] product = new Product[100];
	Input input = new Input(product);
	int count = input.input();
	
	Calc calc = new Calc(product,count);
	calc.calc();
	
	Sort sort = new Sort(product,count);
	sort.selectionSort();
	
	Output output = new Output(product,count);
	output.output();
	
}
	
}
