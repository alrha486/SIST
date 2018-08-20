
public class ArrayDemo4 {
public static void main(String[] args) {
	short[] original = {1,2,3,4};
	short[] target = {10,9,8,7,6,5,4,3,2,1};
	
	//original = target; 
	System.arraycopy(original, 0, target, 4, 4);
	
	//System.arraycopy(target, 0, original, 0, 4 );
	
//	System.out.println("변경 전 : ");
//	System.out.println(target[0]);
//	
//	System.arraycopy(original, 0, target, 0, 4);
//	
//	System.out.println("변경 후 : ");
//	System.out.println(target[0]);
//
//	original[0] = 100;
//	
//	System.out.println("2차 변경 후 : ");
//	System.out.println(target[0]);

	
//	for(int i=0; i<target.length ; i++) {
//		System.out.print(target[i]+ "\t");
//	}
		
}
}
