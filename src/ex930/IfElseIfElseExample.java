package ex930;
//다중 ifelse문
public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 90이상입니다");
			System.out.println("A등급입니다");
		} else if(score >= 80) {
			System.out.println("점수가 80~89입니다");
			System.out.println("B등급입니다");
		} else if(score >= 70) { //실행했기때문에 밑에 else문은 넘어감
			System.out.println("점수가 70~79입니다");
			System.out.println("C등급입니다");
		} else {
			System.out.println("점수가 70미만입니다");
			System.out.println("D등급입니다");
		}
	}

}
// 첫번째 90이상을 통과 못했기때문에 밑의 else if로 내려감 마찬가지로 조건이 맞이 않기때문에 밑의 70 이상으로 내려감
// 70이상 조건에 만족하기 때문에 안의 내용을 실행후 else문 생략후 종료
