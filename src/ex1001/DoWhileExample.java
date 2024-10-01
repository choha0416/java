package ex1001;
//do while문
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do { //do while문이기 때문에 일단 중괄호 안의 내용을 실행후 while의 조건을따짐
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while(! inputString.equals("q")); //입력받은 값이q가 아닐경우 다시 중괄호 안을 처리 q일경우 반복 종료후 밑의 프린트문으로
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
