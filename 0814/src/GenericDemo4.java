
public class GenericDemo4 {
	public static void main(String[] args) {
		Car [] array = {
					new Car("Sonata",25000000),
					new Car("Carnival",3000000),
					new Car("Benz", 100000000),
					new Car("Matiz",200000000)			
		};
		sort(array);
	}
	static <T extends Comparable <T>> void sort(T [] array){
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array.length-1;j++) {
				if(array[j].compareTo(array[j+1]) > 0) {
					T temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}