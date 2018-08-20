public class OpDemo {
public static void main(String[] args) {
/*	
	int a = -79;
	System.out.println(Integer.toBinaryString(a)); // a¸¦ 2Áø¼ö·Î ¹Ù²Ù±â
	int result = a >>> 3; // 79 / 2ÀÇ 3½Â
	System.out.println(result); 
	System.out.println(Integer.toBinaryString(result)); 
	
*/
	
int a = 20;
System.out.println(Integer.toBinaryString(a));
int result = a << 3; // 20¿¡ 2ÀÇ3½Â 3¹ø °ö = 160
System.out.println(Integer.toBinaryString(result));
System.out.println(Integer.toString(result));

}
}
