import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("src/RandomAccessFileDemo.java");
		RandomAccessFile raf = new RandomAccessFile(file,"r");
		
		while(raf.getFilePointer() < raf.length()) { //������ �����Ͱ� ������ ũ�⸸ŭ �Ѿ�� �ݺ� �ߴ�
			String line = Utility.entoko(raf.readLine());
//			System.out.println(raf.readLine()); // �����о ���
			System.out.println(line);
		}
		
		raf.close();
	}
}
