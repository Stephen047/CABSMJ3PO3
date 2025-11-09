import java.util.Scanner;

public class week4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++)
			System.out.printf("%d x %d = %d\n", n, i, n*i);
	}
}
