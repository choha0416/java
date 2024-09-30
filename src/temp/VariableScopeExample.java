package temp;
/*
잘못된 예시
public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; //v2가 중괄호 밖에있기 때문에 v2를 읽어올수 없음
		System.out.println(v3);
	}

}
*/

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		int v2 = 0;
		if(v1>10) {
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
	}

}
