package assignment;

import java.util.Scanner;

public class AverageEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        double num1 = sc.nextDouble();
		        System.out.print("Enter the second number: ");
		        double num2 = sc.nextDouble();
		        System.out.print("Enter the third number: ");
		        double num3 = sc.nextDouble();
		        sc.close();
		        System.out.print("The average of entered numbers is:" + avr(num1, num2, num3) );
		    }

		  public static double avr(double a, double b, double c)
		    {
		        return (a + b + c) / 3;
		    }
	

}
