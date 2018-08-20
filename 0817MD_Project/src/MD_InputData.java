// Who : 양한백
// When : 2018.08.17.
// Why : 입력데이터만을 담는 클래스
// Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192

public class MD_InputData {
	private int sellNumb, sellEa;
	private String kindMusic;
	
	
	@Override
	public String toString() {
		return sellNumb + "     " + kindMusic + "     " + sellEa;
	}




	public MD_InputData(int sellNumb, int sellEa, String kindMusic) {
		this.sellNumb = sellNumb;
		this.sellEa = sellEa;
		this.kindMusic = kindMusic;
	}//constructor


	
	
	//get, set--------------------------------------------------------------------
	public int getSellNumb() {
		return sellNumb;
	}


	public void setSellNumb(int sellNumb) {
		this.sellNumb = sellNumb;
	}


	public int getSellEa() {
		return sellEa;
	}


	public void setSellEa(int sellEa) {
		this.sellEa = sellEa;
	}


	public String getKindMusic() {
		return kindMusic;
	}


	public void setKindMusic(String kindMusic) {
		this.kindMusic = kindMusic;
	}
	
	
}