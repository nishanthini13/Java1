package exception;
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
public class InvalidAgeEx {
	public String checkAge(int age)throws MyException {
		if(age>18) {
			return"valid age";
		}else {
			throw new MyException("invalid age");
		}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
InvalidAgeEx i=new InvalidAgeEx();
try {
String s=i.checkAge(14);
System.out.println(s);
	}catch (Exception e) {
		System.out.println(e);
	}

}}
