// Who : 최원석
// When : 2018.08.17.
// Why : 소매정 정보를 담는 클래스
// Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192


public class MD_Sailer {
   private int sellNumb,//소매점 번호
            sellEa, //판매수량
            sellTotalPrice,//판매액
            sellPrice,//단가
   			sellTotalEa;
   private String kindMusic;//음악종류
   
   //---------------------------------생성자
   public MD_Sailer(int sellNumb, int sellEa, String kindMusic) {
      this.sellNumb = sellNumb;
      this.kindMusic = kindMusic;
      this.sellEa = sellEa;
   }
   //------------------------------getter,setter


public int getSellNumb() {
      return sellNumb;
   }

   public void setSellNumb(int sellNumb) {
      this.sellNumb = sellNumb;
   }

   public int getSellEa() {
      return sellEa;
   }

   public void setSellEa(int sellEa) {
      this.sellEa = sellEa;
   }

   public int getSellTotalPrice() {
      return sellTotalPrice;
   }

   public void setSellTotalPrice(int sellTotalPrice) {
      this.sellTotalPrice = sellTotalPrice;
   }

   public int getSellTotalEa() {
      return sellTotalEa;
   }

   public void setSellTotalEa(int sellTotalEa) {
      this.sellTotalEa = sellTotalEa;
   }

   public int getSellPrice() {
      return sellPrice;
   }

   public void setSellPrice(int sellPrice) {
      this.sellPrice = sellPrice;
   }

   public String getKindMusic() {
      return kindMusic;
   }

   public void setKindMusic(String kindMusic) {
      this.kindMusic = kindMusic;
   }
   
   
}