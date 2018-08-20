import java.util.Arrays;

public class Example {
public static void main(String[] args) {
	int [] a; 
	a = sosu();
	
//	System.out.println(Arrays.toString(a));
}
static int [] sosu() {
	int [] a = new int[60];	
	for(int i=2; i<51;i++) {
		if(i % 2 == 1) {
			a[i-2] = i;
		}
		}
	return a;
}

}
