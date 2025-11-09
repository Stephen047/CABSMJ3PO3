package week11_3;

public class BuySomething implements Bike,Scooty {
	@Override
	public void offer() {
		System.out.println("50 percent off");
	}
	
	@Override
	public void details() {
		Bike.super.details();
		Scooty.super.details();
	}
}
