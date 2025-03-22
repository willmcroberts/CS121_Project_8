// User.java

abstract class User {
	
	String userName;
	String pin;

	public boolean login() {
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		userName = input.nextLine();
		System.out.print("PIN: ");
		pin = input.nextLine();
		return true;
	} // End login()

	public boolean login(userName, pin) {
		if (userName.equals(this.userName)) {
			if (pin.equals(this.pin)) {
				System.out.println("Login Successful");
				return true;
			} // Ed nested if statement
		} // End if statement
	} // End login()

	public void setUserName(userName) {
		this.userName = userName;
	} // End setUserName()

	public String getUserName() {
		return this.userName;
	} // End getUserName()

	public void setPin(pin) {
		this.pin = pin;
	} // End setPin()

	public String getPin() {
		return this.pin;
	} // End getPin()

	abstract String getReport() {
		
		return;
	} // End getReport	
} // End User class
