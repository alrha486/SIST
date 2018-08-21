import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoTcpServer {
	private ServerSocket server;
	private Socket client;
	
	EchoTcpServer(){
		try {
			this.server = new ServerSocket(60000); // 생성시 port번호 60000으로 서버 소켓 생성
			System.out.println("Service Ready"); 
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		while(true) { 
			try {
				this.client = this.server.accept(); // 사용자가 들어왔을 때 서버가 자신의 하위 소켓을 만든다.
				ServerThread st = new ServerThread(this.client); // 사용자를 ServerThread생성자로 보낸다.
				st.start(); // ServerThread클래스의 run()호출
			} catch (IOException e) {
				System.out.println("Not Connect");
			} 
		}
	}
	
	public static void main(String[] args) {
		new EchoTcpServer().service(); // 생성과 동시에 service()호출
	}
}
