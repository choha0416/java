package ex1002;
//배열을 사용한for문
public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		for(int score : scores) { // scores 인덱스 주소를 0부터 대입 처리문에서 처리한뒤 다음 주소를 대입후 처리
			sum += score;
		}
		System.out.println("점수 총합= "+sum);
		
		double avg = (double) sum / scores.length; // 나누기에서 소숫점이 나올수 있기때문에 더블형 캐스트
		System.out.println("점수 평균= "+avg);
	}

}
