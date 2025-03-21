// Cutomer.java
import java.util.*;

public class Customer extends User {
	CheckingAccount checking = new CheckingAccount;
	SavingsAccount savings = new SavingsAccount;

	public static void main(String[] args) {
		Customer cust = new Customer;
		cust.start();
	} // End main

	public Customer() {
			
	} // End Customer()

	public Customer(userName, pin) {
	
	} // End Customer()

	public void start() {
		boolean keepGoing = true;
		while (keepGoing) {
			String response = menu();
			if (reponse.equals("0")) {
				keepGoing = false;
			} else if (response.equals("1") {
				checking.start();
			} else if (response.equals("2") {
				savings.start();
			} else if (response.equals("3") {
				this.changePin();
			} else {
				System.out.println("");
				System.out.println("Invalid input");
			} // End elif statements
		} // End while loop
	} // End start()

	public String menu() {
		Scanner input = new Scanner(Systen.in);

		System.out.println("");
		System.out.println("0) Exit");
		System.out.println("1) Manage Checking Account");
		System.out.println("2) Manage Savings Account");
		System.out.println("3) Change PIN");
		System.out.println("");
		System.out.print("Enter option: ");
		return input.nextLine();
	} // End menu()

	public void changePin() {
		
	} // End changePin() 

	public String getReport() {
		
	} // End getPeport

	public void setPIN(String pin) {
		if (pin.matches("^\\d{4}$");
			this.pin = pin;
		else {
			System.out.println("PIN must be a four digit number.\nSetting PIN to 0000");
			this.pin = pin;
		} // End if statment
	} // End setPIN()
} // End Customer class

