package ex1007;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567","계백");
		
		System.out.println(p1.Nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.Nation = "usa";
		//p1.ssn = "654321-7654321";
		p1.name ="을지문덕";
		
		System.out.println(p1.name);
	}

}
