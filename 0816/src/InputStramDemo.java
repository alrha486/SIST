import java.io.IOException;
import java.io.InputStream;

public class InputStramDemo {
	public static void main(String[] args) {
		System.out.print("����� ��������� �����Ͻʴϱ�?? : ");
//		InputStream is = System.in; // ǥ���Է�
		String season = "";
		int su = 0;
		try {
			while(true) 
			{
			su = System.in.read(); // read()�� ������ 1byte�� ����..
			if(su < 0 || (char)su == '\n') break;
			season += (char)su;
			}
			
		}catch (IOException e) {
			System.out.println(e);
		}System.out.println("season : " + season);
	}
}
