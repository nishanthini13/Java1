package filereader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		StudentReaderEx st=new StudentReaderEx();
		st.id=1;
		st.name="nisha";
		st.degree="Btech";
		StudentReaderEx st1=new StudentReaderEx();
		st1.id=2;
		st1.name="abi";
		st1.degree="Mtech";
		FileOutputStream fos= new FileOutputStream("newfile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(st);
		oos.writeObject(st1);
		
		oos.close();
		fos.close();
		System.out.println(" Data saved in a file");
	}

}
