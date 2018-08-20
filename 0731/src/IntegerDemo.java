
public class IntegerDemo {
public static void main(String[] args) {
	int su = 127;;
	System.out.printf("십진수 : %d\n", su);
	System.out.printf("8진수 : %o\n", su);
	System.out.printf("16진수 : %x\n", su);
	System.out.printf("2진수 :" + Integer.toBinaryString(su));
	
}
}
