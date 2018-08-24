package kr.co.sist.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import kr.co.sist.model.Student;

public class Input extends JPanel implements ActionListener{ // 인풋클래스는 JPanel 과 ActionListener의 자식임
	private Vector<Student> vector; // 매개변수로 받은 학생 벡터
	private JPanel p; // 패널
	private JLabel lblHakbun , lblName, lblKor, lblEng, lblMat, lblEdp; 
	private JTextField tfHakbun, tfName, tfKor, tfEng, tfMat, tfEdp;
	private JButton btnAdd;
	private Font font;
	private JTabbedPane tab; // 매개변수로 받은 탭
	private Output output; // 아웃풋의 주소
	
	
	public Input(Vector<Student> vector, JTabbedPane tab,Output output) {//생성자 //Main에서 보낸 vector, tab, output의 주소 받기
		this.vector = vector; 
		this.tab = tab; // 탭의 주소를 초기화
		this.p = new JPanel(); 
		this.font = new Font("Sans Serif",Font.PLAIN,35); 
		this.display(); //생성과 동시에 display()메소드 호출
		this.output = output; // 아웃풋의 주소 초기화
	}
	
	public void display() {//그리는 메소드
		this.setLayout(new FlowLayout());
		this.p.setLayout(new BorderLayout());//바탕 패널
		this.p.add("Center", getCenter()); // 인풋 패널의 센터에 getCenter() 호출
		this.p.add("South", getSouth()); // 인풋 패널의 남쪽에 getSouth() 호출
		this.add(this.p); // 컨테이너에 패널을 추가
	}
	
	private JPanel getCenter() {
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(6,2,10,10));//6행2열 10 씩 위아래 공백/ n등분 정확하게 나누는 gridlayout
		
		pCenter.add(this.lblHakbun = new JLabel("학번 : "));;
		this.lblHakbun.setFont(this.font);
		pCenter.add(this.tfHakbun = new JTextField());
		this.tfHakbun.setFont(this.font);
		
		
		pCenter.add(this.lblName = new JLabel("이름 : "));
		this.lblName.setFont(this.font);
		pCenter.add(this.tfName = new JTextField());
		this.tfName.setFont(this.font);
		
		pCenter.add(this.lblKor = new JLabel("국어 : "));
		this.lblKor.setFont(this.font);
		pCenter.add(this.tfKor = new JTextField());
		this.tfKor.setFont(this.font);
		
		pCenter.add(this.lblEng = new JLabel("영어 : "));
		this.lblEng.setFont(this.font);
		pCenter.add(this.tfEng = new JTextField());
		this.tfEng.setFont(this.font);
		
		pCenter.add(this.lblMat = new JLabel("수학 : "));
		this.lblMat.setFont(this.font);
		pCenter.add(this.tfMat = new JTextField());
		this.tfMat.setFont(this.font);
		
		pCenter.add(this.lblEdp = new JLabel("전산 : "));
		this.lblEdp.setFont(this.font);
		pCenter.add(this.tfEdp = new JTextField());
		this.tfEdp.setFont(this.font);
		
		pCenter.setBackground(Color.yellow);
		
		
		return pCenter;
	}
	
	private JPanel getSouth() {
		JPanel pSouth = new JPanel();
		pSouth.add(this.btnAdd = new JButton("Add"));
		this.btnAdd.setFont(this.font);
		this.btnAdd.addActionListener(this);
		pSouth.setBackground(Color.RED);
		return pSouth;
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String hakbun = this.tfHakbun.getText();
		String name = this.tfName.getText();
		int kor = Integer.parseInt(this.tfKor.getText().trim());//빈 공간 짤라버리기 == trim()
		int eng = Integer.parseInt(this.tfEng.getText().trim());//String --> int 변환
		int mat = Integer.parseInt(this.tfMat.getText().trim());
		int edp = Integer.parseInt(this.tfEdp.getText().trim());
		
		Student s = new Student(hakbun,name,kor,eng,mat,edp);
		this.vector.addElement(s);//벡터에 학생 추가
		
		int choice = JOptionPane.showConfirmDialog(this, "계속 입력 ?");//int
		if(choice == JOptionPane.YES_OPTION) {
			this.tfHakbun.setText("");
			this.tfName.setText("");
			this.tfKor.setText("");
			this.tfEng.setText("");
			this.tfMat.setText("");
			this.tfEdp.setText("");
		}else if(choice == JOptionPane.NO_OPTION) {
			this.tab.setSelectedIndex(1);//0부터 시작 , 1 == 출력Tab
			this.output.refresh(this.vector);
			//System.out.println(this.vector.size());
		}
	}
	
}//Class
