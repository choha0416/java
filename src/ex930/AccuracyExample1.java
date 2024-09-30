package ex930;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceunit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceunit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + " 조각이 남는다. ");
	}

}
// double형 이기때문에 결과값이 0.3이아닌 0.29999999999999993로 원하는 값을 얻어낼수 없다
