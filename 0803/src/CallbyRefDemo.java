
public class CallbyRefDemo {
	public static void main(String[] args) {
		Product ballpen = new Product();
		input(ballpen); // call by reference
		output(ballpen); //call by reference
		
}
	static void input(Product p){
		p.name = "모나미볼펜";
		p.price = 100;
	}
	
	static void output(Product p){
		System.out.println("제품의 이름 : " + p.name);
		System.out.println("제품의 가격 : " + p.price);
	}
}
