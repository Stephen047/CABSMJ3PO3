package week11_3;

public interface Scooty {
	void offer();
	default void details(){
		System.out.println("This scooty costs 45k");
	}
}
