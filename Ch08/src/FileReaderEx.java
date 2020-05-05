import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fn = null;
		try {
			fn = new FileReader("C:\\windows\\system.ini");
			int c;
			while((c=fn.read()) != -1) {
				System.out.print((char)c);
			}
			
		}catch(IOException e){
			System.out.println("입출력 오류");
		}
		
	}

}
