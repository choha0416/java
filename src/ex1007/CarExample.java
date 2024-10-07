package ex1007;
//다른 생성자 생성 코드 줄이기
public class CarExample {

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println("car1.company:"+car1.company);
		System.out.println(); //명시적 초기화를한 현대자동차 출력
		
		Car car2 = new Car("자가용"); 
		System.out.println("car2.company:"+car2.company);
		System.out.println("car2.model:"+car2.model);
		System.out.println(); //생성자 초기화에서 스트링 하나를 사용한 모델을 출력
		
		Car car3 = new Car("자가용","빨강");
		System.out.println("car3.company:"+car3.company);
		System.out.println("car3.model:"+car3.model);
		System.out.println("car3.color:"+car3.color);
		System.out.println(); //초기화에서 스트링 두개를 사용한 생성자에 대입
		
		Car car4 = new Car("택시","검정",200);
		System.out.println("car4.company:"+car4.company);
		System.out.println("car4.model:"+car4.model);
		System.out.println("car4.color:"+car4.color);
		System.out.println("car4.maxSpeed:"+car4.maxSpeed);
		System.out.println();

	}

}
