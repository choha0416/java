package temp;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다. ";
		System.out.println(str);
		
		str = "번호\t이름\t직업 "; //t=tab
		System.out.println(str);
		//println은 자동 줄바꿈 print는 아님
		
		System.out.print("나는");
		System.out.print("자바를");
		System.out.print("배웁니다.\n");//n=줄바꿈 줄바꿈 전까지의 출력이 모두 이어져서 출력됨
		
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
		
	}

}
