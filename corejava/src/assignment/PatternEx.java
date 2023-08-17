package assignment;

import java.util.Scanner;

public class PatternEx {
	void printPattern(int n) {
		int rowCount=1;
		for(int i=n;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++) {
				System.out.println(rowCount+" ");
			}
			System.out.println();
			rowCount++;
		}
	}
	public static void main(String[] args) {
		
	Scanner in=new Scanner (System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		PatternEx p=new PatternEx();
		

	p.printPattern(a);
	p.printPattern(b);
	p.printPattern(c);
		}
	
	}


