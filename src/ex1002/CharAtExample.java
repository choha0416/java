package ex1002;
//charAt()메소드 인덱스의 문자를 리턴에 특정 위치의 문자를 얻는다
public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9504161234567";
		char sex = ssn.charAt(6); //index6번의 수를 얻기때문에 1 즉 성별부분의 값을 얻을 수 있다
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;	
		}	
	}

}
