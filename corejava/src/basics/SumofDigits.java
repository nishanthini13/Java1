package basics;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=356;
		int rem=0;
		int sum=0;
		while (num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;

			System.out.println(rem);
		}
		System.out.println(sum);

	}
}