package ex1017;
import java.io.FileReader;
public class FileReaderExampe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\seongmin\\temp\\src\\ex1017\\FileReaderExampe.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo=fr.read(cbuf))!=-1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.print(data);
		}
		fr.close();
	}

}
