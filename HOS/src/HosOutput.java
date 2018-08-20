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
         case "MI" : def="�ܰ�"; break;
         case "NI" : def="����";break;
         case "SI" : def="�Ǻΰ�"; break;
         case "TI" : def="�Ҿư�"; break;
         case "VI" : def="����ΰ�"; break;
         case "WI" : def="�񴢱��"; break;
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
      System.out.println("                        << �����������α׷� >>");
      System.out.println("=========================================");
      System.out.println("   ��ȣ     �����μ�      ������       �Կ���        �����");
      System.out.println("=========================================");
   }
}