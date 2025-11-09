package week9_4;

class Current extends Account {
	// Data member specific to Current account
	double maxWithdrawLimit;
	
	/**
	 * Constructor for the Current class.
	 */
	public Current(int id, String name, String address, double maxWithdrawal) {
		super(id, name, address); // Initialize parent class members
		this.maxWithdrawLimit = maxWithdrawal;
	}
	
	@Override
	public void deposit(double amount) {
		System.out.printf("Depositing %.2f into Current Account #%d\n", amount, this.id);
	}
	
	@Override
	public void withdraw(double amount) {
		System.out.printf("Withdrawing %.2f from Current Account #%d\n", amount, this.id);
	}
	
	public void display() {
		System.out.println("--- Current Account Details ---");
		System.out.println("Account ID: " + this.id);
		System.out.println("Holder Name: " + this.accountHolderName);
		System.out.println("Address: " + this.address);
		System.out.println("Max Withdrawal Limit: " + this.maxWithdrawLimit);
		System.out.println("-----------------------------");
	}
}
