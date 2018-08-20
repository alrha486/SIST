import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input{
	private File file = new File("./Input.txt");
	private Scanner scan;
	private PhoneFee[] pf;
	
	public Input(PhoneFee[]  pf) {
		this.pf = pf;
		try{
			scan = new Scanner(file);
			System.out.println("파일을 찾았습니다.");
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다/");
		}		
	}
	
	public int input() {
		  int count = 0;
		  while(scan.hasNextLine()) {
			  String line = scan.nextLine();
			  String [] a = line.split("\\s+");
			  
			  int a1 = Integer.parseInt(a[0]);
			  String a2 = a[1];
			  String a3 = a[2];
			  int a4 = Integer.parseInt(a[3]);
			  
			  PhoneFee pf = new PhoneFee(a1,a2,a3,a4);
			  this.pf[count] = pf;			  
			  count ++;
		  }
		  return count;
	}
	
	
	
}