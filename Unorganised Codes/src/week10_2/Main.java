package week10_2;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("--- Demonstrating Fruit Class ---");
		Edible.Fruit.fruitDetails();
		
		Edible.Fruit myFruit = new Edible.Fruit();
		myFruit.fruitPackaging();
		
		System.out.println("\n--- Demonstrating Vegetable Class ---");
		Edible.Vegetable.vegetableDetails();
		
		Edible.Vegetable myVegetable = new Edible.Vegetable();
		myVegetable.vegetablePackaging();
	}
}