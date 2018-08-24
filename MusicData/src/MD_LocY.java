// Who : 양한백
// When : 2018.08.17.
// Why : 영남지역 판매 정보를 담는 클래스
// Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192

public class MD_LocY {
	private int k1TotalPrice =0;
	private int k2TotalPrice =0;
	private int k3TotalPrice =0;
	private int k4TotalPrice =0;
	public int getK1TotalPrice() {
		return k1TotalPrice;
	}
	public int getK2TotalPrice() {
		return k2TotalPrice;
	}
	public void setK1TotalPrice(int k1TotalPrice) {
		this.k1TotalPrice += k1TotalPrice;
	}
	public void setK2TotalPrice(int k2TotalPrice) {
		this.k2TotalPrice += k2TotalPrice;
	}
	public void setK3TotalPrice(int k3TotalPrice) {
		this.k3TotalPrice += k3TotalPrice;
	}
	public void setK4TotalPrice(int k4TotalPrice) {
		this.k4TotalPrice += k4TotalPrice;
	}
	public int getK3TotalPrice() {
		return k3TotalPrice;
	}
	public int getK4TotalPrice() {
		return k4TotalPrice;
	}
}
