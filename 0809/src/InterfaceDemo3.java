public class InterfaceDemo3 {
	public static void main(String[] args) {

		Pet [] array = new Pet[] {
				new Dog(),
				new Cat()
		};
		vecinate(array);
	}
	static void vecinate(Pet [] pet) {
		for(Pet p : pet) {
		p.pet();
	}
}
}
