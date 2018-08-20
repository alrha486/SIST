
public class ArrayDemo10 {
public static void main(String[] args) {
	
//	int [][] array;
//	array = new int[4][];
//	
//	array[0] = new int[2];
//	array[0][0] = 4; array[0][1] = 5;
//	
//	array[1] = new int[4];
//	array[2] = new int[3];
//	array[3] = new int[5];
	
//	int[][] array;
//	array = new int[4][];
//	array[0] = new int[] {1,2};
//	array[1] = new int[] {3,4,5};
//	array[2] = new int[] {6,7,8,9};
//	array[3] = new int[] {10,11,12,13,14};
//	}
	
	int[][] array = {
			{1,2}, {3,4,5}, {6,7,8,9}, {10,11,12,13,14}
	};
	for(int i=0; i<array.length; i++) {
		for(int j=0; j<array[i].length; j++) {
			System.out.print(array[i][j]+ "\t");
		}
		System.out.println();
	}
	
}
}