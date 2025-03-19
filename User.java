// User.java

abstract class User implements HasMenu {
	
	String userName;
	String pin;

	public boolean login() {
	
	} // End login()

	public boolean login(userName, pin) {
		
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
	
	} // End getReport
} // End User class
