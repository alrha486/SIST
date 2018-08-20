import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress [] ia = InetAddress.getAllByName("E-15"); // 입력한 hostname의 ip주소를 전부 가져오는 메소드
		for(InetAddress a : ia) {
			System.out.println(a.getHostAddress()); 
		}
	}
}