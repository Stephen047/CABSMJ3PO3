package week10_1;

public class Main {
	public static void main(String[] args) {
		
		// Create a Person object.
		// The constructor handles creating the Address and DateOfBirth objects.
		Person person1 = new Person(
				"Amit Kumar",
				"+91-9876543210",
				"123-B",
				"Kamla Nagar",
				"Agra",
				"Uttar Pradesh",
				15,
				8,
				1990
		);
		
		// Call the main display method of the Person class.
		person1.Display();
	}
}