
public class Product {
	private String name;
	 private int price;
	
	public Product(){
		System.out.println("��� ��ü�� �����Ǿ����ϴ�.");
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
		return this; // this�� �����Ǵ� ��ü �ν���Ʈ ��ü�� �ǹ�
	}
}
