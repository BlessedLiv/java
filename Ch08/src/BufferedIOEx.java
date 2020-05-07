import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("D:\\workspace\\java\\Git\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
//			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out), 5); //한글출력용
			while((c=fin.read()) != -1) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
			out.flush();
			out.close();
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
