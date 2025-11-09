package week9_4;

class Saving extends Account {
	// Data member specific to Saving account
	double minBalance;
	
	public Saving(int id, String name, String address, double minBalance) {
		super(id, name, address); // Initialize parent class members
		this.minBalance = minBalance;
	}
	
	@Override
	public void deposit(double amount) {
		System.out.printf("Depositing %.2f into Saving Account #%d\n", amount, this.id);
	}
	
	@Override
	public void withdraw(double amount) {
		System.out.printf("Withdrawing %.2f from Saving Account #%d\n", amount, this.id);
	}
	
	public void display() {
		System.out.println("--- Saving Account Details ---");
		System.out.println("Account ID: " + this.id);
		System.out.println("Holder Name: " + this.accountHolderName);
		System.out.println("Address: " + this.address);
		System.out.println("Minimum Balance Rule: " + this.minBalance);
		System.out.println("----------------------------");
	}
}
