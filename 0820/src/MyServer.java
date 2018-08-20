import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	private ServerSocket server;
	private Socket client;
	private BufferedReader br;
	private PrintWriter pw;
	
	MyServer(){
		try {
			this.server = new ServerSocket(80); // 0~65535 중 안쓰는 포트를 사용하여 서버소켓을 하나 생성
			System.out.println("I'm Ready!");
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	private void service() {
		//while(true) {
			try {
				this.client = this.server.accept(); // 클라이언트의 요청이 들어오면 server가 하위 자식 프로세스를 생성해 client와 통신가능
				this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.client.getOutputStream())));
				File file = new File("./index.html");
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line = null;
				while((line = br.readLine()) != null) { // 파일을 한줄씩 읽기
					this.pw.println(line);  // pw 통로에 읽은 줄을 입력
					this.pw.flush();
				}
//				this.br = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
//				String line = null;
//				while((line = br.readLine()) != null) {
//					System.out.println(line);
//				}
				
			}catch(IOException e) {
				System.out.println(e);
			//}
		}finally {
			try {
				this.client.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
	
	
	public static void main(String[] args) {
		new MyServer().service();
	}
}
