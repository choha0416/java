package ex1008;
//메소드 재정의 @OverRide
public class SupersonicAirplaneExample {

	public static void main(String[] args) { //메인메서드 실행
		// TODO Auto-generated method stub
		SupersonicAirplane sa = new SupersonicAirplane(); //슈퍼소닉 에어플레인을 sa에 객체 생성
		sa.takeOff();//슈퍼소닉클래스 확인 메소드가 없기때문에 부모클래스 확인후 메소드 실행 이륙합니다
		sa.fly(); //슈퍼소닉 클래스의 메소드 실행 flymode = 1 if문이 틀렸기때문에 부모객체의 플라이 실행 일반비행합니다
		sa.flyMode = SupersonicAirplane.SUPERSONIC; //플라이모드에 2대입
		sa.fly();  //if문이 참이기 때문에 초음속 비행합니다
		sa.flyMode = SupersonicAirplane.NOMAL; //플라이 모드에 1대입
		sa.fly();//if문 거짓 일반비행합니다
		sa.land(); //착륙합니다
	}

}
/*
public class Airplane {
	public void land() {
		System.out.println("착륙합니다");
	}
	
	public void fly() {
		System.out.println("일반비행합니다");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다");
	}
}

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



*/
