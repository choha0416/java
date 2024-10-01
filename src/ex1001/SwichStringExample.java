package ex1001;
//스위치
public class SwichStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "과장";
		
		switch(position) { //포지션에 과장이 들어가 있기때문에 case 과장의 프린트문을 실행후 swich문을 빠져나옴
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}

	}

}
