package ex1010;

public class CatchByExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("실행방법");
			System.out.println("java CatchByExceptionExample num1 num2" );
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
		} finally {
			System.out.println("다시 실행");
		}
	}

}
