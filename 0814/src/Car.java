
public class Car<T> implements Comparable<T>{
	private String name;
	private int price;
	public Car(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(T obj) {
		Car car = (Car)obj;
		return (this.price - car.price);
	}
	
	@Override
	public String toString() {
		return String.format("Car [name = %s, price = %d]" , name,price);
	}
}
