import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("src/RandomAccessFileDemo.java");
		RandomAccessFile raf = new RandomAccessFile(file,"r");
		
		while(raf.getFilePointer() < raf.length()) { //파일의 포인터가 파일의 크기만큼 넘어서면 반복 중단
			String line = Utility.entoko(raf.readLine());
//			System.out.println(raf.readLine()); // 한줄읽어서 출력
			System.out.println(line);
		}
		
		raf.close();
	}
}
