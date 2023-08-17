package filereader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis= new FileInputStream("newfile.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		StudentReaderEx st= null;
		StudentReaderEx st1= null;
		//System.out.print(st.id+" "+st.degree);
		st=(StudentReaderEx) ois.readObject();
		st1=(StudentReaderEx) ois.readObject();
		//System.out.println(st.id+" "+st.degree);
		//System.out.println(st1.id+" "+st1.degree);
		st.display();
		st1.display();
		ois.close();
		fis.close();
	}

}
