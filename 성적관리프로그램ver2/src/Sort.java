import java.util.Vector;

class Sort {
	 private Vector<Student> vector;

   public Sort(Vector<Student> vector) {// 생성자
      this.vector = vector;
   }
   public void BubbleSort() {
      for(int i = 0 ; i<this.vector.size()-1 ; i++) {//n-1 번 까지
         for(int j = 0; j < this.vector.size()-1 ; j++) {
            if(this.vector.get(j).getSum() < this.vector.get(j+1).getSum()) {//합계 내림차순 #정수비교
            	swap(j,j+1);
            }
         }
      }
   }
  private void swap(int a , int b) {
	   Student temp = this.vector.elementAt(a);
       this.vector.setElementAt(this.vector.elementAt(b),a);
       this.vector.setElementAt(temp,b);
   }
}