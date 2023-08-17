package sample;

import java.util.Scanner;

public class PaternEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number of rows :");
		int row=3;
		int nrow=sc.nextInt();
		System.out.println("pyramid pattern :");

		for(int i=0;i<row;i++) {
			for(int j=row-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println("");
			}
			}
	}


