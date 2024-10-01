package ex1001;
//중첩 if문
public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*20)+81; // 81~ 100의 수중 한개를 score에 보냄
		System.out.println("점수: " + score); //score에 들어간 수를 출력
		
		String grade;
		//score값을 밑의 조건에 대입하여 실행
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade ="A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점: " + grade);
	}

}
