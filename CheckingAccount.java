// CheckingAccount.java
import java.util.*;

public class CheckingAccount implements HasMenu {
	
	double balance;

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount();
		ca.start();
	} // End main

	public CheckingAccount() {
		this.balance = 0d;
	} // End CheckingAccount()

	public CheckingAccount(double balance) {
		this.balance = balance;
	} // End CheckingAccount()

	public String menu() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("0) Quit");
		System.out.println("1) Check balance");
		System.out.println("2) Make deposit");
		System.out.println("3) Make withdrawl");
		System.out.println("");
		System.out.print("Enter option: ");
		return input.nextLine();
	} // End menu()

	public void start() {
		boolean keepGoing = true;
		while(keepGoing) {
			String response = menu();
			if (response.equals("0")) {
				keepGoing = false;
			} else if (response.equals("1")) {
				System.out.println("Checking balance...");
				this.checkBalance();
			} else if (response.equals("2")) {
				System.out.println("Making a deposit...");
				this.makeDeposit();
			} else if (response.equals("3")) {
				System.out.println("Making a withdrawl...");
				this.makeWithdrawl();
			} else {
				System.out.println("Not a valid input");
			} // End if statement
		} // End while loop
	} // End start()

	public void checkBalance() {
		System.out.println("Current balance: " + this.getBalanceString());
	} // End checkBalance()

	public String getBalanceString() {
		String result = String.format("$%.02f", this.balance);
		return result;
	} // End getBalanceString()

	private double getDouble() {
		Scanner input = new Scanner(System.in);
		String sResult = input.nextLine();
		double result = 0d;

		try {
			result = Double.parseDouble(sResult);
		} catch (Exception a) {
			System.out.println("");
			System.out.println("Invalid input. Changing to 0.");
			result = 0d;
		} // End try

		return result;
	} // End getDouble()

	public double getBalance() {
		return this.balance;
	} // End getBalance

	public void setBalance(double balance) {
		this.balance = balance;
	} // End setBalance()

	public void makeDeposit() {
		System.out.print("How much to deposit: ");
		double amount = getDouble();
		balance += amount;
	} // End makeDeposit()

	public void makeWithdrawl() {
		System.out.print("How much to withdrawl: ");
		double amount = getDouble();
		balance -= amount;
	} // End makeWithdrawl()
} // End CheckingAccount class
