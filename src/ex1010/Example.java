package ex1010;
//인터페이스 상속
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC imp1 = new ImplementationC(); //ImplementationC는 InterfaceC의 구현 클래스
		
		InterfaceA ia = imp1; 
		ia.methodA();  //imp1은 a를 가짐 a실행 가능
		System.out.println();
		//ia.methodB(); //a에는 b를 가지고 있지 않음
		
		InterfaceB ib = imp1;
		ib.methodB(); //b에는b를가지고있음 실행가능
		System.out.println();
		//ib.methodC(); //c를 가지고있지 않음
		
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println(); //c는 모든 인터페이스를 상속받았기때문에 모두 실행 가능
		
		
	}

}
/*

public interface InterfaceA {
	public void methodA();
}
public interface InterfaceB {
	public void methodB();
}

public interface InterfaceC extends InterfaceA, InterfaceB {
	public void methodC();
}

public class ImplementationC implements InterfaceC {
	public void methodA() {
		System.out.println("ImC-methodA()실행");
	}
	
	public void methodB() {
		System.out.println("ImC-methodB()실행");
	}
	
	public void methodC() {
		System.out.println("ImC-methodC()실행");
	}
}

*/
