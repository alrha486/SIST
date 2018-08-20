public class HosClac {
   
   private Hospital [] array;
   private int count;
   
   public HosClac(Hospital [] array, int count) {
      this.array = array;
      this.count = count;
   }
   
   public void hosCalc() {
      for(int i=0 ; i<count ; i++) {
         Hospital h = array[i];
         
         int HosMoney = 0; //ÁøÂûºñ
         double HosSum = 0; //ÃÑ ÀÔ¿øºñ
         int Hosday = h.getHosDay();
         int HosAge = h.getHosAge();
         
         if(HosAge < 10) {
            HosMoney = 7000;
         } else if(10<= HosAge && HosAge <20) {
            HosMoney = 5000;
         } else if(20<= HosAge && HosAge <30) {
            HosMoney = 8000;
         } else if(30<= HosAge && HosAge <40) {
            HosMoney = 7000;
         } else if(40<= HosAge && HosAge <50) {
            HosMoney = 4500;
         } else if(HosAge >= 50) {
            HosMoney = 2300;
         }
         
         
         
         if(Hosday <=3) {
            HosSum = Hosday*30000*1.0;
         } else if(3< Hosday && Hosday <10) {
            HosSum = Hosday*25000*1.0;
         }else if(10<= Hosday && Hosday <15) {
            HosSum = Hosday*25000*0.85;
         } else if(15<= Hosday && Hosday <20) {
            HosSum = Hosday*25000*0.80;
         } else if(20<= Hosday && Hosday <30) {
            HosSum = Hosday*25000*0.77;
         } else if(30<= Hosday && Hosday <100) {
            HosSum = Hosday*25000*0.72;
         } else if(Hosday>=100) {
            HosSum = Hosday*25000*0.68;
         }
         
         
         
         
         h.setHosMoney(HosMoney);
         h.setHosSum((int)HosSum);
         h.setHosExpenses(HosMoney+(int)HosSum); //Áø·áºñ
         
         
         
      }
   }
   
   
}