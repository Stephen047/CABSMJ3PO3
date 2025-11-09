package week9_3;

public class Main {
	public static void main(String[] args) {
		
		Account account1 = new Account(101, "Amit Sharma", "Agra, UP", 25000.0);
		
		System.out.println("Using non-static methods:");
		account1.displayDetails();
		account1.deposit(10000.0);
		account1.withdraw(5000.0);
		account1.displayDetails();
		
		System.out.println();
		
		System.out.println("Using static methods:");
		double p = 50000;
		double r = 7.5;
		double t = 5;
		
		double si = Account.calculateSimpleInterest(p, r, t);
		System.out.printf("Simple Interest for %.2f at %.2f%% for %.1f years is: %.2f\n", p, r, t, si);
		
		double ci = Account.calculateCompoundInterest(p, r, t);
		System.out.printf("Compound Interest for %.2f at %.2f%% for %.1f years (compounded annually) is: %.2f\n", p, r, t, ci);
	}
}