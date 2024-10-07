package package2;
import package1.A1;
public class C1 {
	public C1() {
		A1 a = new A1();
		a.field1 = 1;
		//a.field2 = 1; package1 패키지의 A1 클래스를 import하였지만 A1클래스의 field2는 defalt형으로 선언하였기 떄문에 다른 패키지에서 호출 불가 
		//a.field3 = 1; 마찬가지로 field3은 private로 선언되었기 떄문에 같은 클래스에서만 사용가능하나 다른 패키지의 다른클래스라 사용불가
		
		a.method1();
		//a.method2(); method2는 package1의 A1클래스에서 defalt형으로 선언되었기 때문에 다른 패키지에서 사용불가
		//a.method3(); method3은 private로 선언되었기 때문에 같은클래스가 아니라 사용 불가
	}
}
