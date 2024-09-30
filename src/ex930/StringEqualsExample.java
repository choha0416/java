package ex930;
//비교연산자
public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "신민철"; 
		String strVar2 = "신민철"; // str1과 2는 스택영역에서 다른 공간을 할당받으나 가르키는 주소는 같다
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2); // 스택영역의 주소열을 비교
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //힙영역의 값을 비교
		System.out.println(strVar1.equals(strVar3));
	}

}
