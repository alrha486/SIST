public class CarCenter {
	public static void main(String[] args) {
		Sonata sonata = new Sonata("Silver Sonata");
		Martiz martiz = new Martiz("Pink Martiz");
		CarCenter cc = new CarCenter();
		cc.repair(sonata);
		
//		int [][] a = new int[3][4];
//		System.out.println(a[0].length);
		
	}
	
	void repair(Car car) {
		if(car instanceof Martiz) {
			System.out.println("��Ƽ� �� �����Ǿ����ϴ�.");
		}else if(car instanceof Carnival) {
			System.out.println("ī�Ϲ��� �� �����Ǿ����ϴ�.");
		}else if(car instanceof Sonata) {
			System.out.println("�ҳ�Ÿ�� �� �����Ǿ����ϴ�.");
		}
//		System.out.println(car.toString() + " ��/�� �� �����Ǿ����ϴ�.");
	}
}
