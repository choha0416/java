package ex1007;

public class Calculator1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 myCalc = new Calculator1(); //1.객체 생성
		myCalc.execute(); //2.라이브러리 클래스의 execute메소드로 이동
	}

}

/*
public class Calculator1 {
	int plus(int x, int y) {//6.  
		int result = x + y;// 7. x+y를 리턴 
		return result;
	}
	
	double avg(int x, int y) { //4. 7,10 대입
		double sum = plus(x,y); //5. plus메소드로 이동 8. plus = 7+10 17을 sum으로 보내고 
		double result = sum/2;//9. 17/2
		return result;
	}
	
	void execute() {
		double result = avg(7,10);//3. avg 메소드로 이동후 값 대입 //10 .avg(7,10) = sum/2 = plus(7,10)/2 = (7+10)/2
		println("실행결과: "+result); // result =8.5 중문 처리결과   >>  실행결과: 8.5 = void execute()
	}
	
	void println(String message) {
		System.out.println(message);
	}
}

*/
