public class MethodDemo {
public static void main(String[] args) {
	
	MethodDemo md = new MethodDemo();
	
	md.sum();
}

void sum()
{
	int sum = 0;
		for(int i =1; i<101; i++) {
			sum = sum+ i;
		}
		System.out.print("1부터 100까지의 합 : " + sum);
}


}
