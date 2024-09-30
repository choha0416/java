package ex930;

public class OverFlowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 오버플로우
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
		*/
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}

}
