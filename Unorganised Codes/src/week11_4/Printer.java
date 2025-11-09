package week11_4;

public interface Printer {
	void connect();
	default void details(){
		System.out.println("This machine can print");
	}
}
