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
		this.socket = socket; // �Ű����� socket�� EchoTcpServer���� �Ѿ�� client
		InetAddress ia = this.socket.getInetAddress(); // Ŭ���̾�Ʈ�� �ּҸ� get���� �� ia�� ����
		System.out.println("[" + ia.getHostAddress() + " ] �� �����߽��ϴ�." );
		
		try {
			this.br = new BufferedReader(new InputStreamReader(this.socket.getInputStream())); 
				// �б����� stream(client�� ���� �޽����� ���� Stream)
			this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream())));
				// ���� ���� ��Ʈ��(Client�� ���� �޽����� �ٽ� �������� �� Stream)
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void run() { // Ŭ���̾�Ʈ�� �����ϸ� �ٽ� �ݼ����ִ� ������
		try {
		while(true){	
		String message = this.br.readLine(); // client�� ���� �޽����� ����
		if(message.equals("Bye"))break;
		System.out.println("Message From Client : " + message );
		this.pw.println(message); //����Ʈ��Ʈ���� ���� �޽����� ���
		this.pw.flush();  // �޼����� flush()���ֱ�
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
