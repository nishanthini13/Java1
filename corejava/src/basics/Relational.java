package basics;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//binary
		int a=20;
		int b=10;
		String s="hello";
		String s1="hello";
		System.out.println("== :" +(a==b));
		System.out.println("!= :" +(a!=b));
		System.out.println("== :" +(s==s1));
		//bitwise
		int c=5;
		int d=7;
		System.out.println("& :" +(c&d));
		System.out.println("| :" +(c|d));
		System.out.println("~ :" +(~d));
		//shift operator
		int e=4;
		System.out.println("shift :" +(e<<1));
		System.out.println("shift :" +(e>>1));
		//logical
		int f=20;
		boolean result;
		result=(a>b)||(f>a);
		System.out.println(result);
		
		
		//System.out.println("logical :" +(f!g));
		//ternary
		String result1= e>f? "e is max :" :"f is max ";
		System.out.println("highest of two nos :" +result1);
		//max of 3
		int x=10,y=30,z=20,max;
		max =(x>y) ?(x>z? x:z):(y>z?y:z);
				System.out.println("the max of :" +max);
				//pass or fail
				System.out.println("assign :" +(a+=b));		
				
	}

}
