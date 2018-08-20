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
		InputStream is = url.openStream(); //url�� ����� urlConnection�� inputStream�� ������.
		BufferedReader br = new BufferedReader(new InputStreamReader(is)); // �� ���� input�� ���� Bufferd ����
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("C:/temp/naver.html"))));
	    // ���� �������� 
		String line = null;
		while((line = br.readLine()) != null) { // ���پ� �о ���� ������ ���� ������
			pw.println(line); // ���Ͽ� �Է�
			pw.flush();	// �ѹ��� ������
			//System.out.println(line);
		}
		System.out.println("Save Successfully"); // �ݺ����� ������ ���������� �����ٴ� ���
		pw.close(); // �����Է� ��� �ݱ�
	}
}
