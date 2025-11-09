package week10_2;

public class Edible {
	
	public static class Fruit {
		public static void fruitDetails() {
			System.out.println("Static Method (Fruit)");
		}
		public void fruitPackaging() {
			System.out.println("Non-Static Method (Fruit)");
		}
	}
	public static class Vegetable {
		public static void vegetableDetails() {
			System.out.println("Static Method (Vegetable)");
		}
		public void vegetablePackaging() {
			System.out.println("Non-Static Method (Vegetable)");
		}
	}
}
