import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoTcpServer {
	private ServerSocket server;
	private Socket client;
	
	EchoTcpServer(){
		try {
			this.server = new ServerSocket(60000); // ������ port��ȣ 60000���� ���� ���� ����
			System.out.println("Service Ready"); 
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		while(true) { 
			try {
				this.client = this.server.accept(); // ����ڰ� ������ �� ������ �ڽ��� ���� ������ �����.
				ServerThread st = new ServerThread(this.client); // ����ڸ� ServerThread�����ڷ� ������.
				st.start(); // ServerThreadŬ������ run()ȣ��
			} catch (IOException e) {
				System.out.println("Not Connect");
			} 
		}
	}
	
	public static void main(String[] args) {
		new EchoTcpServer().service(); // ������ ���ÿ� service()ȣ��
	}
}
