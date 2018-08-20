
 class Output {
	
	private Student [] student;
	private int count;
	
	public Output(Student [] student,int count){
	this.student = student;
	this.count = count;
	}
	
	public void output() {
		for(int i=0; i<this.count; i++) {
			Student s = this.student[i];
			String hakbun = s.getHakbun();
			String name = s.getName();
			int sum = s.getSum();
			double avg = s.getAvg();
			char grade = s.getGrade();
		
			System.out.println(hakbun+ "  " + name + "  " + sum + "  " + avg + "  " +grade);	
		}
		}
}
