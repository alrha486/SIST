// Who : ������
// When : 2018-08-17
// Why : �Է��� �޾� �����ϴ� inputŬ����
// Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192

import java.util.Scanner;
import java.util.Vector;

public class MD_Input {
   private Vector <MD_Sailer> sailerVector; //�Ҹ��� Ŭ���� ����
   private Vector <MD_InputData> inputVector; //�Է� ����Ÿ�� �޴� Ŭ���� ����
   private Scanner scan = new Scanner(System.in);
      
      public MD_Input(Vector <MD_Sailer> sailerVector, Vector <MD_InputData> inputVector ) { //input Ŭ���� ������
         this.sailerVector = sailerVector;
         this.inputVector = inputVector;
      }
      
      public void input() { // input �޼ҵ�
         String answer = null;
         do {
            System.out.println("�Ҹ�����ȣ            : ");
            int sellNumb = scan.nextInt(); // �Ҹ��� ��ȣ
            System.out.println("���������ڵ�         : ");
            String kindMusic = scan.next(); // �������� �ڵ�
            System.out.println("�Ǹż���               : ");
            int sellEa = scan.nextInt(); // �Ǹ� ����
            System.out.println("�Է�/���(I/O)? : ");
            answer = scan.next();
            
            MD_Sailer  sailer = new MD_Sailer(sellNumb,sellEa,kindMusic);
            MD_InputData inputd = new MD_InputData(sellNumb,sellEa,kindMusic);
            
            this.sailerVector.add(sailer);
            this.inputVector.add(inputd);
            
            
            
         }while(answer.equals("I"));
      }

      public Vector<MD_Sailer> getSailerVector() {
         return sailerVector;
      }

      public Vector<MD_InputData> getInputVector() {
         return inputVector;
      }
   
      
      
      
      
}
