
import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String line = "1101 한송이		78	87	90	95";
//		String [] array = line.split("\\s+");
		
		StringTokenizer st = new StringTokenizer(line); // 인스턴스 생성
		String [] array = new String[st.countTokens()];
		
		
		int count = 0;
		while(count < array.length) {
			array[count] = st.nextToken();
					count++;
		}
		
		for(int i=0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
