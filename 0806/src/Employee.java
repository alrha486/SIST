
public class Employee {
	private String name;
	private double salary;
	
//	{
//		this.name = "ÀÌÁø¿õ";
//		this.salary = 3000000;
//	}
//	
//	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public Employee(double salary) {
		this("±è¹ÎÈ£", 2000000);
	}
	public Employee() {
		this("ÀÌÁø¿õ",3000000);
	}
	public Employee(String name) {
		this(name , 3000000);
	}
	
	public void display() {
		System.out.println(this.name + "  " + this.salary);
	}
	
}
