package ex1011;
import java.io.*;

public class KeyboardToStinrgExample{

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		byte[] bytes = new byte[100];
		
		System.out.print("입력");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0 , readByteNo-2); //readByteNo는 길이 엔터가 10과 13이 두번 입력되기때문에 -2해줌
		System.out.println(str);
	}

}
