
 class Sort {
   private Student[] student;
   private int count;

   public Sort(Student[] student, int count) {// ������
      this.student = student;
      this.count = count;
   }
   public void BubbleSort() {
      for(int i = 0 ; i<count-1 ; i++) {//n-1 �� ����
         for(int j = 0; j < count-1 ; j++) {
            if(this.student[j].getSum() < this.student[j+1].getSum()) {//�հ� �������� #������
            	Student temp = this.student[j];
               this.student[j] = this.student[j+1];
               this.student[j+1] = temp; 
            }
         }
      }
   }
}