package week9_8;

class Refrigerator extends Appliance {
	public Refrigerator(String brand, int power) {
		super(brand, power);
	}
	
	@Override
	public void turnOn() {
		System.out.println("The fridge is on.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("The fridge is off.");
	}
}
