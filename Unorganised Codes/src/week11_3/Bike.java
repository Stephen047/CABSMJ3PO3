package week11_3;

public interface Bike {
	void offer();
	default void details(){
		System.out.println("This bike costs 50k");
	}
}
