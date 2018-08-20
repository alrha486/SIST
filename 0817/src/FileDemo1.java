import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo1 {
	public static void main(String[] args) throws IOException{
		System.out.print("Path�� �Է����ּ��� : ");	
		Scanner scan = new Scanner(System.in);
		String path = scan.nextLine();
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println("path = " + file.getPath()); // ���ϰ��
			System.out.println("absolute path = " + file.getAbsolutePath()); // ������
			System.out.println("canonical path = " + file.getCanonicalPath()); // ���԰��
 		}else {
			System.out.println("������ ã�� �� �����ϴ�/");
			System.exit(-1);
		}
		
		 
	}
}