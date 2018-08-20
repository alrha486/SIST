
public class ArrayDemo7 {
public static void main(String[] args) {

//	if(args.length != 3) {
//		System.out.println("잘못 입력하셨습니다.");
//		System.exit(-1);
//	} 
	int first = Integer.parseInt(args[0]);
	int two = Integer.parseInt(args[2]);

	switch(args[1]) {
		case "+" : System.out.println(first + two);
		break;
		case "-" : System.out.println(first - two);
		break;	
		case "*" : System.out.println(first * two);
		break;
		case "/" : System.out.println(first / two);
		break;
		default : 
			System.exit(-1);
	}
	
//		for(int i=0; i < args.length; i++) {
//		System.out.println(args[i]);
//	}
}
}
