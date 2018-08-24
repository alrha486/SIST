import java.util.Vector;

//Who : ���ѹ�
//When : 2018.08.17.
//Why : 
//Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192

public class MD_Main {

	public static void main(String[] args) {
		
		Vector <MD_Sailer> sailerVector = new Vector<>(); //�Ҹ��� Ŭ���� ����
		Vector <MD_InputData> inputVector = new Vector<>(); //�Է� ����Ÿ�� �޴� Ŭ���� ����
		
		
		MD_Input mInput = null;
		MD_Calc mCalc = null;
		MD_Output mOutput = null;
		
		mInput = new MD_Input(sailerVector, inputVector);
		mInput.input();
		
		sailerVector = mInput.getSailerVector();
		inputVector = mInput.getInputVector(); //�޾ƿ���
		
		mCalc = new MD_Calc(sailerVector);
		mCalc.calc();
		sailerVector = mCalc.getSailerVector();
		
		mOutput = new MD_Output(sailerVector, inputVector);
		mOutput.output();
		
		
		
		/*for(int i =0; i<sailerVector.size(); i++) {
			//System.out.println(sailerVector.elementAt(i).toString());
			System.out.println(inputVector.elementAt(i).toString());
		}*/
		
	}
}
