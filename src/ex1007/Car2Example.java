package ex1007;

public class Car2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 myCar = new Car2();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}
	}

}
