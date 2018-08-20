public class FlagInterface {
	public static void main(String[] args) {
		Product original = new Product("모나미볼펜");
		Product target;
		target = original.copy1();
		System.out.println(target);
		original.setName("클론변경후");
		System.out.println(target.getName());
	}
}

class Product implements Cloneable{
	private String name;
	public Product copy() { // 주소복사
		return this;
	}
	public Product copy1() {
		Object o = null;
		try {
			o = clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Failure");
//			e.printStackTrace();
		}
		return (Product)o;
	}
	
	
	public Product(String name) {
		this.name =name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
	
}