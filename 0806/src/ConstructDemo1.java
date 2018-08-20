
public class ConstructDemo1 {
	public static void main(String[] args) {
	
	Car c1 = new Car(500000,"람보르기니",3.145, true, 'A');
	c1.display();
}
}

class Car{
	private int price;
	private String name;
	private double weight;
	private boolean isNew;
	private char grade;
	
	public void display(){
		System.out.println(price);
		System.out.println(name);
		System.out.println(weight);
		System.out.println(isNew);
		System.out.println(grade);
	}
	
	public Car(int price, String name, double weight, boolean isNew, char grade){
		this.price = price;
		this.name = name;
		this.weight = weight;
		this.isNew = isNew;
		this.grade = grade;
		
	}

}