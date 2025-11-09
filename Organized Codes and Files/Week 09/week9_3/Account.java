package week9_3;

class Account {
	int id;
	String Account_holder_name;
	String Address;
	private double balance;
	
	public Account(int id, String name, String address, double initialBalance) {
		this.id = id;
		this.Account_holder_name = name;
		this.Address = address;
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.printf("Successfully deposited %.2f. New balance is %.2f\n", amount, this.balance);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}
	
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive.");
		} else if (this.balance >= amount) {
			this.balance -= amount;
			System.out.printf("Successfully withdrew %.2f. New balance is %.2f\n", amount, this.balance);
		} else {
			System.out.println("Withdrawal failed. Insufficient funds.");
		}
	}
	
	public void displayDetails() {
		System.out.println("--- Account " + this.id + " ---");
		System.out.println("Holder: " + this.Account_holder_name);
		System.out.println("Address: " + this.Address);
		System.out.printf("Current Balance: %.2f\n", this.balance);
		System.out.println("--------------------");
	}
	
	public static double calculateSimpleInterest(double p, double r, double t) {
		return (p * r * t) / 100.0;
	}
	
	public static double calculateCompoundInterest(double p, double r, double t ) {
		double rateAsDecimal = r / 100.0;
		double amount = p * Math.pow(1 + rateAsDecimal, t);
		return amount - p;
	}
}
