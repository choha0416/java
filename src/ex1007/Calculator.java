package ex1007;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result; //result값을 활용클래스의 플러스에 던져주고 플러스 메소드를 종료 메모리에서 해당 메소드 삭제
	}
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
