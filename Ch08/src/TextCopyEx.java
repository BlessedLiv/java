import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// 파일 복사기능
public class TextCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\windows\\system.ini");
		File dest = new File("D:\\workspace\\java\\Git\\Ch08\\system.txt");
		
		int c;
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c=fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + " to " + dest.getPath());
		} catch (Exception e) {
			System.out.println("IOErrors");
		}
	}

}
