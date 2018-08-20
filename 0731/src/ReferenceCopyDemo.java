public class ReferenceCopyDemo {

	public static void main(String[] args) {
		
		Car Ramborgini = new Car();
		Ramborgini.price = 29999999;
		Ramborgini.color = "blue";
		
		Ramborgini.abc(Ramborgini.price, Ramborgini.color);
		
		Car martiz = new Car();
		martiz.price = 39999999;
		martiz.color = "black";
		
		martiz.abc(martiz.price, martiz.color);
		
		
	}
}

class Car{
	int price;
	String color;
	
	public void abc(int price, String color) {
		System.out.printf("자동차의 색상은 %s, 자동차의 색상은 %d 입니다.\n", color, price);
	}
}