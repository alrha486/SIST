import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException{
		File file = new File("C:/temp/data.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		
		raf.writeBoolean(false);
		raf.writeDouble(89.5);
		raf.writeInt(390);
		raf.writeChar(65);
		raf.writeUTF("Hello");
		raf.writeUTF("æ»≥Á«œººø‰");
		raf.seek((long)0);
		System.out.println(raf.readBoolean());
		System.out.println(raf.readDouble());
		System.out.println(raf.readInt());
		System.out.println(raf.readChar());
		System.out.println(raf.readUTF());
		System.out.println(raf.readUTF());
		
		
		raf.close();
		
	}
}
