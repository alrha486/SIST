   public class Hospital {
      private String hDpt;//�ڵ�
      private int hNumb, hAge, hPrice, hDays, hDisc, hDaysPrice, hTotalPrice, hOneDayPrice;
                  //��ȣ ���� ������ �Կ��ϼ� ���κ��� ���Կ���  ����� �Ϸ��Կ���
      public Hospital(int hNumb, String hDpt , int hDays, int hAge) {
         this.hDpt = hDpt; // �ڵ�
         this.hNumb = hNumb; // ��ȣ
         this.hAge = hAge; // ����
         this.hDays = hDays; // �Կ��ϼ�
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
