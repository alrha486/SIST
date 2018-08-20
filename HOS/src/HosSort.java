//Sort - bubble Sort

class HosSort {
   private Hospital [] array;
   private int count;
   
   
   
   public HosSort(Hospital [] array, int count) {
      this.array = array;
      this.count = count;
   }
   public void bubbleSort() {
      for(int i = 0 ; i< count-1 ; i++) {
         for(int j = 0 ; j< count-1 ; j++) {
            if(this.array[j].getHosCustomerNumb() > this.array[j+1].getHosCustomerNumb()) {
               swap(j, j+1);
            }
         }
      }
   }
   public void swap (int a, int b) {
      Hospital temp = this.array[a];
      this.array[a] = this.array[b];
      this.array[b] = temp;
      
   }
}