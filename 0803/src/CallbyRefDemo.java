
public class CallbyRefDemo {
	public static void main(String[] args) {
		Product ballpen = new Product();
		input(ballpen); // call by reference
		output(ballpen); //call by reference
		
}
	static void input(Product p){
		p.name = "�𳪹̺���";
		p.price = 100;
	}
	
	static void output(Product p){
		System.out.println("��ǰ�� �̸� : " + p.name);
		System.out.println("��ǰ�� ���� : " + p.price);
	}
}
