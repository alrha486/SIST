
 class Sort {
   private Student[] student;
   private int count;

   public Sort(Student[] student, int count) {// 생성자
      this.student = student;
      this.count = count;
   }
   public void BubbleSort() {
      for(int i = 0 ; i<count-1 ; i++) {//n-1 번 까지
         for(int j = 0; j < count-1 ; j++) {
            if(this.student[j].getSum() < this.student[j+1].getSum()) {//합계 내림차순 #정수비교
            	Student temp = this.student[j];
               this.student[j] = this.student[j+1];
               this.student[j+1] = temp; 
            }
         }
      }
   }
}