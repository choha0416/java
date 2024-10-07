package ex1007;

public class Computer {
	int sum1(int[] values) { // 배열형
		int sum = 0;
		for(int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { // ex int result = mycom.sum(1,2,3) 값이 하나씩 추가 공간을 한번씩 총 3번생성 
		int sum = 0;
		for(int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
}
