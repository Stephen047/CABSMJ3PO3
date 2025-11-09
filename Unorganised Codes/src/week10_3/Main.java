package week10_3;

public class Main {
	public static void minMaxAdd(int a, int b) {
		System.out.println("Integer");
		System.out.println("Min: " + Math.min(a, b));
		System.out.println("Max: " + Math.max(a, b));
		System.out.println("Sum: " + (a + b));
	}
	public static void minMaxAdd(double a, double b) {
		System.out.println("Double (Real)");
		System.out.println("Min: " + Math.min(a, b));
		System.out.println("Max: " + Math.max(a, b));
		System.out.println("Sum: " + (a + b));
	}
	public static void minMaxAdd(char a, char b) {
		System.out.println("Character");
		System.out.println("Min: '" + (char)Math.min(a, b) + "'");
		System.out.println("Max: '" + (char)Math.max(a, b) + "'");
		System.out.println("Sum (as int): " + (a + b));
	}
	public static void main(String[] args) {
		minMaxAdd(10, 20);
		minMaxAdd(7.5, 3.2);
		minMaxAdd('B', 'X');
	}
}