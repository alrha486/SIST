public class ValueCopyDemo {
public static void main(String[] args) {
	int su = 5;
	int num = su;
	
	System.out.printf("su = %d, num = %d\n", su, num);
	su = 100;
	System.out.printf("su = %d, num = %d", su, num);
	
}
}
