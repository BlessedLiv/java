import java.io.FileOutputStream;

//���̳ʸ� ���� �����


public class FileOutputStreamEx {

	public static void main(String[] args) {
		byte b[] = {7, 51, 3, 4, -1, 24};
		try {
			FileOutputStream fout = new FileOutputStream("D:\\workspace\\java\\Git\\test.out");
			for(int i=0; i< b.length; i++) {
				fout.write(b);
			}
			fout.close();
			
		} catch (Exception e) {
			System.out.println("IO Errors");
			return;
		}
		System.out.println("test.out�� �����߽��ϴ�.");
	}

}
