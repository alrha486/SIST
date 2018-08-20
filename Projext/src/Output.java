
public class Output {
	private PhoneFee [] pf;
	private int count;
	public Output(PhoneFee [] pf, int count) {
		this.pf = pf;
		this.count = count;
	}
	
	
	public void output(PhoneFee [] pf) {
		System.out.println("구분             전화번호           이름     기본요금     통화료     세금     합계");
//			for(int i=0; i<count; i++) {
//			this.pf[i].display();
//			}
	}
}
