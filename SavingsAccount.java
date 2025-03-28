// SavingsAccount.java
import java.util.*;

public class SavingsAccount extends CheckingAccount {
	
	double interestRate = .05;

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.start();
	} // End main

	public void calcInterest() {
		double interestAmount = this.balance * this.interestRate;
		this.balance += interestAmount;
		System.out.println("New balance: " + this.getBalanceString());
	} // End calcInterest()

	public void setInterestRate(double intrestRate) {
		this.interestRate = interestRate;
	} // End setInterestRate()

	public double getInterestRate() {
		return this.interestRate;
	} // End getInterestRate()

} // End SavingsAccount class
