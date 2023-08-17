package assignment;

public class ActivityFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//assigment op
		int number1, number2;
		number1 = 20; 
		System.out.println(number1); 
		number2 = number1;
		System.out.println(number2);
		//arithmetic
		double output;
		// Addition op
		output = number1 + number2; 
		System.out.println("number1 + number2 = " + output);
		// Subtraction op
		output = number1 - number2; 
		System.out.println("number1 - number2 = " + output);
		// Multiplication op 
		System.out.println("number1 * number2 = " + output);
		// Division op
		output = number1 / number2; 
		System.out.println("number1 / number2 = " + output);
		// Remainder op
		output = number1 % number2; 
		System.out.println("number1 % number2 = " + output);
		// Unary Op
		double number = 10, resultNumber;
		boolean flag = false;
		System.out.println("+number = " + +number);
		// number is equal to 10.
		System.out.println("-number = " + -number);
		// ++number 
		System.out.println("number = " + ++number);
		// -- number 
		System.out.println("number = " + --number);
		// number is equal to 10.
		System.out.println("!flag = " + !flag);
		// flag is still false.
		System.out.println(number++); 
		System.out.println(number);
		System.out.println(++number);
		System.out.println(number);
		// Relational Op
		if (number1 > number2)
		{
		System.out.println("number1 is greater than number2.");
		}
		if (number1 < number2)
		{
		System.out.println("number2 is greater than number1.");
		}
		if (number1 == number2)
		{
		System.out.println("number1 is equal to number2.");
		}
		// Logical Op
		int number3 = 20;
		boolean result;
		// Logical OR 
		result = (number1 > number2) || (number3 > number1);
		// result will be true because number3 greater than number1
		System.out.println(result);
		// Logical AND
		result = (number1 > number2) && (number3 > number1);
		// result will be false because number1 is equal to number2
		System.out.println(result);
		// Ternary Op
		int februaryDays = 29; String display;
		display = (februaryDays == 28) ? "Not a leap year" : "Leap year"; 
		System.out.println(display);
		// Bitwise Op
		int a = 40; 
		int b = 20; 
		int c = 10;
		c = a & b; 
		System.out.println("a & b = " + c );
		c = a | b; 
		System.out.println("a | b = " + c );
		c = a ^ b;  
		System.out.println("a ^ b = " + c );
		c = ~a; 
		System.out.println("~a = " + c );
		// Shift Operator
		c = a >> 2; 
		System.out.println("a >> 2 = " + c );
		c = a << 2; 
		System.out.println("a << 2 = " + c );
		

	}

}
