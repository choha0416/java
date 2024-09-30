package ex930;
//다중 if문 비효율적 모든 코드를 읽으면서 내려가기 때문에 처리속도 느려짐 안씀
public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("A등급입니다");
		}
		if(score<90) {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("B등급입니다");
		}
	}

}
