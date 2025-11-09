package week9_8;

abstract class Appliance {
	String brand;
	int power;
	
	public Appliance(String brand, int power) {
		this.brand = brand;
		this.power = power;
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
	
	public void displayInfo() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Power Consumption: " + this.power + "W");
	}
}
