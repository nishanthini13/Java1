package exception;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(mark);
		
	}
}
public class MarksheetEx {

	
void checkmark(int mark) {
	if(mark<50) {
		throw new InvalidAgeException("Invalid");	}
}
	else {
	System.out.println("valid");
}
public static void main(String[] args) {
	
	}

}
