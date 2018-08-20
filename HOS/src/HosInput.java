import java.util.Scanner;

public class HosInput {
   private Hospital [] hos; 
   private String [] codeEx = {"MI", "NI", "SI", "TI", "VI", "WI"}; 
   private String answer;
   private int count =0;
    
    
   public HosInput(Hospital [] hos) {  // 메인에서 받아온 배열 초기화
      this.hos = hos; 
   }
   
   public int input() { // input 메소드
      do {
         Scanner scan = new Scanner(System.in); // 키보드입력
         
         System.out.println("번     호 : ");        // 번호 , 진료코드 ,입원일수, 나이 입력
         int num = scan.nextInt(); 
         System.out.println("진료코드 : ");
         String code = scan.next();
         System.out.println("입원일수 : ");
         int day = scan.nextInt(); 
         System.out.println("나    이  : ");
         int age = scan.nextInt();
         System.out.println("입력/출력(I/O)? : ");  //  재 입력 여부 및 출력 여부 입력
         answer = scan.next();             // 각 변수에 저장
         
         int errorCode = 0;                       // 에러코드 0으로 초기화  
         
         for(int index=0; index<codeEx.length; index++) {  // 
               if(code.equals(codeEx[index])) {
                  errorCode++;
               }//if
            }//for
            
         
            if(errorCode == 0) {
               System.out.println("입력 오류");
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