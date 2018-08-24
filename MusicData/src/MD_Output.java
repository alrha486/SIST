
// Who : ������, ���ѹ�
// When : 2018.08.17.
// Why : ���������� ����� ����ϴ� Ŭ����
// Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192

import java.util.Vector;

public class MD_Output {
	private Vector<MD_Sailer> sailerVector;
	private Vector<MD_InputData> inputVector;
	private int k1Ea, k2Ea, k3Ea, k4Ea;

	MD_LocK mdk = new MD_LocK();
	MD_LocY mdy = new MD_LocY();
	MD_LocC mdc = new MD_LocC();

	public MD_Output(Vector<MD_Sailer> sailerVector, Vector<MD_InputData> inputVector) {
		this.sailerVector = sailerVector;
		this.inputVector = inputVector;
	}// constructor

	
	
	
	public void LocationCalc() {
		for (int i = 0; i < sailerVector.size(); i++) {

			MD_Sailer thisS = sailerVector.elementAt(i);

			if (thisS.getSellNumb() <= 35) {
				switch (thisS.getKindMusic()) {
				case "K1":
					this.mdk.setK1TotalPrice(thisS.getSellTotalPrice()); break;
				case "K2":
					this.mdk.setK2TotalPrice(thisS.getSellTotalPrice()); break;
				case "K3":
					this.mdk.setK3TotalPrice(thisS.getSellTotalPrice()); break;
				case "K4":
					this.mdk.setK4TotalPrice(thisS.getSellTotalPrice()); break;
				}// switch
			} // if
			else if (thisS.getSellNumb() <= 75) {
				switch (thisS.getKindMusic()) {
				case "K1":
					this.mdy.setK1TotalPrice(thisS.getSellTotalPrice()); break;
				case "K2":
					this.mdy.setK2TotalPrice(thisS.getSellTotalPrice()); break;
				case "K3":
					this.mdy.setK3TotalPrice(thisS.getSellTotalPrice()); break;
				case "K4":
					this.mdy.setK4TotalPrice(thisS.getSellTotalPrice()); break;
				}// switch
			} // else if
			else if (thisS.getSellNumb() > 75) {
				switch (thisS.getKindMusic()) {
				case "K1":
					this.mdc.setK1TotalPrice(thisS.getSellTotalPrice()); break;
				case "K2":
					this.mdc.setK2TotalPrice(thisS.getSellTotalPrice()); break;
				case "K3":
					this.mdc.setK3TotalPrice(thisS.getSellTotalPrice()); break;
				case "K4":
					this.mdc.setK4TotalPrice(thisS.getSellTotalPrice()); break;
				}// switch
			} // else if
		} // for
	}// LcationCacc

	
	public void MusicCodeCalc() {
		
		for (int i = 0; i < sailerVector.size(); i++) {

			MD_Sailer thisS = sailerVector.elementAt(i);
			
			switch (thisS.getKindMusic()) {
			case "K1": k1Ea += thisS.getSellEa(); break;
			case "K2": k2Ea += thisS.getSellEa(); break;
			case "K3": k3Ea += thisS.getSellEa(); break;
			case "K4": k4Ea += thisS.getSellEa(); break;
			}// switch
		}
	}
	
	
	
	
	
	public void output() {
      this.displayLabel();
      this.LocationCalc();
      this.MusicCodeCalc();
      
      System.out.print("�˼�    "); System.out.println(this.mdk.getK1TotalPrice()+"    "+
    		  									  this.mdy.getK1TotalPrice()+"    "+
    		  									  this.mdc.getK1TotalPrice()+"    "+
    		  									  this.k1Ea);
      System.out.print("����   "); System.out.println(this.mdk.getK2TotalPrice()+"    "+
      												this.mdy.getK2TotalPrice()+"    "+
      												this.mdc.getK2TotalPrice()+"    "+
      												this.k2Ea);
      System.out.print("����   "); System.out.println(this.mdk.getK3TotalPrice()+"    "+
													this.mdy.getK3TotalPrice()+"    "+
													this.mdc.getK3TotalPrice()+"    "+
													this.k3Ea);
      System.out.print("°��   "); System.out.println(this.mdk.getK4TotalPrice()+"    "+
													this.mdy.getK4TotalPrice()+"    "+
													this.mdc.getK4TotalPrice()+"    "+
													this.k4Ea);
      
      System.out.println("���հ��Ǹŷ�: "+(k1Ea+k2Ea+k3Ea+k4Ea));
      
      System.out.println("\n\n�Էµ�����");
      for(int i=0; i<inputVector.size(); i++) {
    	  System.out.println(inputVector.elementAt(i).toString());
      }
      
      }

	private void displayLabel() {
		System.out.println("                  <<���ݰ������α׷�>>");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(" ����    ��������Ǹž�     ���������Ǹž�     ��û�����Ǹž�     �Ǹŷ�");
		System.out.println("------------------------------------------------------------------------");
	}

}


