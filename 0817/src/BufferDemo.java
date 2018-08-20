import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {
	public static void main(String[] args){
		BufferedReader br = null;
		BufferedWriter bw = null;
		String line = null;
		
		try {
			FileReader fr = new FileReader("src/OutputStreamDemo.java"); // �Է��� ���� ����, �о���ϴ� ������ �ݵ�� �־����
			FileWriter fw = new FileWriter("./copy.txt"); // ���� ���� ���� ���� , ������ ����� ������ ���� ����
			// ���� �ѱ��� �� ����ɱ��?
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			while((line = br.readLine()) != null) { //
				bw.write(line + "\n");
			}
			System.out.println("���� ���� �Ϸ�");
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				bw.close(); // �Է½�Ʈ�� �ݱ� 
				br.close(); // ��½�Ʈ�� �ݱ�
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}