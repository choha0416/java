package ex1007;

public class Car1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 myCar = new Car1();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도: "+speed+"km/h");
	}

}
