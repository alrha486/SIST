import java.util.Arrays;

import sun.applet.Main;

public class Example2 {
	public static void main(String[] args) {
	
		int []a = new int[100];
		a = sum();
		System.out.println(Arrays.toString(a));
}
	void sum(int i) {
		
	}
	static int [] sum() {		
		int [] a = new int[100];
		for(int i=1; i<101; i++) {
		if(i == 1) {
			a[i-1] = i;
		}else {
			a[i-1] = a[i-2] + i;	
		}		
		}
		
		return a;
		
	}
	
}
