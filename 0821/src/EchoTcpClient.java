import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoTcpClient {
	private Socket socket;
	private PrintWriter pw;
	private BufferedReader br;
	
	EchoTcpClient(){
		try {
			this.socket = new Socket(InetAddress.getByName("E-00"),60000);  // 클라이언트 소켓과 서버소켓의 연결
			System.out.println("방금 서버와 연결되었습니다.");
			this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream())));
			this.br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	private void service() throws IOException { // 서버에게 데이터를 보낼 service();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("서버에게 보낼 메시지를 입력해주세요 : ");
			String line = scan.nextLine();
			if(line.equals("Bye")) {
				this.pw.println(line);
				this.pw.flush(); 
				break; // Bye가 들어오면 무한루프 종료
			}
			this.pw.println(line);
			this.pw.flush();
			String massage = this.br.readLine();
			System.out.println("Message From Server : " + massage);
			
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
	
	public static void main(String[] args) {
		try {
			new EchoTcpClient().service();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
