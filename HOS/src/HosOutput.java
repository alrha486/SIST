public class HosOutput {
   private Hospital[] array;
   private int count;
   private String def;
   
   public HosOutput(Hospital [] array, int count) {
      this.array = array;
      this.count = count;
   } //constructor
   
   
   public void output() {
      this.displayLabel();

      
      for(int i=0; i<this.count; i++) {
         Hospital c = this.array[i];
     
         
         switch(c.getHosCode()){
         case "MI" : def="외과"; break;
         case "NI" : def="내과";break;
         case "SI" : def="피부과"; break;
         case "TI" : def="소아과"; break;
         case "VI" : def="산부인과"; break;
         case "WI" : def="비뇨기과"; break;
         }
         
         System.out.printf("%-3d%5s%10d%10d%10d\n",
                              c.getHosCustomerNumb(),
                              def,
                              c.getHosMoney(),
                              c.getHosSum(),
                              c.getHosExpenses());  //Sysout.printf
         } //for
   } //startOutput
   
   
   private void displayLabel() {
      System.out.println("                        << 병원관리프로그램 >>");
      System.out.println("=========================================");
      System.out.println("   번호     진찰부서      진찰비       입원비        진료비");
      System.out.println("=========================================");
   }
}