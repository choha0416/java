package ex1001;
//continue예제
public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------짝수 출력------");
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) { //1부터 10중 i값을 2로 나눈값이 0이면 프린트문으로 즉 짝수일경우 출력
				continue;// 컨티뉴가 실행될경우 i++로 가서 증감후 조건 실행
			}
			System.out.println(i);
		}
		System.out.println("------홀수 출력------");
		for(int i=1; i<=10; i++) {
			if(i%2 ==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
