package basics;

import java.util.Scanner;
//string-return
// void-sop

public class MarksheetEx {
	public static String printGrade(int score) {
		if(score<0 && score>100) {
			return "invalid";
		}
		
		switch (score/10) {
		case 10:
			return "a+";
			
		case 9:
			return "a";
		default: return "f";
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner=new Scanner(System.in);
System.out.println("enter your score");

int score=scanner.nextInt();
//MarksheetSwitch m=new MarksheetSwitch();

String result= printGrade(score);
System.out.println("my grade:"+ result);

	}

}

	


