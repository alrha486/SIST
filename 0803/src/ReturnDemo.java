public class ReturnDemo {
	public static void main(String[] args) {
		
		ReturnDemo rd = new ReturnDemo();
		String result = rd.demo(6); // call by value
		//String result = demo();
		System.out.println(result);
	}
	
	static String demo(int a) { // ��� �޼ҵ�, �ν��Ͻ� �޼ҵ� , static�� ���� �ʾұ⶧���� �ּҷ� ����
		if(a % 2 ==0) return "Hello"; 
		else return "World";		
	}
	
}
