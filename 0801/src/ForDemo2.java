
public class ForDemo2 {
public static void main(String[] args) {
//	for(int i =1; i < 101 ; i++) {
//		System.out.print(i+ "\t");
//		if(i %6 == 0) {
//			System.out.print("\n"+ "");
//		}
//	}
	int count = 0;
	for(int i=65; i<91; i++) {				
		if(70<= i && i <= 74)
			System.out.print((char)(i+32));
		else if(80<= i && i <= 84)
			System.out.print((char)(i+32));
		else if(90== i)
			System.out.print((char)(i+32));
		else
			System.out.print((char)i);
		count ++;
		if(count % 5 == 0) {
			System.out.println();
		}
	}
}
}
