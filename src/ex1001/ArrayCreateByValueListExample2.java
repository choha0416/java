package ex1001;
//배열생성 new사용
public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] {83,90,87}; // new 사용 배열 만듬
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: "+ sum1);
		
		int sum2 = add (new int[] {83,90,87}); //add메서드 호출부
		System.out.println("총합: "+ sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) { //add메서드 선언부
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}

/*
 public static int add(int[] scores) { 
	int sum = 0;
	for(int i=0; i<3; i++) {
		sum += scores[i];
	}
	return sum;
}

중문전의  public static int add(int[] scores)가 선언부

중문 안쪽의 
	int sum = 0;
	for(int i=0; i<3; i++) {
		sum += scores[i];
	}
	return sum;
	부분이 처리부
	
	선언부는 int형으로 scores 1차원배열 매개변수를 만들겠다하고있음
	int sum2 = add (new int[] {83,90,87}); 호출부에서는 위의 선언에따라
	
	int형으로 1차원배열을 만들고 실행함
	
	선언부의 처리문이 배열안의 값을 모두 더하는 동작을 하고있기 때문에 
	sum2는 배열 안의 값 83 90 87을 더한값을 가지게됨
	
*/