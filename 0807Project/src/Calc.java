
 class Calc {
	private Student [] student;
	private int count;
	
	public Calc(Student [] student, int count) { //�Ű������� �޾ƿ� Student�� count�� �� Ŭ�������� ����� ��
		this.student = student;					// �̱� ������ Ŭ���������� ����.
		this.count = count;
	}
	
	public int Calc() {		
		for(int i=0; i<count; i++) {
		Student s = this.student[i]; // �ּҸ� ����	
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
		return count;
	}
	

	
}
