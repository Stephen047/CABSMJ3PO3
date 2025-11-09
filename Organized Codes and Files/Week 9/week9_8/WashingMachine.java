package week9_8;

class WashingMachine extends Appliance {
	public WashingMachine(String brand, int power) {
		super(brand, power);
	}
	
	@Override
	public void turnOn() {
		System.out.println("The washing machine is on.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("The washing machine is off.");
	}
}
