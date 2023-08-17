package java8ex;
interface Myinterface{
	int add(int a,int b);
int sub(int a,int b);

	
}

public class LambdaEx1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Myinterface m1=(int a,int b)->a+b;
 System.out.println(" sumis " + m1.add(3, 4));
 Myinterface m2=(int a,int b)->a-b;
 System.out.println(" Sub is " +  m2.sub(5, 4));
 Myinterface m3=(int a,int b)->a*b;
 System.out.println(" multiply is " + m3.mul(3, 4));


}}
