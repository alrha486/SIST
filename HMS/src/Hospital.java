   public class Hospital {
      private String hDpt;//코드
      private int hNumb, hAge, hPrice, hDays, hDisc, hDaysPrice, hTotalPrice, hOneDayPrice;
                  //번호 나이 진찰비 입원일수 할인비율 총입원비  진료비 하루입원비
      public Hospital(int hNumb, String hDpt , int hDays, int hAge) {
         this.hDpt = hDpt; // 코드
         this.hNumb = hNumb; // 번호
         this.hAge = hAge; // 나이
         this.hDays = hDays; // 입원일수
      }
      public String gethDpt() {
         return hDpt;
      }
      public void sethDpt(String hDpt) {
         this.hDpt = hDpt;
      }
      public int gethNumb() {
         return hNumb;
      }
      public void sethNumb(int hNumb) {
         this.hNumb = hNumb;
      }
      public int gethAge() {
         return hAge;
      }
      public void sethAge(int hAge) {
         this.hAge = hAge;
      }
      public int gethPrice() {
         return hPrice;
      }
      public void sethPrice(int hPrice) {
         this.hPrice = hPrice;
      }
      public int gethDays() {
         return hDays;
      }
      public void sethDays(int hDays) {
         this.hDays = hDays;
      }
      public int gethDisc() {
         return hDisc;
      }
      public void sethDisc(int hDisc) {
         this.hDisc = hDisc;
      }
      public int gethDaysPrice() {
         return hDaysPrice;
      }
      public void sethDaysPrice(int hDaysPrice) {
         this.hDaysPrice = hDaysPrice;
      }
      public int gethTotalPrice() {
         return hTotalPrice;
      }
      public void sethTotalPrice(int hTotalPrice) {
         this.hTotalPrice = hTotalPrice;
      }
      public int gethOneDayPrice() {
         return hOneDayPrice;
      }
      public void sethOneDayPrice(int hOneDayPrice) {
         this.hOneDayPrice = hOneDayPrice;
      } 
      
   }
