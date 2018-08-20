// 상속이 안되는 4가지
// 1. private member
// 2. overShadow
// 3. 생성자  
public class SangsokDemo {
	public static void main(String[] args) {
		Bumo b = new Bumo();
		Jasik j = new Jasik();
		System.out.println(j.toString());		
	}
}

class Bumo{
	String name;	
}

class Jasik extends Bumo{
	String hak;
	}

	
	
