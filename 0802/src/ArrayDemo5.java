import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] array = {4,5,6,7};
//	for(int su : array) {
//		System.out.println(su);
//	}	
	int[] a = new int[10]; 
	
	for(int i =0; i < 10; i++) {
		System.out.println(" ют╥б : ");
		a[i] = scan.nextInt();
	}
	
	System.out.println(Arrays.toString(a));
}
}
