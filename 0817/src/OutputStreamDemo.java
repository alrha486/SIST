import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte [] buffer = new byte[512];
		int count = 0;
		
		try {
			// ���� �ѱ��� �� ����ɱ��?
			fis = new FileInputStream("src/OutputStreamDemo.java"); // �Է��� ���� ����, �о���ϴ� ������ �ݵ�� �־����
			fos = new FileOutputStream("./copy.txt"); // ���� ���� ���� ���� , ������ ����� ������ ���� ����
			while((count = fis.read(buffer)) >= 0) { //
				fos.write(buffer); 
				fos.flush();
			}
			System.out.println("���� ���� �Ϸ�");
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close(); // �Է½�Ʈ�� �ݱ� 
				fos.close(); // ��½�Ʈ�� �ݱ�
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}