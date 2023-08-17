package java8ex;

import java.util.Scanner;

@FunctionalInterface
interface Validate{
	boolean login(String uname,String password);
}
public class ValidateUserEx {
	boolean login(String uname,String password) {
		Validate V=(u,p)->{
			return(uname.equals("nisha")&&(password.equals("12345"))?true:false);
			
		};
		return V.login(uname, password);
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	System.out.println(" enter a username &password :");
		String password=s.next();
		String uname=s.next();
		ValidateUserEx v1= new ValidateUserEx();
		System.out.println(v1.login(uname, password));
	}

}
