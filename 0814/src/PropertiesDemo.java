import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		System.out.println(System.getProperty("file.encoding"));
		Properties info = System.getProperties();
		Enumeration <Object> enums = info.keys();
		
		while(enums.hasMoreElements()) {
			String key = (String)enums.nextElement();
			System.out.println(key + "            " + System.getProperty(key));
		}
		
	}
}
