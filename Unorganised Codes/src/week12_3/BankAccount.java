package week12_3;

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}
class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
		System.out.println("Account created with balance: " + this.balance);
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		System.out.println("Attempting to withdraw: " + amount);
		
		if (amount > this.balance) {
			throw new InsufficientFundsException("Withdrawal failed. Balance:" + this.balance);
		}
		this.balance -= amount;
		System.out.println("Success. New balance: " + this.balance);
	}
}