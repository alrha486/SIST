import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

 class Input {
	private Vector<Student> vector;
	private Scanner scan;
	private File file = new File("./sungjuk.txt");
	
	public Input(Vector<Student> vector) {
	 this.file = file;
	 this.vector = vector;	
	 
	 try {
		 scan = new Scanner(file);
	 System.out.println("파일을 찾았습니다.");
	}catch(FileNotFoundException e){
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(-1);
		}
	}	
	
	public void input() {		
		while(scan.hasNextLine()) {  // 다음 라인이 없을 때 까지 반복
			String line = scan.nextLine(); // 그 읽은 줄을 String 변수에 저장
			StringTokenizer st = new StringTokenizer(line); //  StringTokenizer 생성			
			String [] array = new String[st.countTokens()]; // 배열 안에 나눈 것들을 저장
			int count = 0;
			while(st.hasMoreTokens()) { // 다음 토큰이 없을 떄 까지
				array[count++] = st.nextToken();
			}
			Student s = new Student(array[0],array[1],Integer.parseInt(array[2]),
									Integer.parseInt(array[3]),	Integer.parseInt(array[4]),Integer.parseInt(array[5]));
			this.vector.addElement(s); // vector에 한 학생의 정보를 저장 
		}
	}
}
