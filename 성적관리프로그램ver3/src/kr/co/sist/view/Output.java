package kr.co.sist.view;
import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import kr.co.sist.control.MyAction;
import kr.co.sist.model.MyModel;
import kr.co.sist.model.Student;

public class Output extends JPanel{
	private Vector<Student> vector; 
	private JButton btnCalc, btnSort, btnSave;
	private JScrollPane scroll;
	private JTable table;
	
	public Output(Vector<Student> vector) {
		this.vector = vector;
		this.table = new JTable();
		this.scroll = new JScrollPane(this.table);
		this.output();//그리는 애
	}
	
	public void refresh(Vector <Student> vector) {
		this.vector = vector;
		output();
	}	
	
	private void output() {//그리는 애
		this.setLayout(new BorderLayout());
		this.table.setModel(new MyModel(this.vector));//그림을 그릴 때.
		this.add("Center", this.scroll);
		this.add("North", getNorth());
	}
	private JPanel getNorth() {
		JPanel panel = new JPanel();
		panel.add(this.btnCalc = new JButton("계산하기"));
		this.btnCalc.addActionListener(new MyAction(this.vector,this)); // 계산 할 벡터와 나 자신을 보냄
		panel.add(this.btnSort = new JButton("정렬하기"));
		this.btnSort.addActionListener(new MyAction(this.vector,this)); // 이미 정렬이 끝난 벡터와 나 자신을 보냄
		panel.add(this.btnSave = new JButton("저장하기"));
		return panel;
	}
}



