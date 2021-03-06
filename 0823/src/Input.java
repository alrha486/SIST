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
	
	public Input(Vector<Student> vector,Connection conn) {//생성자 //Main에서 보낸 vector 받기
		this.vector = vector;
		this.conn = conn;
		File file = new File("./sungjuk.dat"); // ./현재위치 ../부모위치
		try {
			this.scan = new Scanner(file); //scan이 file을 가지고 있다.
		} catch (FileNotFoundException e) {//file 못찾으면
			System.out.println("File Not Found");
			System.exit(-1);//비정상 종료   // 0 == 정상종료
		}
	}
	
	public void input() throws SQLException {
		
		while(this.scan.hasNextLine()) {//파일의 다음 라인이 없을 때 까지
			String line = this.scan.nextLine(); //file 정보 한줄읽기 --> scan
			StringTokenizer st = new StringTokenizer(line);//() 안에는 파싱할 문자열
			String [] array = new String[st.countTokens()];//Token 갯수 만큼 배열 생성
			int count = 0;
			while(st.hasMoreTokens()) {//count < st.countTokens()
				array[count++] = st.nextToken();
			}
			Student s = new Student(array[0],array[1],Integer.parseInt(array[2]),Integer.parseInt(array[3]),
														Integer.parseInt(array[4]),Integer.parseInt(array[5]));
			this.vector.addElement(s);//vector 값 추가 == addElement();
			
			Statement stmt = this.conn.createStatement();
			String sql = "INSERT INTO student(hakbun, irum, kor, eng, mat, edp)  ";
			sql +="VALUES('"+s.getHakbun()+"', '"+s.getIrum()+"', "+s.getKor()+", ";
			sql +=s.getKor()+", "+s.getEng()+", "+s.getMat()+", "+s.getEdp()+" )";
			stmt.executeUpdate(sql);
		}
	}
}
