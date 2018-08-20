public class Product {
   private String product_name;//상품명;
   private int product_yang/*수량*/;
   private int sell_price/*판매단가*/;
   private int buy_price/*매입단가*/;
   private int delivery_price;/*운송료*/
   private int profit/*이익금*/;
   private int sell_gold; // 
   private int buy_gold; // 매입금액
   private double profit_margin/*이익률*/;
   private int ranking ;
   
   public Product(String product_name, int product_yang, int sell_price, int buy_price, int delivery_price) {
      this.product_name = product_name;
      this.product_yang = product_yang;
      this.sell_price = sell_price;
      this.buy_price = buy_price;
      this.delivery_price = delivery_price;
      this.ranking = 1;
   }
   public int getRanking() {
	return ranking;
}
public void setRanking(int ranking) {
	this.ranking = ranking;
}
public int getProfit() {
      return profit;
   }
   public void setProfit(int profit) {
      this.profit = profit;
   }
   public double getProfit_margin() {
      return profit_margin;
   }
   
   public int getBuy_gold() {
	return buy_gold;
}
public void setBuy_gold(int buy_gold) {
	this.buy_gold = buy_gold;
}
public void setProfit_margin(double profit_margin) {
      this.profit_margin = profit_margin;
   }
   public String getProduct_name() {
      return product_name;
   }
   public int getProduct_yang() {
      return product_yang;
   }
   public int getSell_price() {
      return sell_price;
   }
   public int getBuy_price() {
      return buy_price;
   }
   public int getDelivery_price() {
      return delivery_price;
   }
   public int getSell_gold() {
      return sell_gold;
   }
   public void setSell_gold(int sell_gold) {
      this.sell_gold = sell_gold;
   }
   public void setSell_price(int sell_price) {
      this.sell_price = sell_price;
   }
public int getRate() {
	// TODO Auto-generated method stub
	return 0;
}
   
}