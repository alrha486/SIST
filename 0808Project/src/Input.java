import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Input {
	
	private Scanner scan;
	private File file = new File("./productdata.txt");
	private Product [] product;
	
	public Input(Product [] product) {
		this.product = product;
		this.scan = scan;
		this.file =file;
		try {
			scan = new Scanner(file);
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(-1);
		}
		
	}
	
	public int input() {
		int count= 0 ;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String [] a = line.split("\\s+");
			int a1 = Integer.parseInt(a[1]);
			int a2 = Integer.parseInt(a[2]);
			int a3 = Integer.parseInt(a[3]);
			int a4 = Integer.parseInt(a[4]);
			
			Product product = new Product(a[0], a1, a2, a3,a4);
			this.product[count] = product;
			count++;
		}
			return count;
	}
	
}
