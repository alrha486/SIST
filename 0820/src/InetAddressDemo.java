import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress [] ia = InetAddress.getAllByName("E-15"); // �Է��� hostname�� ip�ּҸ� ���� �������� �޼ҵ�
		for(InetAddress a : ia) {
			System.out.println(a.getHostAddress()); 
		}
	}
}