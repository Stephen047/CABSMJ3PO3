package week12_1;

public class Main {
	public static int divide(int dividend, int divisor) {
		return dividend / divisor;
	}
	public static void main(String[] args) {
		for (int i = 3; i >= -3; i--) {
			
			try {
				int result = divide(100, i);
				System.out.println("Result of 100 / " + i + " = " + result);
			} catch (ArithmeticException e) {
				System.out.println("Error: Cannot divide by zero. Skipping i = " + i);
			}
		}
		System.out.println("Loop finished.");
	}
}