
public class Product {
	private String name;
	 private int price;
	
	public Product(){
		System.out.println("방금 객체가 생성되었습니다.");
	}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Product refCopy() {
		return this; // this는 생성되는 객체 인스턴트 자체를 의미
	}
}
