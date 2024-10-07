package ex1007;

public class Car3Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 myCar = new Car3();
		
		myCar.setSpeed(-59);
		
		System.out.println("현재속도: " +myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		System.out.println("현재속도: " +myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도: " +myCar.getSpeed());
	}

}
