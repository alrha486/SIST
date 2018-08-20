
public class Sonata extends Car{
	private String name;
	public Sonata(String name){
		super(name);
		this.name =name;
	}
	public void displayname(){
		System.out.println(this.name);
	}
}
