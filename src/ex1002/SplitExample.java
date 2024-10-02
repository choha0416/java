package ex1002;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1,자바 학습, 탐조 타입 스트링을 학습합니다, 김성민";
		
		String[] tokens = board.split(",");
		
		System.out.println("번호" + tokens[0]);
		System.out.println("제목" + tokens[1]);
		System.out.println("내용" + tokens[2]);
		System.out.println("성명" + tokens[3]);
		System.out.println();
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
