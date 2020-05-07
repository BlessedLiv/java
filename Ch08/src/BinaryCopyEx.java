import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("D:\\workspace\\java\\Git\\Ch08\\pictureCooy.jpg");
		
		int c;
		try {
			FileInputStream fin = new FileInputStream(src);
			FileOutputStream fout = new FileOutputStream(dest);
			while((c=fin.read()) != -1) {
				fout.write((byte)c);
			}
			fin.close();
			fout.close();
			System.out.println(src.getPath() + " to " + dest.getPath());
		} catch (Exception e) {
			System.out.println("IOErrors");
		}
	}

}
