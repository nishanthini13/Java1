package sample;

import java.util.Scanner;

class Customer extends Exception{
	 public Customer (String msg) {
		 super(msg);
	 }

	@Override
	public String toString() {
		return "Customer []";
	}
}

public class OrderEx1 {

	public static void main(String[] args) {
		int id=1;
		String name="nisha";
		double  walletbalance=1500;
		String address="nisha@mail.com";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		int amount=sc.nextInt();
		try {
			
		
		if(walletbalance<amount)
		{
			throw new MinBalanceException("insufficient balance: "+walletbalance);
		}
		else
		{
			System.out.println("order is successful: "+amount);
		}
		}
		catch(MinBalanceException e)
		{
			System.out.println(e);
		}
	}

}
