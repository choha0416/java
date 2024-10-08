package ex1008;

public class SupersonicAirplane extends Airplane {
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다");
		} else {
			//부모 객체의 플라이 메소드 호출
			super.fly();
		}
	}
}
