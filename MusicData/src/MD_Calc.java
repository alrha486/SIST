// Who : 전소현, 김은서
// When : 2018.08.17.
// Why : 계산 클래스
// Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192

import java.util.Vector;

public class MD_Calc {

	private Vector<MD_Sailer> sailerVector;

	public MD_Calc(Vector<MD_Sailer> sailerVector) {
		this.sailerVector = sailerVector;
	}// constructor

	public void calc() {

		for (int i = 0; i < this.sailerVector.size(); i++) {

			MD_Sailer sailer = sailerVector.elementAt(i);

			String kindMusic = sailer.getKindMusic(); // 음악 코드
			int sellEa = sailer.getSellEa(); // 판매수량
			int sellNumb = sailer.getSellNumb(); // 소매점 번호
			int sellTotalPrice; // 판매액

			switch (kindMusic) {
			case "K1":
				sailer.setSellTotalPrice(sellEa * 100);
				break;
			case "K2":
				sailer.setSellTotalPrice(sellEa * 300);
				break;
			case "K3":
				sailer.setSellTotalPrice(sellEa * 400);
				break;
			case "K4":
				sailer.setSellTotalPrice(sellEa * 200);
				break;
			}

		}
	}

	public Vector<MD_Sailer> getSailerVector() {
		return sailerVector;
	}

}