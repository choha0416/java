package ex1002;
//문자열에서 문자의 개수를 얻고 싶을때 length()메소드를 사용한다
public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9504161234567";
		int length = ssn.length();
		if(length == 13) { //주민번호의 경우 13자리이기 때문에 length가 13일경우 if문의 처리문 실행 아닐경우 else문의 처리문 실행
			System.out.println("주민번호 자릿수가 맞음");
		} else {
			System.out.println("주민번호 자릿수가 틀림");
		}
	}

}
