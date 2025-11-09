package week11_4;

public class MultiFunctionMachine implements Printer, Scanner{
	@Override
	public void connect() {
		System.out.println("Connecting...");
	}
	
	@Override
	public void details() {
		Printer.super.details();
		Scanner.super.details();
	}
}
