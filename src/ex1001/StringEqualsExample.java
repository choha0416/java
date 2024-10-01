package ex1001;
//문자열 비교
public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if (strVar1 == strVar2) { // 위의같이 선언한 변수는 1에서 이미 신민철값의 주소를 할당받고 2에서는 스캔하여 같은 주소를 할당함
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		// 할당받은 주소가 같기때문에 if문 실행
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		//equals로 힙영역 안의 값을 직접 비교하는데 두값이 모두 신민철로 같기때문에 프린트문 실행
		String strVar3 = new String("신민철"); // 직접 생성
		String strVar4 = new String("신민철");
		
		if (strVar3 == strVar4) { // 힙영역을 직접 생성하기때문에 값이 같지만 스캔없이 공간을 생성하기때문에 주소가 다름
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		//할당받은 주소는 다르지만 주소를 따라간 힙영역안의 문자열이 둘다 신민철로 같기때문에 프린트문 실행
	}

}
