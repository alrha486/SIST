import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

 class Input {
	private Student [] student;
	private Scanner scan;
	private File file = new File("./sungjuk.txt");
	
	public Input(Student [] student) {
	 this.file = file;
	 this.student = student;	
	 
	 try {
		 scan = new Scanner(file);
	 System.out.println("파일을 찾았습니다.");
	}catch(FileNotFoundException e){
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(-1);
		}
	}	
	public int input() {		
		int count=0;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String [] a = line.split("\\s+");
			
			String hakbun = a[0];
			String name = a[1];
			int kor = Integer.parseInt(a[2]);
			int eng = Integer.parseInt(a[3]);
			int mat = Integer.parseInt(a[4]);
			int edp = Integer.parseInt(a[5]);
		  
			Student student = new Student(hakbun, name, kor, eng, mat, edp);
			this.student[count] = student;
			
			count++;

		}
		return count; 
	}
	
	
	
}
