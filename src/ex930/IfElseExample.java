package ex930;
//if else예제 
public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		//if문에서 조건에 부합하지 않기때문에 else문으로 내려감
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("A등급입니다");
		} else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("B등급입니다");
		}
	}

}
