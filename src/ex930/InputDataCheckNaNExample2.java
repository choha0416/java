package ex930;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		//isNaN으로 NaN인지 비교 NaN이 입력 되었기때문에 프린트문 실행
		currentBalance += val;
		System.out.println(currentBalance);
	}


}
