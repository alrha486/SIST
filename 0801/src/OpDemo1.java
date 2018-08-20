
public class OpDemo1 {
public static void main(String[] args) {
	
//	boolean a = 5 < 4 ; // °ÅÁþ
//	boolean b = 5 < 6 ; // Âü 
//	
	
	int a = 45, b = 78;
	System.out.println(Integer.toBinaryString(a));
	System.out.println(Integer.toBinaryString(b));
	int result = a & b ; 
	System.out.println(Integer.toBinaryString(result));
	result = a | b ; 
	System.out.println(Integer.toBinaryString(result));
	result = a ^ b ; 
	System.out.println(Integer.toBinaryString(result));
	
		

	

	
}
}
