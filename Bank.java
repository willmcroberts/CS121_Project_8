// Bank.java
import java.util.*;
import java.io.*;

public class Bank implements HasMenu {
	Admin admin;
	ArrayList<Customer> customers = new ArrayList<>();

	public Bank() {
		this.loadSampleCustomers();
		this.start();
		//this.saveCustomers();
	} // End Bank()

	public static void main(String[] args) {
		new Bank();
	} // End main()

	public void loadSampleCustomers() {
		customers.add(new Customer("Alice", "1111"));
		customers.add(new Customer("Bob", "2222"));
		customers.add(new Customer("Cindy", "3333"));
	} // End loadSampleCustomers()

	public void saveCustomers() {
		try {
			FileOutputStream fo = new FileOutputStream("Customer.dat");
			ObjectOutputStream abOut = new ObjectOutputStream(fo);
			obOut.writeObject(Customer);
			fo.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} // End try
	} // End saveCustomers()

	public void loadCustomers() {
		Customer customer;
		try {
			FileInputStream fIn = new FileInputStream("Customer.dat");
			ObjectInputStream obIn = new ObjectInputStream(fIn);
			customer = (customer)obIn.readObject();
			obIn.close();
			fIn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} // End try
	} // End loadCustomers()

	public void reportAllCustomers() {
	
	} // End reportAllCustomers()

	public void addUser() {
	
	} // End addUser()

	public void applyInterest() {
		for (Customer Customer: customers) {
			
		} // End for loop
	} // End apply Interest()

	public void loginAsCustomer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String userNameIn = input.nextLine();
		System.out.print("PIN: ");
		String pinIn = input.nextLine();

		Customer currentCustomer = null;
		for (Customer Customer: customers) {
			if (customer.login(userNameIn, pinIn)) {
				currentCustomer = Customer;
			} // End if statement
		} // End for loop

		if (currentCustomer == null) {
			System.out.println("Customer not found.");
		} else {
			currentCustomer.start();
		} // End elif statememt

	} // End loginAsCustomer()

	public String menu() {
	Scanner input = new Scanner(System.in);

	System.out.println("");
	System.out.println("0) Exit");
	System.out.println("1) Login as customer");
	System.out.println("2) Login as admin");
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
				// Login as Customer
			} else if (response.equals("2")) {
				// Login as Admin
			} else {
				System.out.println("Invalid input");
			} // End elif statements
		} // End while loop
	} // End start()

	public void startAdmin() {
		boolean keepGoing = true;
		while (keepGoing) {
			String response = Admin.menu();
			if (reponse.equals("0")) {
				keepGoing = false;
			} else if (response.equals("1")) {
				// Give full customer report
			} else if (response.equals("2")) {
				// Add user
			} else if (response.equals("3")) {
				applyInterest();
			} else {
				System.out.println("Invalid input");
			} // End elif statement
		} // End while statement
	} // End startAdmin()
} // End Bank class
