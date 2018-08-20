import java.util.Vector;

class Calc {
	private Vector<Student> vector;
	
	public Calc(Vector<Student> vector) { //매개변수로 받아온 Student와 count를 이 클래스에서 사용할 것
		this.vector = vector;					// 12명의 정보를 담은 vector를 생성자를 통해 받음

	}
	
	public void Calc() {		
		for(int i=0; i<this.vector.size(); i++) {
		Student s = this.vector.get(i); // 주소를 저장	
		int kor = s.getKor();
		int eng = s.getEng();
		int mat = s.getMat();
		int edp = s.getEdp();
		int sum = kor+eng+mat+edp;
		s.setSum(sum);
		double avg = (double)(sum/4);
		s.setAvg(avg);
		
		if(avg ==100 || avg >=90) {
			s.setGrade('A');
		}else if(avg ==89 || avg >=80) {
			s.setGrade('B');
		}else if(avg ==79 || avg >=70)
			s.setGrade('C');
		else if(avg ==69 || avg >=60)
			s.setGrade('D');
		else {
			s.setGrade('F');
		}
		
		}
	}
	

	
}
