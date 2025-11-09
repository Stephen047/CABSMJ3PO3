package week9_1;

public class Main {
	public static void main(String[] args) {
		Bus myBus = new Bus();
		myBus.display();
		myBus.cost();
		
		System.out.println();
		
		Train myTrain = new Train();
		myTrain.display();
		myTrain.cost();
	}
}