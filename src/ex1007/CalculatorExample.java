package ex1007;
//계산기
public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator(); 
		myCalc.powerOn(); //라이브러리 클래스의 파워 온 메소드를 실행
		
		int result1 = myCalc.plus(5, 6); //라이브러리 클래스의 플러스 메소드에 5,6 을 대입 result를 리턴 플러스 메소드 종료후 현 클래스의 result1에 값 대입 
		System.out.println("result1: "+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
	}

}
