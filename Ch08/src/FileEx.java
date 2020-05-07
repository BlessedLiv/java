import java.io.File;

public class FileEx {
	
	public static void listDirectory(File dir) {
		System.out.println("----------" + dir.getPath() + "의 서브 입니다. --------------");
		File[] subFiles = dir.listFiles();
		for(int i=0; i< subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			String res = "";
			if(f.isFile()) res = "File";
			else if(f.isDirectory()) res = "Directory";
			System.out.print("\t"+ res );
			
			System.out.print("\tFile Size: " + f.length());
			System.out.printf("\tModified Date:%tb %td %ta %tT\n", t,t,t,t);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", "+ f1.getName());
		
		String res = "";
		if(f1.isFile()) res = "Files";
		else if(f1.isDirectory()) res = "Directories";
		System.out.println(f1.getPath() + " is " + res );
		
		File f2 = new File("D:\\workspace\\java\\Git\\Ch08\\java_sample");
		if(!f2.exists()) f2.mkdir();
		
		listDirectory(new File("D:\\workspace\\java\\Git\\Ch08"));
		f2.renameTo(new File("D:\\workspace\\java\\Git\\Ch08\\javasample"));
		
		listDirectory(new File("D:\\workspace\\java\\Git\\Ch08"));
	}
	

}
