package ex1007;

public class StaticCar {
	
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticCar myCar = new StaticCar();
		myCar.speed = 60;
		myCar.run();
	}

}
