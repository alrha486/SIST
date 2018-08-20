import java.util.Arrays;

public class GenericDemo3 {
	public static void main(String[] args) {
		String [] array = {"Hello", "이진웅", "World", "서정은"};
		sort(array);
	}	
	static void sort(String [] array) {
		Arrays.sort(array);
		for(String str : array) {
			System.out.println(str);
		}
	}
}

