package week11_1;

public class Current implements Account{
	
	@Override
	public void deposit() {
		System.out.println("Depositing in Current Account.");
	}
	
	@Override
	public void withdraw() {
		System.out.println("Withdrawing from Current Account.");
	}
}
