package ex930;
//무한 낫어넘버
public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		//double z = x % y;
		
		System.out.println(Double.isInfinite(z)); // 5를 0.0으로 나누면 무한이 나오기때문 참
		System.out.println(Double.isNaN(z)); //숫자가 아니냐 물어보지만 숫자이기 때문에 거짓
		
		//잘못된 코드
		System.out.println(z+2);
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2);
		}
	}

}
