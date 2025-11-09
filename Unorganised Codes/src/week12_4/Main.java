package week12_4;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class Main {
	public static void validateVoter(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("You must be 18 or older to vote.");
		}
		System.out.println("Your vote is registered.");
	}
	public static void main(String[] args) {
		try {
			validateVoter(25);
		} catch (InvalidAgeException e) {
			System.out.println("Error Caught: " + e.getMessage());
		}
		System.out.println();
		try {
			validateVoter(15);
		} catch (InvalidAgeException e) {
			System.out.println("Error Caught: " + e.getMessage());
		}
	}
}