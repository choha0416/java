package exex;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200"); //문자형200을 인티저형으로 박싱
		Integer obj3 = Integer.valueOf("300"); //문자형300을 인티저형으로 박싱
		System.out.println("박싱");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		System.out.println("언박싱");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
