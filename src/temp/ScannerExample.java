package temp;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//입력을 받기위한 스캐너 생성
		
		System.out.print("x값 입력: ");
		String strX = scanner.nextLine();// 값을 입력받아 strX에 보냄
		int x = Integer.parseInt(strX);//입력받은 값을 정수형으로 변환
		
		System.out.print("y값 입력: ");
		String strY = scanner.nextLine();// 값을 입력받아 strY에 보냄
		int y = Integer.parseInt(strY);//입력받은 값을 정수형으로 변환
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {//반복문 생성
			System.out.print("입력 문자열: ");
			String data= scanner.nextLine();
			if(data.equals("q")) {//입력받은 문자열이q일경우 반복문의 종료
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
	}

}
