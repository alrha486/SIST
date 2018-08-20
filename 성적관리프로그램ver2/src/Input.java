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
	 System.out.println("������ ã�ҽ��ϴ�.");
	}catch(FileNotFoundException e){
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(-1);
		}
	}	
	
	public void input() {		
		while(scan.hasNextLine()) {  // ���� ������ ���� �� ���� �ݺ�
			String line = scan.nextLine(); // �� ���� ���� String ������ ����
			StringTokenizer st = new StringTokenizer(line); //  StringTokenizer ����			
			String [] array = new String[st.countTokens()]; // �迭 �ȿ� ���� �͵��� ����
			int count = 0;
			while(st.hasMoreTokens()) { // ���� ��ū�� ���� �� ����
				array[count++] = st.nextToken();
			}
			Student s = new Student(array[0],array[1],Integer.parseInt(array[2]),
									Integer.parseInt(array[3]),	Integer.parseInt(array[4]),Integer.parseInt(array[5]));
			this.vector.addElement(s); // vector�� �� �л��� ������ ���� 
		}
	}
}
