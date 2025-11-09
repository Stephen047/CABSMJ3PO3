package week9_4;

abstract class Account {
	int id;
	String accountHolderName;
	String address;
	
	public Account(int id, String name, String address) {
		this.id = id;
		this.accountHolderName = name;
		this.address = address;
	}
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
}

