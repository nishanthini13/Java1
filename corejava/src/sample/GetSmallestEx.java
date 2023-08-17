package sample;

import java.util.Arrays;
import java.util.Scanner;

public class GetSmallestEx {
	public int getSecondsmallest(int[]arr) {
	Arrays.sort(arr);
	return arr[1];
	}

	public static void main(String args[]){
		GetSmallestEx g1=new GetSmallestEx();
		Scanner s=new Scanner(System.in);
		String l;
		String[]arr;
		int[]a;
		//Scanner s=new Scanner(System.in);
		l=s.nextLine();
		l=l.replaceAll("\\s+"," ");
		arr=l.split(",");
		a=new int[arr.length];
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(arr[i]);
		}
	     int result=g1.getSecondsmallest(a) ;
	     System.out.print(result);
	   }
}
