// Admin.java
import java.util.*;

public class Admin extends User {
	public static void main(String[] args) {
		Admin a = new Admin();
		a.login();
	} // End main
	
	public Admin() {
		this.userName = "admin";
		this.pin = "0000";
	} // End Admin()

	public String menu() {
		Scanner input = new Scanner(System.in);

		System.out.println("");
		System.out.println("0) Quit");
		System.out.println("1) Full customer report");
		System.out.println("2) Add user");
		System.out.println("3) Apply interest");
		System.out.println("");
		System.out.print("Enter option: ");
		
		return input.nextLine();
	} // End menu()

	public String getReport() {
		return this.userName + ", " + this.pin;
	} // End getReport()

	public void start() {
		// It said to make this but to leave it blank
	} // End start()
} // End Admin class
