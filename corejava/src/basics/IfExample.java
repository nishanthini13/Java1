package basics;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		if(marks>= 60) {
			System.out.println(“You passed with first grade.”);
			} 
		else if(marks >=45 || marks < 60) {
			System.out.println(“You passed with second grade.”);
			} 
		else if(marks >=33 || marks < 45) {
			System.out.println(“You passed with third grade.”);
			} 
		else {
			System.out.println(“Sorry, you are fail.”);
			}
	}

}
