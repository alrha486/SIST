
public class ArrayDemo3 {
public static void main(String[] args) {
	short[] original = {3,4,5,6};
	short[] target = {7,8,9,10,11,12,13,14,15};
	System.out.println("변경 전 : ");
	System.out.println(original[0]);

	original = target; // 주소복사 
	
	System.out.println("변경 후 : ");
	System.out.println(original[0]);
	
	target[0] = 100;// 원본이 바뀌어도 같이 바뀐다. 같은 주소를 가르킴
	
	
	System.out.println("2번 변경 후 : ");
	System.out.println(original[0]);

}
	//System.arraycopy(src, srcPos, dest, destPos, length);
}

