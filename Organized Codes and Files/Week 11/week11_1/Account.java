package week11_1;

public interface Account {
	void deposit();
	void withdraw();
	static void aboutBank(){
		System.out.println("This is a bank.");
	}
	default void takeLoan(){
		System.out.println("You are eligible for a loan.");
	}
}
