package ex1007;

public class TelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Television.info); //static으로 선언한 필드이기때문에 클래스명.필드명으로 불러옴
	}

}


/*
public class Television {
	static String company = "samsung";
	static String model = "lcd";
	static String info;
	
	static {
		info = company +"-"+model;
	}
}
static으로 company model을 명시적 초기화

초기화 블록으로  info를 초기화 info = samsung-lcd 로 초기화됨
*/
