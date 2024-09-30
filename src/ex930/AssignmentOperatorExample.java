package ex930;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		result +=10; // result = result + 10 을 나타내나 result를 생략가능 result =+ 10이지만 +를 우선 처리하기때문에 result +=10로 표시
		System.out.println("result="+ result);
		
		result -=5;
		System.out.println("result="+ result);
		
		result *=3;
		System.out.println("result="+ result);
		
		result /=5;
		System.out.println("result="+ result);
		
		result %=3;
		System.out.println("result="+ result);
	}

}
