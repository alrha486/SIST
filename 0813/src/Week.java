
public enum Week {
	MON(0), TUE(10), WED(20) , THR(30), FRI(40), SAT(50), SUN(60);
	private int value;
	Week(int value){
		this.value = value;
	}	
	public int display() {
		return this.value;
	}
}
