package week11_1;

public class Saving implements Account{
	
	@Override
	public void deposit() {
		System.out.println("Depositing in Saving Account.");
	}
	
	@Override
	public void withdraw() {
		System.out.println("Withdrawing from Saving Account.");
	}
	
	@Override
	public void takeLoan() {
		Account.super.takeLoan();
	}
}
