package ex1011;

public class StringReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr ="자바는 객체지향언어 입니다. 자바는 풍족한 API를 지원합니다.";
		String newStr = oldStr.replace("API", "기본 API");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
