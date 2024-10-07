package ex1007;

public class StaticCaculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = 10 * 10 * StaticCaculator.pi;
		int result2 = StaticCaculator.plus(10, 5);
		int result3 = StaticCaculator.minus(10, 5);
		
		System.out.println("result1 :" +result1);
		System.out.println("result2 :" +result2);
		System.out.println("result3 :" +result3);
	}

}
