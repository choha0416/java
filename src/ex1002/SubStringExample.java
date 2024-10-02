package ex1002;
//문자열 에서 특정 위치의 문자열을 잘라내어 가져오고 싶을때 사용
public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "950416-1234567";
		
		String firstNum = ssn.substring(0,6); //인덱스 0포함 6미포함임으로  950416까지 출력
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); //숫자가 하나일경우 해당수 포함 끝까지 불러오기때문에 1234567이 출력
		System.out.println(secondNum);
		
	}

}
