package week9_9;

public class Main {
	public static void main(String[] args) {
		int number1 = 48;
		int number2 = 18;
		
		int gcd = MathOperations.findGCD(number1, number2);
		System.out.println("GCD: " + gcd);
		
		int lcm = MathOperations.findLCM(number1, number2);
		System.out.println("LCM: " + lcm);
	}
}
