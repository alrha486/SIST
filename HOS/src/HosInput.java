import java.util.Scanner;

public class HosInput {
   private Hospital [] hos; 
   private String [] codeEx = {"MI", "NI", "SI", "TI", "VI", "WI"}; 
   private String answer;
   private int count =0;
    
    
   public HosInput(Hospital [] hos) {  // ���ο��� �޾ƿ� �迭 �ʱ�ȭ
      this.hos = hos; 
   }
   
   public int input() { // input �޼ҵ�
      do {
         Scanner scan = new Scanner(System.in); // Ű�����Է�
         
         System.out.println("��     ȣ : ");        // ��ȣ , �����ڵ� ,�Կ��ϼ�, ���� �Է�
         int num = scan.nextInt(); 
         System.out.println("�����ڵ� : ");
         String code = scan.next();
         System.out.println("�Կ��ϼ� : ");
         int day = scan.nextInt(); 
         System.out.println("��    ��  : ");
         int age = scan.nextInt();
         System.out.println("�Է�/���(I/O)? : ");  //  �� �Է� ���� �� ��� ���� �Է�
         answer = scan.next();             // �� ������ ����
         
         int errorCode = 0;                       // �����ڵ� 0���� �ʱ�ȭ  
         
         for(int index=0; index<codeEx.length; index++) {  // 
               if(code.equals(codeEx[index])) {
                  errorCode++;
               }//if
            }//for
            
         
            if(errorCode == 0) {
               System.out.println("�Է� ����");
               System.exit(-1);
            }
         
            Hospital  hos = new Hospital(num,code,day,age);
         this.hos[count] = hos;
         count ++;
      }
      while(answer.equals("I"));
      
      return count;
      
   }
}