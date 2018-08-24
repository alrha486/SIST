package kr.co.sist.view;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import kr.co.sist.model.Student;

//컬렉션프레임워크 Vector == 계속 늘어가는 List
public class Main {
   private JFrame frm;   	// 전체프레임
   private Container con;   // 프레임 위의 컨테이너
   private JTabbedPane tab; // 프레임 상단의 탭
   private Vector<Student> vector; // 학생 정보를 저장 할 벡터

   public Main(String title) {//생성자  
      this.frm = new JFrame(title); // 프레임 명과 함께 초기화
      this.con = this.frm.getContentPane(); // 프레임 위에 컨테이너 초기화
      this.tab = new JTabbedPane(JTabbedPane.TOP); // 프레임 상단에 탭 초기화
      this.vector = new Vector<Student>(1,1); // 학생 벡터 초기화 
   }
   
   public void display() { // 디스플레이 메소드 
      this.frm.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {//어나니머스 클래스 == InnerClass
            JOptionPane.showMessageDialog(Main.this.con,
                  "안녕히가세요.", "알림창", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
      });
      this.con.add(this.tab); // 컨테이너 위에 탭을 추가
      Output output = new Output(this.vector); // 학생 벡터의 주소를 아웃풋 생성자로 보내기
      this.tab.add("입력", new Input(this.vector, this.tab, output)); // 입력 택을 추가함과 동시에 인풋 생성자 호출 학생벡터,탭의주소,아웃풋의 주소를 전달
      this.tab.add("출력", output); // 출력 탭을 추가함과 동시에 아웃풋의 주소를 전달
      this.frm.setSize(800,600); // 프레임의 사이즈
      this.frm.setVisible(true); // 시각화 
   }
   
   public static void main(String[] args) {
      Main main = new Main("성적관리 프로젝트 Ver.3.0");
      main.display();
      /*Vector<Student> vector = new Vector<Student>(1,1);//한칸 시작 --> 한칸씩 증가
      
      Input in = new Input(vector);//input 생성자에게 vector 넘김
      in.input();
      
      Calc c = new Calc(vector);
      c.calc();
      
      Sort sort = new Sort(vector);
      sort.BubbleSort();
      
      Output op = new Output(vector);//생성자
      op.output();//메소드
*/      
   }
}