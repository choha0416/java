package ex930;

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
		
		String userInput1 = "10.0";
		double val1 = Double.valueOf(userInput1);
		
		double currentBalance1 = 10000.0;
		
		currentBalance1 += val1;
		System.out.println(currentBalance1);
		
	}

}
