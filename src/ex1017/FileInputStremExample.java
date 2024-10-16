package ex1017;
import java.io.FileInputStream;

public class FileInputStremExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("C:\\seongmin\\temp\\src\\ex1017\\FileInputStremExample.java");
			int data;
			while((data = fis.read())!=-1) {
				System.out.write(data);
			}
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
