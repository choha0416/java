package ex1001;
//break문으로 while문 종료
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num = (int)(Math.random()*6)+1; //1에서 6까지의수중 한가지를 num에 보냄
			System.out.println(num);
			if(num == 6) { //num이 6이나오면 while문 종료 아닐경우 6이 나올때 까지 계속 print문으로 num값을 출력
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
