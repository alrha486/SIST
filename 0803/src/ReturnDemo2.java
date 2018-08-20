import java.util.Scanner;
import java.util.Arrays;

public class ReturnDemo2 {
	public static void main(String[] args) {
		int[] array = null;
		array = new int[4];
		ReturnDemo2 rd = new ReturnDemo2();
		array = rd.input(array);
		
		array = rd.sort(array);
		
		rd.output(array);
		System.out.println("program over....!");
	
	}
	
	int[] input(int [] a){
		Scanner scan = new Scanner(System.in);
	
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
				
		}return a;
	}
	
	int[] sort(int[] a){
		Arrays.sort(a);
		return a;		
	}
	
	void output(int[] a){
		System.out.print(Arrays.toString(a));
	}
}
