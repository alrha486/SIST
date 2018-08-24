package kr.co.sist.control;
import java.awt.event.ActionEvent;
//1. import 한다
import java.awt.event.ActionListener;
import java.util.Vector;

import kr.co.sist.model.Student;
import kr.co.sist.view.Output;

public class MyAction implements ActionListener{// 2. implements 한다
		
	private Vector<Student> vector;
	private Output output;
	
	public MyAction(Vector <Student> vector, Output output) {
		this.vector = vector;
		this.output = output;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		
		switch(evt.getActionCommand()) {
			case "계산하기" : calc(); break;
			case "정렬하기" : sort(); break;
			case "저장하기" : save(); break;
		}
	}
	
	private void calc() {
		Calc calc = new Calc(this.vector);
		calc.calc();
		this.output.refresh(this.vector); // 계산 완료 한 것을 테이블에 다시 붙이기 
	}
	private void sort() {
		Sort sort = new Sort(this.vector);
		sort.BubbleSort();
	}
	private void save() {
		
	}
}
