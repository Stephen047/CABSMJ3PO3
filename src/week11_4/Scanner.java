package week11_4;

public interface Scanner {
	void connect();
	default void details(){
		System.out.println("This machine can scan");
	}
}
