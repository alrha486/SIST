//Who : 작성자
//When : 작성날자
//Why : 클래스 설명
//Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192
public class MD_Sailer {
   private int sellNumb,//소매점 번호
            sellEa, //판매수량
            sellTotalPrice,//판매액
            sellTotalEa,//판매량
            sellPrice
            ,;//단가
   private String kindMusic;//음악종류
   
   //---------------------------------생성자
   public MD_Sailer(int sellNumb, String kindMusic, int sellEa) {
      this.sellNumb = sellNumb;
      this.kindMusic = kindMusic;
      this.sellEa = sellEa;
   }
   public MD_Sailer() {
	   
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