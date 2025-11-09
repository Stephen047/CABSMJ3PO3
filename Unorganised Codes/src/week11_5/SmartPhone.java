package week11_5;

public class SmartPhone implements SmartDevice{
	
	@Override
	public void connectWifi() {
		System.out.println("Connecting...");
	}
	
	@Override
	public void powerOn() {
		System.out.println("Booting...");
	}
}
