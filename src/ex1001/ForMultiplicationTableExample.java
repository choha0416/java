package ex1001;
//구구단 예제
public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m=2; m<=9; m++) { //m의 조건이 만족할경우 ***단***실행후 밑의 포문으로 넘어감 만족하지 않을경우 for문 종료
			System.out.println("*** "+m+"단 ***");
			for (int n=1; n<=9; n++) {//n의 조건이 만족할경우 밑의 프린트문을 실행 만족하지 않을경우 위의 for문으로 돌아가 m++
				System.out.println(m+" x "+n+" = "+(m*n));
			}
		}
	}

}
