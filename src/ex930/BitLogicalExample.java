package ex930;

public class BitLogicalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("45 & 25 = "+(45 & 25));
		System.out.println("45 | 25 = "+(45 | 25));
		System.out.println("45 ^ 25 = "+(45 ^ 25));
		System.out.println("~45= "+(~45));
		System.out.println("--------------------------------");
		
		byte receiveData = -120;
		
		//방법1: 비트 논리곱 연산으로 언싸인 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		//방법2 자바 api를 이용해 언싸인 정수얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}

}
