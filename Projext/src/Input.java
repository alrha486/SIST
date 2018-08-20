import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Input { // input클래스의 목적 : 1.파일을 입력받음   2.라인별로 입력받아 라인의 갯수 찾기   3.값 세팅  
   private Scanner scan;//멤버변수
   private File file = new File("./Input.txt"); 
   private PhoneFee [] pf; // PhoneFee 클래스 변수 생성
   
   public Input(PhoneFee [] pf) { //생성자 [멤버변수 초기화]
      this.pf = pf;
      try {
         scan = new Scanner(file); // 파일이 있으면 
         JOptionPane.showMessageDialog(null, "파일을 입력 완료했습니다.");
      } catch (FileNotFoundException e) {
    	  JOptionPane.showMessageDialog(null, "파일을 찾을 수 없습니다");
    	  // System.out.println("File Not Found"); 
    	  System.exit(-1);// -1 종료
      }
   }
      
   
   public int input() { // 메소드
	   int count = 0;
	   while(this.scan.hasNextLine()) { // 다음 라인이 없을 떄 까지 반복
	   String line = this.scan.nextLine(); // 그 라인을 저장
	   String [] a = line.split("\\s+"); // 라인(스페이스바 하나 이상)을 기준으로 나눠서 배열에 저장
	   
	   int division = Integer.parseInt(a[0]);
	   String tel = a[1];
	   String name = a[2];
	   int supply = Integer.parseInt(a[3]);
	   
	   PhoneFee pf = new PhoneFee(division,tel,name,supply);
	   System.out.println(division +  "  " + tel + "  " + name + "  " + supply);
	  // System.out.println(a[2]); // 배열의 2번째 값(이름)들만 출력
	   this.pf[count] = pf;
	   count ++;
	   }
	   return count;
	  
}
   
//   public void input(Db [] array){   //public 은 바깥에서 접근 가능하게. return안해도 되면 void.
//      Scanner scan = null;
      
      
/*      for(int i =0; i<array.length; i++) {
         
      System.out.print("구분 :");   int num =scan.nextInt();
      System.out.print("전화번호 :");   String tel =scan.next();
      System.out.print("이름 :");   String name =scan.next();
      System.out.print("통화량 :");   int time= scan.nextInt();
      
      Db db = new Db(num,tel, name ,time) ;
        array [i]=db;
      }   */
      
   }
