public class MethodDemo2 {
public static void main(String[] args) {
	
//	MethodDemo2 md = new MethodDemo2();
	
	System.out.println(sum(10,13)); 
}

static int sum(int j, int k)
{
	int sum = 0;
		for(int i =j; i<k+1; i++) {
			sum = sum+ i;
		}
		return sum;
}
}
