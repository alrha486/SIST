
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
      System.out.println("                      << ��ǰ�� �Ǹ� ���ͱ� �� ������ǥ>>");
      System.out.println("----------------------------------------------------------------------------");
      System.out.println(" ��ǰ��     ����     �ǸŴܰ�     ���Դܰ�     ��۷�     ���ͱ�     ������ ");
      System.out.println("----------------------------------------------------------------------------");
   }
}