import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte[50];
		try {
			FileInputStream fin = new FileInputStream("D:\\workspace\\java\\Git\\test.out");
			int n=0, c;
			while((c = fin.read()) != -1) {
				b[n++] = (byte)c;
			}
			
			System.out.println("출력하는 내용은...");
			
			for(int i=0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			
			fin.close();
		} catch (Exception e) {
			System.out.println("IO Errors");
		}
	}
}
