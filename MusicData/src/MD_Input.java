// Who : 이진웅
// When : 2018-08-17
// Why : 입력을 받아 저장하는 input클래스
// Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192

import java.util.Scanner;
import java.util.Vector;

public class MD_Input {
   private Vector <MD_Sailer> sailerVector; //소매점 클래스 벡터
   private Vector <MD_InputData> inputVector; //입력 데이타를 받는 클래스 벡터
   private Scanner scan = new Scanner(System.in);
      
      public MD_Input(Vector <MD_Sailer> sailerVector, Vector <MD_InputData> inputVector ) { //input 클래스 생성자
         this.sailerVector = sailerVector;
         this.inputVector = inputVector;
      }
      
      public void input() { // input 메소드
         String answer = null;
         do {
            System.out.println("소매점번호            : ");
            int sellNumb = scan.nextInt(); // 소매점 번호
            System.out.println("음악종류코드         : ");
            String kindMusic = scan.next(); // 음악종류 코드
            System.out.println("판매수량               : ");
            int sellEa = scan.nextInt(); // 판매 수량
            System.out.println("입력/출력(I/O)? : ");
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
