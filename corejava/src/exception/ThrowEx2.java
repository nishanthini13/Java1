package exception;

import java.util.Scanner;

public class ThrowEx2 {

	
static void validageMarks(int marks) {
	if(marks>0) {
		System.out.println(marks+"is a valid mark");
	}else {
		throw new ArithmeticException("invalid mark");
	}
}
public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	
	}

}
