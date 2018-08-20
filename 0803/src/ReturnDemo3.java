import java.util.Arrays;
import java.util.Scanner;
public class ReturnDemo3 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		
		System.out.println("program start...!");
		input(arr);
		sort(arr);
		output(arr);
		System.out.println("program over....!");
	}
	
	static void input(int arr[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("배열에 들어갈 숫자를 입력해주세요.");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
	}
	
	static void sort(int arr[]){
		Arrays.sort(arr);
	}

	static void output(int arr[]){
		System.out.println(Arrays.toString(arr));
	}
	
}
