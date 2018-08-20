import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingDemo {
	private JFrame frm;
	private JButton btn;
	private Container con;
	
	private SwingDemo(String title) { // 멤버변수 초기화
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane(); // JFrame이 Heavy component 이기때문에 컨테이너를 생성 후 그 위에 올려야됨
		this.btn = new JButton("Click me!"); // 버튼의 이름
	}
	
	private void display() {
		this.frm.setSize(800,600); // 프레임의 사이즈
		this.con.add(this.btn, "North"); // 13line에 생성한 container위에 버튼을 추가
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료버튼 이벤트
		this.frm.setVisible(true); // 시각화 true
	}
	
	
	public static void main(String[] args) {
		new SwingDemo("Swing Window").display();
	}
}
