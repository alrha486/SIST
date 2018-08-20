import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("C:/");
		File [] array = file.listFiles();
		
		for(File f : array) {
			Date d = new Date(f.lastModified()); // 파일의 마지막 수정시간 
			String pattern = "yyyy-MM-dd    aa  hh:mm\t";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			System.out.print(sdf.format(d) + "\t");
			if(f.isDirectory()) System.out.print("<DIR>\t\t\t");
			else System.out.printf("%,d\t\t\t", f.length());
			System.out.println("\t" + f.getName());
		}
	}
}
