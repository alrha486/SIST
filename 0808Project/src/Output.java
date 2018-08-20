
public class Output {
   private Product[] array;
   private int count ;
   
   public Output(Product[] array, int count) {
      this.array = array;
      this.count = count;
   }
   public void output() {
      this.displayLabel();
      for(int i=0; i<this.count; i++) {
         Product a = this.array[i];
         System.out.printf("%1d%-15s%5d%5d%5d%10d%10d%10.2f\n",   		 
                           a.getRanking(),a.getProduct_name(), a.getProduct_yang(), a.getSell_price(), a.getBuy_price(), a.getDelivery_price(),
                           a.getProfit(), a.getProfit_margin());
      }
   }
   private void displayLabel() {
      System.out.println("                      << 상품별 판매 이익금 및 이익율표>>");
      System.out.println("----------------------------------------------------------------------------");
      System.out.println(" 상품명     수량     판매단가     매입단가     운송료     이익금     이익율 ");
      System.out.println("----------------------------------------------------------------------------");
   }
}