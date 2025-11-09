public class week3_6 {
	public static void main(String[] args) {
		int a = 5, b = 10;
		System.out.printf("a = %d and b = %d\n", a, b);
		int temp = a;
		a = b; b = temp;
		System.out.printf("a = %d and b = %d", a, b);
	}
}
