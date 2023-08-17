package java8ex;
interface Myinterface1{
	 int evenodd(int a);
}
public class LambdaEvenOd {

	private static final int a = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Myinterface1 mf1=(int a)->a;
		
		 {
		if(a%2==0) 
				 System.out.println("even no "); 
		 else 
			 System.out.println(" odd no ");
		 }
	}

}
