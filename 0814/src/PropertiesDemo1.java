import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
	public static void main(String[] args) 
	throws IOException{
		Properties info = new Properties();
		File file = new File("./info.properties");
		info.load(new FileInputStream(file));
		System.out.println(info.getProperty("name"));

	}
}
