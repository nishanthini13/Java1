
import java.util.Scanner;

public class BankApplication {
	private static int Pin;
	private static int ch;
	private static int atmpin=1234;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Pin = 12345;

		System.out.println("WELCOME TO THE BANK OF IOB.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = sc.nextInt();

		while ( entry != Pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = sc.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		BankAccount obj1 =new BankAccount(Pin,atmpin);
		obj1.menu();
	}
}
 class BankAccount {
	double bal;
	double prevTrans;
	int Pin;
	String customerName;
	String customerId;
	private int atmpin;

	BankAccount(int Pin, int atmpin, String customerId) {
		this.Pin = Pin;
		this.atmpin = atmpin;
		this.customerId = customerId;
	}

public BankAccount(int pin2, int pin3) {
		// TODO Auto-generated constructor stub
	}

	public BankAccount() {
	// TODO Auto-generated constructor stub
}

	void deposit(double amount) {
		if (amount != 0) {
			bal += amount;
			prevTrans = amount;
		}
	}

	void withdraw(double amt) {
		if (amt != 0 && bal >= amt) {
			bal -= amt;
			prevTrans = -amt;
		} else if (bal < amt) {
			System.out.println("Bank balance insufficient");
		}
	}

	void getPreviousTrans() {
		if (prevTrans > 0) {
			System.out.println("Deposited: " + prevTrans);
		} else if (prevTrans < 0) {
			System.out.println("Withdrawn: " + prevTrans);
		} else {
			System.out.println("No transaction occured");
		}
	}

	void menu() {
		char option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome....! ");
		System.out.println("\n");
		System.out.println("a) Check Balance");
		System.out.println("b) Deposit Amount");
		System.out.println("c) Withdraw Amount");
		System.out.println("d) Previous Transaction");
		System.out.println("e) Exit");

		do {
			System.out.println("********************************************");
			System.out.println("Choose an option");
			option = sc.next().charAt(0);
			System.out.println("\n");

			switch (option) {
			case 'a':
				System.out.println("......................");
				System.out.println("Balance =" + bal);
				System.out.println("......................");
				System.out.println("\n");
				break;
			case 'b':
				System.out.println("......................");
				System.out.println("Enter a amount to deposit :");
				System.out.println("......................");
				double amt = sc.nextDouble();
				deposit(amt);
				System.out.println("\n");
				break;
			case 'c':
				System.out.println("......................");
				System.out.println("Enter a amount to Withdraw :");
				System.out.println("......................");
				double amtW = sc.nextDouble();
				withdraw(amtW);
				System.out.println("\n");
				break;
			case 'd':
				System.out.println("......................");
				System.out.println("Previous Transaction:");
				getPreviousTrans();
				System.out.println("......................");
				System.out.println("\n");
				break;

			case 'e':
				System.out.println("......................");
				break;
			default:
				System.out.println("Choose a correct option to proceed");
				break;
			}

		} while (option != 'e');

		System.out.println("Thank you for using our banking services");
	}

}




