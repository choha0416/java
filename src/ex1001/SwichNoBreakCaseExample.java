package ex1001;

public class SwichNobreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8에서11사이 정수얻기
		int time = (int)(Math.random()*4)+8;
		
		System.out.println("[현재시간: "+time+" 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
		}
	}

}
