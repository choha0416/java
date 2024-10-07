package ex1007;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleron obj1 = new Singleton(); 컴파일에러
		//Singleron obj2 = new Singleton(); 컴파일에러
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체 입니다");
		} else {
			System.out.println("다른 싱글톤 객체 입니다");
		}
	}

}
