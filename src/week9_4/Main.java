package week9_4;

public class Main {
	public static void main(String[] args) {
		
		Saving savingAccount = new Saving(101, "Shaheer", "AMU", 1000.0);
		
		Current currentAccount = new Current(202, "Shafin", "AMU", 100000.0);
		
		savingAccount.display();
		savingAccount.deposit(15000);
		savingAccount.withdraw(4500);
		
		System.out.println();
		
		currentAccount.display();
		currentAccount.deposit(50000);
		currentAccount.withdraw(25000);
	}
}
