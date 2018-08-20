import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("URL을 입력해주세요 : "); 
		String myURL = scan.nextLine();
		try {
			URL url = new URL(myURL); // 입력받은 URL로 url 생성
			System.out.println("Protocol : " + url.getProtocol());
			System.out.println("Host : " + url.getHost());
			System.out.println("Port Number : " + url.getDefaultPort());
			System.out.println("Default Port : " + url.getProtocol());
			System.out.println("File name : " + url.getFile());
			System.out.println("Query String : " + url.getQuery());
			System.out.println("Reference : " + url.getRef());
			
		} catch (MalformedURLException e) { 
			System.out.println(e);
		}
	}
}
