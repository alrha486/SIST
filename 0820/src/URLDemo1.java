import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo1 {
	public static void main(String[] args) throws MalformedURLException, IOException{
		URL url = new URL("https://www.naver.com/index.html");
		InputStream is = url.openStream(); //url과 연결된 urlConnection의 inputStream을 얻어오기.
		BufferedReader br = new BufferedReader(new InputStreamReader(is)); // 더 빠른 input을 위해 Bufferd 장착
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("C:/temp/naver.html"))));
	    // 파일 가져오기 
		String line = null;
		while((line = br.readLine()) != null) { // 한줄씩 읽어서 다음 라인이 없을 떄까지
			pw.println(line); // 파일에 입력
			pw.flush();	// 한번에 보내기
			//System.out.println(line);
		}
		System.out.println("Save Successfully"); // 반복문이 끝나면 성공적으로 마쳣다는 출력
		pw.close(); // 파일입력 통로 닫기
	}
}
