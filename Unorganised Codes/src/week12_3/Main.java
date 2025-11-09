package week12_3;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.0);
		try {
			account.withdraw(500.0);
			account.withdraw(800.0);
			System.out.println("This message will not be seen");
			
		} catch (InsufficientFundsException e) {
			System.out.println("Error Caught: " + e.getMessage());
		}
	}
}