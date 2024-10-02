package ex1002;

public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9504161234567";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자릿수가 맞음");
		} else {
			System.out.println("주민번호 자릿수가 틀림");
		}
	}

}
