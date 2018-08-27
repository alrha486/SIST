
public class SortDemo {
	public static void main(String[] args) {
		int [] array = {4,7,1,2,9,3,5,4};
		System.out.println("---소팅 전 ------------------------------------------------------");
		print(array);
		
		insertionSort(array);
		System.out.println("---소팅 후-------------------------------------------------------");
		print(array);
		System.out.println("---------------------------------------------------------------");
	}
	
	static void print(int [] array) {
		for(int su : array) {
			System.out.print(su + "\t");
		}
		System.out.println();
		
	}
	static void bubbleSort(){
	}
	
	static void selectSort() {
		
	}
	static void insertionSort(int [] array) {
		int i,j,key;
		for(i=1; i<array.length;i++) {
			key = array[i];
			for(j=i-1; j>=0 && array[j] < key ; j--) {
				array[j+1] = array[j];
			}
			array[j+1] = key;
		}
	}
}
