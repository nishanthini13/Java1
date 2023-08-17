package filereader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fio=new FileOutputStream("D:/this.txt");
String s="Farmer";
byte b[]=s.getBytes();
fio.write(b);
System.out.println(" content writer");

	FileInputStream fis=new FileInputStream("D:/this.txt");
	System.out.println(" File content is");
	int i=fis.read();
		while(i !=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
		fis.close();
		}

}



