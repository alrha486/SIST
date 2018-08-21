import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ServerThread extends Thread{
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	

	public ServerThread(Socket socket) {
		this.socket = socket; // 매개변수 socket은 EchoTcpServer에서 넘어온 client
		InetAddress ia = this.socket.getInetAddress(); // 클라이언트의 주소를 get으로 얻어내 ia에 저장
		System.out.println("[" + ia.getHostAddress() + " ] 가 접속했습니다." );
		
		try {
			this.br = new BufferedReader(new InputStreamReader(this.socket.getInputStream())); 
				// 읽기전용 stream(client가 보낸 메시지를 읽을 Stream)
			this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream())));
				// 쓰기 전용 스트림(Client가 보낸 메시지를 다시 재전송해 줄 Stream)
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void run() { // 클라이언트가 말을하면 다시 반송해주는 스레드
		try {
		while(true){	
		String message = this.br.readLine(); // client가 보낸 메시지를 읽음
		if(message.equals("Bye"))break;
		System.out.println("Message From Client : " + message );
		this.pw.println(message); //프린트스트림에 받은 메시지를 담기
		this.pw.flush();  // 메세지를 flush()해주기
		}			
		}catch(IOException e) {
			System.out.println("Client is not Connected");
		}
	}
	
	protected void finalize() {
		try {
			this.socket.close();
			this.br.close();
			this.pw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	
	
}
