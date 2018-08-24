package kr.co.sist.control;
import java.awt.event.ActionEvent;
//1. import �Ѵ�
import java.awt.event.ActionListener;
import java.util.Vector;

import kr.co.sist.model.Student;
import kr.co.sist.view.Output;

public class MyAction implements ActionListener{// 2. implements �Ѵ�
		
	private Vector<Student> vector;
	private Output output;
	
	public MyAction(Vector <Student> vector, Output output) {
		this.vector = vector;
		this.output = output;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		
		switch(evt.getActionCommand()) {
			case "����ϱ�" : calc(); break;
			case "�����ϱ�" : sort(); break;
			case "�����ϱ�" : save(); break;
		}
	}
	
	private void calc() {
		Calc calc = new Calc(this.vector);
		calc.calc();
		this.output.refresh(this.vector); // ��� �Ϸ� �� ���� ���̺� �ٽ� ���̱� 
	}
	private void sort() {
		Sort sort = new Sort(this.vector);
		sort.BubbleSort();
	}
	private void save() {
		
	}
}
