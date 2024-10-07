package ex1007;

public class StaticCaculator {
	static double pi = 3.14159; 
	
	static int plus(int x, int y) { //스태틱으로 생성될 경우 클래스명.메소드명(변수)로 사용가능 new로 객체 생성할 필요가 없음
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
