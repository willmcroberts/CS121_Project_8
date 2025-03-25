// Bank.java
import java.util.*;

public class Bank implements hasMenu {
	Admin admin;
	ArrayList<Customer> list = new ArrayList<>();

	public Bank() {
	
	} // End Bank()

	public static void main(String[] args) {
	
	} // End main()

	public void loadSampleCustomers() {
	
	} // End loadSampleCustomers()

	public void saveCustomers() {
	
	} // End saveCustomers()

	public void loadCustomers() {
	
	} // End loadCustomers()

	public void reportAllCustomers() {
	
	} // End reportAllCustomers()

	public void addUser() {
	
	} // End addUser()

	public void applyInterest() {
	
	} // End apply Interest()

	public void loginAsCustomer() {
	
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
				// Loging as Admin
			} else {
				System.out.println("Invalid input"');
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
				// Apply intrest
			} else {
				System.out.println("Invalid input");
			} // End elif statement
		} // End while statement
	} // End startAdmin()
} // End Bank class
