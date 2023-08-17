package exception;

public class ClassnotfoundEx {
	// compile time example also checked exception

	public static void main(String[] args) {
		try {
		//Class.forName("Class not exit");
			Class. forName("basic.EnumEx");
			System.out.println(" class not found");
			//Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("class found");
	}
catch (ClassNotFoundException e ) {
	//e.printStackTrace();
		System.out.println(e);
	}

}}
