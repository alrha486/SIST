import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo1 {
	public static void main(String[] args) {
		String season = "";	int count = 0;
		byte [] buffer = new byte[512];
		
		System.out.print("당신은 어느계절을 좋아하십니까?? : ");
		
		try {
			count = System.in.read(buffer); // read()는 무조건 1byte만 읽음, count는 읽은 개수 
		}			
		catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("season : " + new String(buffer,0,count)); //String 클래스의 생성자 중에 byte배열을 통한 생성자가 있다.
	}
}
