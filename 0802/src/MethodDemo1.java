public class MethodDemo1 {
public static void main(String[] args) {
	
	MethodDemo1 md = new MethodDemo1();
	
	md.sum(30,50); // 값에 의한 호출 
}

void sum(int j, int k)
{
	int sum = 0;
		for(int i =j; i<k+1; i++) {
			sum = sum+ i;
		}
		System.out.printf("1부터 %d까지의 합 : %d",j, sum);
}


}
