import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException{
		System.out.println(" ����� �����ϴ� ������ �Է����ּ��� : ");
		InputStream is = System.in; // ����Ʈ�迭. ��� �д°Ŵ� ���������� �ѱ��дµ��� ����������
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String season = br.readLine();
		System.out.println("season : " +  season);
	}
}
