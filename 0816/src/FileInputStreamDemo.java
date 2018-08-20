import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�а���� ������ ��θ� �����ּ��� : ");
		String path = scan.nextLine(); 
		
		FileInputStream fis = null;
		byte [] buffer = new byte[512];
		
		try {
			fis = new FileInputStream(path);
			while(true) {
			int count = fis.read(buffer);
			if(count < 0 ) break;
			System.out.print(new String(buffer,0,count));
			}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
					System.out.println(e);
				}
		}
		
}
}
