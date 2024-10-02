package ex1002;
//replace()메소드는 기존 문자열은 그대로 두고 대체한 새로운 문자열을 리턴
public class ReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다";
		String newStr = oldStr.replace("자바","java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
// 자바 문자열은 불변입니다. 자바 문자열은 String입니다 해당 문장의 자바를 java로 바꿈
