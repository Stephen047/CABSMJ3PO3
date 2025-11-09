package week8_2;

public class Main {
	public static void main(String[] args) {
		CAR porsche = new CAR("White", "911 GT3 RS");
		CAR mercedes = new CAR("Navy");
		CAR ferrari = new CAR();
		
		System.out.println("Porsche:");
		porsche.getDetails();
		System.out.println("Mercedes:");
		mercedes.getDetails();
		System.out.println("Ferrari:");
		ferrari.getDetails();
		
		porsche.setDetails("White", "911 GT3 RS", 100000);
		mercedes.setDetails("Navy", "1986 S Class", 150000);
		ferrari.setDetails("Red", "F40", 200000);
		
		System.out.println("Porsche:");
		porsche.display();
		System.out.println("Mercedes:");
		mercedes.display();
		System.out.println("Ferrari:");
		ferrari.display();
	}
}
