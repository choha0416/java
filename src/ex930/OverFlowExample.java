package ex930;

public class OverFlowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 오버플로우
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
  		int형의 범위를 벗어나기때문에 long형으로 선언해줘야함
		*/
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}

}
