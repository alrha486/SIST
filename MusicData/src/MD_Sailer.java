// Who : �ֿ���
// When : 2018.08.17.
// Why : �Ҹ��� ������ ��� Ŭ����
// Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192


public class MD_Sailer {
   private int sellNumb,//�Ҹ��� ��ȣ
            sellEa, //�Ǹż���
            sellTotalPrice,//�Ǹž�
            sellPrice,//�ܰ�
   			sellTotalEa;
   private String kindMusic;//��������
   
   //---------------------------------������
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