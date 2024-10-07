package package1;

public class B1 {
	public B1() {
		A1 a= new A1();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; 같은패키지에 A1클래스가 있지만 private로 field3이 선언되어있어 다른 클래스에서 호출 불가
		
		a.method1();
		a.method2();
		//a.method3(); 같은 패키지안의 A1클래스에 method3이 있지만 private로 method3을 생성하였기 때문에 호출 불가
		
	}
}
