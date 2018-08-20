import java.io.UnsupportedEncodingException;

public class Utility {
	
	public static String entoko(String en) {
		String ko = null;
		
		try {
			ko = new String(en.getBytes("ISO8859_1"),"KSC5601");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}		
		return ko;	
	}
	
	public static String kotoen(String ko) {
			String en = null;
		
		try {
			ko = new String(ko.getBytes("KSC5601"),"ISO8859_1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}		
		return en;	
	}
	
	public static String entoutf8(String en) {
			String utf8 = null;
		
		try {
			en = new String(en.getBytes("ISO8859_1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}		
		return utf8;	
	}
	public static String utf8toen(String utf8) {
		String en = null;
		
	try {
		utf8 = new String(utf8.getBytes("UTF-8"),"ISO8859_1");
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}		
	return en;	
	}
}
