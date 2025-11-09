package week8_1;

public class Main {
	public static void main(String[] args) {
		FRUIT apple = new FRUIT("Red", "Sweet");
		FRUIT banana = new FRUIT("Yellow");
		FRUIT grape = new FRUIT();
		
		System.out.println("Apple:");
		apple.display();
		System.out.println("Banana:");
		banana.display();
		System.out.println("Grape:");
		grape.display();
		
		apple.setDetails("Red", "Sweet", 6.99);
		banana.setDetails("Yellow", "Sweet", 3.99);
		grape.setDetails("Green", "Sour", 5.99);
		
		System.out.println("Apple:");
		apple.display();
		System.out.println("Banana:");
		banana.display();
		System.out.println("Grape:");
		grape.display();
	}
}
