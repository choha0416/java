package ex1011;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = new String("김성민");
		String strVar2 = "김성민";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 스트링 객체를 참조");
		} else {
			System.out.println("다른 스트링 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
