
public class SangsokDemo1 {
	public static void main(String[] args) {
		Derived d = new Derived(1000, "º¼Ææ");
		System.out.println(d.name + "  "+ d.price);
	}
}
class Base{
	String name;
	public Base(String name) {
		this.name = name;
	}
}
class Derived extends Base{
	int price;
	
	public Derived(int price, String name) {
		super(name);
		this.price = price;
	}
}
