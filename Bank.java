// Bank.java
import java.util.*;
import java.io.*;

public class Bank implements HasMenu, Serializable {
	Admin admin = new Admin();
	ArrayList<Customer> customers = new ArrayList<Customer>();

	public Bank() {
		this.loadSampleCustomers();
		this.saveCustomers();
		this.loadCustomers();
		this.start();
		this.saveCustomers();
		} // End Bank()

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.start();
	} // End main()

	public void loadSampleCustomers() {
		customers.add(new Customer("Alice", "1111"));
		customers.add(new Customer("Bob", "2222"));
		customers.add(new Customer("Cindy", "3333"));
	} // End loadSampleCustomers()

	public void saveCustomers() {
		try {
			FileOutputStream fo = new FileOutputStream("customer.dat");
			ObjectOutputStream obOut = new ObjectOutputStream(fo);
			obOut.writeObject(customers);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} // End try
	} // End saveCustomers()

	class CustomerList extends ArrayList<Customer> {}

	public void loadCustomers() {
		Customer customer;
		try {
			FileInputStream fIn = new FileInputStream("customer.dat");
			ObjectInputStream obIn = new ObjectInputStream(fIn);
			customers = (CustomerList)obIn.readObject();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} // End try
	} // End loadCustomers()

	public void reportAllCustomers() {
		for (Customer customer: customers) {
			System.out.println(customer.getReport());
		} // End for loop
	} // End reportAllCustomers()

	public void addUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("New Customer:");
		System.out.print("Username: ");
		String userName = input.nextLine();
		System.out.print("PIN: ");
		String pin = input.nextLine();
		System.out.println("");
		Customer newCustomer = new Customer(userName, pin);
		customers.add(newCustomer);
	} // End addUser()

	public void applyInterest() {
		for (Customer Customer: customers) {
			Customer.savings.calcInterest();
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
			if (Customer.login(userNameIn, pinIn)) {
				currentCustomer = Customer;
			} // End if statement
		} // End for loop

		if (currentCustomer == null) {
			System.out.println("");
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
				loginAsCustomer();
			} else if (response.equals("2")) {
				startAdmin();
			} else {
				System.out.println("Invalid input");
			} // End elif statements
		} // End while loop
	} // End start()

	public void startAdmin() {
		boolean keepGoing = true;
		keepGoing = admin.login();
		while (keepGoing) {
			String response = admin.menu();
			if (response.equals("0")) {
				keepGoing = false;
			} else if (response.equals("1")) {
				reportAllCustomers();
			} else if (response.equals("2")) {
				addUser();
			} else if (response.equals("3")) {
				applyInterest();
			} else {
				System.out.println("Invalid input");
			} // End elif statement
		} // End while statement
	} // End startAdmin()
} // End Bank class
