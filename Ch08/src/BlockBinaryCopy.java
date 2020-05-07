import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class BlockBinaryCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("D:\\workspace\\java\\Git\\Ch08\\pictureCooy.jpg");
		
		int c;
		try {
			FileInputStream fin = new FileInputStream(src);
			FileOutputStream fout = new FileOutputStream(dest);
			byte b[] = new byte[1024*10];
			while(true) {
				int n = fin.read(b);
				fout.write(b,0,n);
				if(n < b.length) {
					break;
				}
			}
			fin.close();
			fout.close();
			System.out.println(src.getPath() + " to " + dest.getPath());
		} catch (Exception e) {
			System.out.println("IOErrors");
		}
	}

}
