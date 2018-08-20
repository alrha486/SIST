public class ReturnDemo {
	public static void main(String[] args) {
		
		ReturnDemo rd = new ReturnDemo();
		String result = rd.demo(6); // call by value
		//String result = demo();
		System.out.println(result);
	}
	
	static String demo(int a) { // 멤버 메소드, 인스턴스 메소드 , static이 붙지 않았기때문에 주소로 접근
		if(a % 2 ==0) return "Hello"; 
		else return "World";		
	}
	
}
