import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo1 {
	public static void main(String[] args) {
		String season = "";	int count = 0;
		byte [] buffer = new byte[512];
		
		System.out.print("����� ��������� �����Ͻʴϱ�?? : ");
		
		try {
			count = System.in.read(buffer); // read()�� ������ 1byte�� ����, count�� ���� ���� 
		}			
		catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("season : " + new String(buffer,0,count)); //String Ŭ������ ������ �߿� byte�迭�� ���� �����ڰ� �ִ�.
	}
}
