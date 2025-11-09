package week11_1;

public class Main {
	public static void main(String[] args) {
		Saving saving = new Saving();
		Current current = new Current();
		
		saving.deposit();
		saving.withdraw();
		saving.takeLoan();
		current.deposit();
		current.withdraw();
	}
}
