package ex1002;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("박자바","011224-1234567");
		System.out.println("k1.name:"+k1.name);
		System.out.println("k1.ssn:"+k1.ssn);
		
		/* Korean.class 의 생성자
		public Korean(String name, String ssn) {
		this.name= name; //생성자 초기화
		this.ssn= ssn;
		}
		위의 new Korean 값을 대입 this.name 과 ssn으로 인해 Korean클래스의 필드 네임과 ssn에 위의값으로 초기화
		 */
		
		
		Korean k2 = new Korean("김자바","930525-7654321");
		System.out.println("k2.name:"+k2.name);
		System.out.println("k2.ssn:"+k2.ssn);
	}

}
