import java.util.Arrays;
public class ReturnDemo1 {
	public static void main(String[] args) {
	
		int [] array = {1,2,3,4}; // 참조변수이자 지역변수, 즉. 메인이 끝나면 유효하지않음 
//		array = demo(array);
		System.out.println(Arrays.toString(array));
}
//	static int demo(int []a) { 
//		a = new int[] {10,9,8,7,6,5,4,3,2,1};
//		return a;
//	}
	
}
