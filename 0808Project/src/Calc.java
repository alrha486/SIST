
public class Calc {
   
   private  Product [] array;
   private int count;
   
   public Calc(Product [] array , int count) {
      this.array = array;
      this.count = count;
   }
   
   public void calc() {
      for(int i=0 ; i<this.count ; i++) {
         Product p = this.array[i];
         //1.판매금액\
         
         int sell_price = p.getSell_price();
         int buy_price = p.getBuy_price();//매입단가 추가
         int product_yang = p.getProduct_yang();
         int sell_total = sell_price*product_yang;
         p.setSell_gold(sell_total);
         //2.매입금액
         int buy_gold = product_yang * buy_price; //매입단가로 수정
         p.setBuy_gold(buy_gold);            
         //3.이익금
         int profit = sell_total - (buy_gold + p.getDelivery_price());
         p.setProfit(profit);
         //4.이익률
         double profit_margin = (profit / (double)buy_gold )*100; 
         p.setProfit_margin(profit_margin);
      }
   }
   
   
}