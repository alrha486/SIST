import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo1 {
	public static void main(String[] args) throws IOException{
		System.out.print("Path를 입력해주세요 : ");	
		Scanner scan = new Scanner(System.in);
		String path = scan.nextLine();
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println("path = " + file.getPath()); // 파일경로
			System.out.println("absolute path = " + file.getAbsolutePath()); // 절대경로
			System.out.println("canonical path = " + file.getCanonicalPath()); // 정규경로
 		}else {
			System.out.println("파일을 찾을 수 없습니다/");
			System.exit(-1);
		}
		
		 
	}
}