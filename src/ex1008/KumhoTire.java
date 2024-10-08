package ex1008;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire 수명:"+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("***"+location+"KumhoTire타이어 펑크 ***");
			return false;
		}
	}
}
