import java.util.Vector;

//Who : 양한백
//When : 2018.08.17.
//Why : 
//Environment : Windows 8.1, Eclipse Photon, JDK 1.8.0_192

public class MD_Main {

	public static void main(String[] args) {
		
		Vector <MD_Sailer> sailerVector = new Vector<>(); //소매점 클래스 벡터
		Vector <MD_InputData> inputVector = new Vector<>(); //입력 데이타를 받는 클래스 벡터
		
		
		MD_Input mInput = null;
		MD_Calc mCalc = null;
		MD_Output mOutput = null;
		
		mInput = new MD_Input(sailerVector, inputVector);
		mInput.input();
		
		sailerVector = mInput.getSailerVector();
		inputVector = mInput.getInputVector(); //받아오기
		
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
