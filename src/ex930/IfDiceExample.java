package ex930;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6)+1;
		/* 랜덤 = 0.0~0.9까지중 하나를 골라온다 *6이기 때문에 
		 * 0.0 0.1 0.2 0.3 0.4 0.5로 변환 int형이기때문에 
		 * 10을곱한뒤 뒤에서 +1을해주어 1부터6까지로 바뀜
		 */
		
		if(num==1) {
			System.out.println("1번이 나왔습니다");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다");
		} else if(num==6) {
			System.out.println("6번이 나왔습니다");
		}
	}

}
