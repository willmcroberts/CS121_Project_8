// Cutomer.java
import java.util.*;
import java.io.*;

public class Customer extends User implements serializable {
	CheckingAccount checking;
	SavingsAccount savings;

	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.start();
	} // End main

	public Customer() {
	//	this.userName = admin;
		this.pin = "0000";
	} // End Customer()

	public Customer(String userName, String pin) {
	
	} // End Customer()

	public void start() {
		boolean keepGoing = true;
		while (keepGoing) {
			String response = menu();
			if (response.equals("0")) {
				keepGoing = false;
			} else if (response.equals("1")) {
				checking.start();
			} else if (response.equals("2")) {
				savings.start();
			} else if (response.equals("3")) {
				this.changePin();
			} else {
				System.out.println("");
				System.out.println("Invalid input");
			} // End elif statements
		} // End while loop
	} // End start()

	public String menu() {
		Scanner input = new Scanner(System.in);

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
		Scanner input = new Scanner(System.in);
		System.out.println("Change PIN: ");
		String newPin = input.nextLine();
		this.setPin(newPin);
	} // End changePin() 

	public String getReport() {
		System.out.println("User: " + this.userName);
		checking.checkBalance();
		savings.checkBalance();
		
		return "";
	} // End getPeport

	public void setPIN(String pin) {
		if (pin.matches("^\\d{4}$")) {
			this.pin = pin;
		} else {
			System.out.println("PIN must be a four digit number.\nSetting PIN to 0000");
			this.pin = pin;
		} // End if statment
	} // End setPIN()
} // End Customer class

