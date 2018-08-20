import java.io.IOException;
import java.io.InputStream;

public class InputStramDemo {
	public static void main(String[] args) {
		System.out.print("당신은 어느계절을 좋아하십니까?? : ");
//		InputStream is = System.in; // 표준입력
		String season = "";
		int su = 0;
		try {
			while(true) 
			{
			su = System.in.read(); // read()는 무조건 1byte만 읽음..
			if(su < 0 || (char)su == '\n') break;
			season += (char)su;
			}
			
		}catch (IOException e) {
			System.out.println(e);
		}System.out.println("season : " + season);
	}
}
