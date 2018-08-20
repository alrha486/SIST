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
			FileReader fr = new FileReader("src/OutputStreamDemo.java"); // 입력할 파일 지정, 읽어야하는 파일은 반드시 있어야함
			FileWriter fw = new FileWriter("./copy.txt"); // 새로 만들 파일 지정 , 있으면 덮어쓰고 없으면 새로 생성
			// 과연 한글이 잘 복사될까요?
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			while((line = br.readLine()) != null) { //
				bw.write(line + "\n");
			}
			System.out.println("파일 복사 완료");
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				bw.close(); // 입력스트림 닫기 
				br.close(); // 출력스트림 닫기
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}