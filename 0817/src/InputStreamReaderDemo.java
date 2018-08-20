import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException{
		System.out.println(" 당신이 좋아하는 계절을 입력해주세요 : ");
		InputStream is = System.in; // 바이트배열. 영어를 읽는거는 문제없으나 한글읽는데는 무리가있음
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String season = br.readLine();
		System.out.println("season : " +  season);
	}
}
