import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Input {
	private Vector<Student> vector;
	private Scanner scan;
	private Connection conn;
	
	public Input(Vector<Student> vector,Connection conn) {//������ //Main���� ���� vector �ޱ�
		this.vector = vector;
		this.conn = conn;
		File file = new File("./sungjuk.dat"); // ./������ġ ../�θ���ġ
		try {
			this.scan = new Scanner(file); //scan�� file�� ������ �ִ�.
		} catch (FileNotFoundException e) {//file ��ã����
			System.out.println("File Not Found");
			System.exit(-1);//������ ����   // 0 == ��������
		}
	}
	
	public void input() throws SQLException {
		
		while(this.scan.hasNextLine()) {//������ ���� ������ ���� �� ����
			String line = this.scan.nextLine(); //file ���� �����б� --> scan
			StringTokenizer st = new StringTokenizer(line);//() �ȿ��� �Ľ��� ���ڿ�
			String [] array = new String[st.countTokens()];//Token ���� ��ŭ �迭 ����
			int count = 0;
			while(st.hasMoreTokens()) {//count < st.countTokens()
				array[count++] = st.nextToken();
			}
			Student s = new Student(array[0],array[1],Integer.parseInt(array[2]),Integer.parseInt(array[3]),
														Integer.parseInt(array[4]),Integer.parseInt(array[5]));
			this.vector.addElement(s);//vector �� �߰� == addElement();
			
			Statement stmt = this.conn.createStatement();
			String sql = "INSERT INTO student(hakbun, irum, kor, eng, mat, edp)  ";
			sql +="VALUES('"+s.getHakbun()+"', '"+s.getIrum()+"', "+s.getKor()+", ";
			sql +=s.getKor()+", "+s.getEng()+", "+s.getMat()+", "+s.getEdp()+" )";
			stmt.executeUpdate(sql);
		}
	}
}