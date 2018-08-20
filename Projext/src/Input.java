import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Input { // inputŬ������ ���� : 1.������ �Է¹���   2.���κ��� �Է¹޾� ������ ���� ã��   3.�� ����  
   private Scanner scan;//�������
   private File file = new File("./Input.txt"); 
   private PhoneFee [] pf; // PhoneFee Ŭ���� ���� ����
   
   public Input(PhoneFee [] pf) { //������ [������� �ʱ�ȭ]
      this.pf = pf;
      try {
         scan = new Scanner(file); // ������ ������ 
         JOptionPane.showMessageDialog(null, "������ �Է� �Ϸ��߽��ϴ�.");
      } catch (FileNotFoundException e) {
    	  JOptionPane.showMessageDialog(null, "������ ã�� �� �����ϴ�");
    	  // System.out.println("File Not Found"); 
    	  System.exit(-1);// -1 ����
      }
   }
      
   
   public int input() { // �޼ҵ�
	   int count = 0;
	   while(this.scan.hasNextLine()) { // ���� ������ ���� �� ���� �ݺ�
	   String line = this.scan.nextLine(); // �� ������ ����
	   String [] a = line.split("\\s+"); // ����(�����̽��� �ϳ� �̻�)�� �������� ������ �迭�� ����
	   
	   int division = Integer.parseInt(a[0]);
	   String tel = a[1];
	   String name = a[2];
	   int supply = Integer.parseInt(a[3]);
	   
	   PhoneFee pf = new PhoneFee(division,tel,name,supply);
	   System.out.println(division +  "  " + tel + "  " + name + "  " + supply);
	  // System.out.println(a[2]); // �迭�� 2��° ��(�̸�)�鸸 ���
	   this.pf[count] = pf;
	   count ++;
	   }
	   return count;
	  
}
   
//   public void input(Db [] array){   //public �� �ٱ����� ���� �����ϰ�. return���ص� �Ǹ� void.
//      Scanner scan = null;
      
      
/*      for(int i =0; i<array.length; i++) {
         
      System.out.print("���� :");   int num =scan.nextInt();
      System.out.print("��ȭ��ȣ :");   String tel =scan.next();
      System.out.print("�̸� :");   String name =scan.next();
      System.out.print("��ȭ�� :");   int time= scan.nextInt();
      
      Db db = new Db(num,tel, name ,time) ;
        array [i]=db;
      }   */
      
   }
