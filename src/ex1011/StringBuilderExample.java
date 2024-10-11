package ex1011;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		sb.append("java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");//인덱스 4에 2삽입후 원래 있던 4인덱스는 5인덱스로 밀림
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');//4인덱스자리를 6으로 변경 인덱스 변경x
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "book");//6포함 13 비포함
		System.out.println(sb.toString());
		
		sb.delete(4, 5);//4포함 5 비포함
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자수: "+length);
		
		String result = sb.toString();
		System.out.println(result);
	}

}
