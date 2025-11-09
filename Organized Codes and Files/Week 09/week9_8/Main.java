package week9_8;

public class Main {
	public static void main(String[] args) {
		WashingMachine w = new WashingMachine("Bosch", 2200);
		System.out.println("Washing Machine:");
		w.displayInfo();
		w.turnOn();
		w.turnOff();
		
		System.out.println();
		
		Refrigerator fridge = new Refrigerator("Whirlpool", 180);
		System.out.println("Refrigerator: ");
		fridge.displayInfo();
		fridge.turnOn();
		fridge.turnOff();
	}
}
