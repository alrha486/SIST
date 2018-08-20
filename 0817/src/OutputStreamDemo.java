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
			// 과연 한글이 잘 복사될까요?
			fis = new FileInputStream("src/OutputStreamDemo.java"); // 입력할 파일 지정, 읽어야하는 파일은 반드시 있어야함
			fos = new FileOutputStream("./copy.txt"); // 새로 만들 파일 지정 , 있으면 덮어쓰고 없으면 새로 생성
			while((count = fis.read(buffer)) >= 0) { //
				fos.write(buffer); 
				fos.flush();
			}
			System.out.println("파일 복사 완료");
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close(); // 입력스트림 닫기 
				fos.close(); // 출력스트림 닫기
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}