package basics;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s12="welcome";
String rev1=" ";
for(int i=s12.length()-1;i>=0;i--) {
	rev1=rev1 +s12.charAt(i);
	
}
	System.out.println("reverse a string with for loop :" +rev1);
//check palindrome or not
	String s13="mom";
	String rev11="";
	for(int i=s13.length()-1;i>=0;i--) {
		rev11=rev11 +s13.charAt(i);
		
	}
		System.out.println("reverse a string with for loop :" +rev11);
		if(s13.equalsIgnoreCase(rev11)) {
			System.out.println("is palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
