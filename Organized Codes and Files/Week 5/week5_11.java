public class week5_11 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3 - i; j++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 2; i >= 1; i--){
			for (int j = 1; j <= 3 - i; j++)
				System.out.print(" ");
			for (int k = 3 - i; k < 3; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
